package cn.abtion.blog.controller;

import cn.abtion.blog.common.Response;
import cn.abtion.blog.common.Utils;
import cn.abtion.blog.domain.Comment;
import cn.abtion.blog.domain.User;
import cn.abtion.blog.dto.request.CreateCommentRequest;
import cn.abtion.blog.exception.BaseException;
import cn.abtion.blog.exception.UnknownException;
import cn.abtion.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * @author abtion
 * @since 2018/7/2 11:25
 * email abtion@outlook.com
 */
@RestController
@RequestMapping("/comments")
public class CommentsController {
    @Autowired
    CommentService commentService;

    @GetMapping("/{essayId}")
    public Response getCommentsByEssayId(@PathVariable long essayId){
        return new Response(0,commentService.getCommentsByEssayId(essayId));
    }

    @PostMapping("/create")
    public Response createComment(@RequestBody @Valid CreateCommentRequest createCommentRequest, HttpServletRequest request)throws BaseException {
        User user = (User) request.getAttribute("user");
        Comment comment = new Comment();
        comment.setContent(createCommentRequest.getContent());
        comment.setEssayId(createCommentRequest.getEssayId());
        comment.setUserId(user.getId());
        long timestamp = Utils.createTimestamp();
        comment.setCreateAt(timestamp);
        if (!commentService.createComment(comment)){
            throw new UnknownException("评论失败");
        }
        return new Response(0,commentService.getCommentsByEssayId(comment.getEssayId()));
    }
}
