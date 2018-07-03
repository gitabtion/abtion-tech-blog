package cn.abtion.blog.controller;

import cn.abtion.blog.common.Response;
import cn.abtion.blog.common.Utils;
import cn.abtion.blog.domain.Essay;
import cn.abtion.blog.domain.User;
import cn.abtion.blog.dto.request.CreateEssayRequest;
import cn.abtion.blog.exception.BaseException;
import cn.abtion.blog.exception.UnknownException;
import cn.abtion.blog.exception.general.PermissionDeniedException;
import cn.abtion.blog.exception.general.ResourceNotExistException;
import cn.abtion.blog.service.EssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
/**
 * @author abtion
 * @since 2018/6/23 21:08
 * email abtion@outlook.com
 */
@RestController
@RequestMapping("/essay")
public class EssayController {
    @Autowired
    EssayService essayService;

    @GetMapping("/{id}")
    public Response getEssay(@PathVariable long id) throws BaseException {
        Essay essay = essayService.getEssay(id);
        if (essay==null){
            throw new ResourceNotExistException("文章");
        }
        essay.setViewNum(essay.getViewNum()+1);
        essayService.updateEssay(essay);
        return new Response(0, essay);
    }

    @PostMapping("/update")
    public Response updateEssay(@RequestBody @Valid Essay essay, HttpServletRequest request) throws BaseException {
        User user = (User) request.getAttribute("user");
        if (user.getId() != essay.getAuthorId() && user.getType() > 1) {
            throw new PermissionDeniedException();
        }
        long timestamp = Utils.createTimestamp();
        essay.setUpdateAt(timestamp);
        if (!essayService.updateEssay(essay)) {
            throw new UnknownException("文章更新失败");
        }
        return new Response(0, essay.getId());
    }

    @PostMapping("/create")
    public Response createEssay(@RequestBody @Valid CreateEssayRequest createEssayRequest, HttpServletRequest request) throws BaseException {
        User user = (User) request.getAttribute("user");
        Essay essay = new Essay();
        essay.setAuthorId(user.getId());
        essay.setContent(createEssayRequest.getContent());
        essay.setFlag(createEssayRequest.getFlag());
        essay.setName(createEssayRequest.getName());
        essay.setTag(createEssayRequest.getTag());
        essay.setViewNum(0);
        long timestamp = Utils.createTimestamp();
        essay.setCreateAt(timestamp);
        essay.setUpdateAt(timestamp);

        if (!essayService.createEssay(essay)){
            throw new UnknownException("文章创建失败");
        }
        return new Response(0,essay.getId());
    }
    @GetMapping("/user/{authorId}")
    public Response getUserEssays(@RequestParam(defaultValue = "1",required = false) int page,
                                  @RequestParam(defaultValue = "20",required = false) int size,
                                  @PathVariable long authorId)throws BaseException{
        return new Response(0,essayService.getUserEssays(page,size,authorId));
    }

    @GetMapping("/most-view")
    public Response getMostViewEssays()throws BaseException{
        return new Response(0,essayService.getMostViewEssays(30));
    }

}
