package cn.abtion.blog.controller;

import cn.abtion.blog.common.Encrypt;
import cn.abtion.blog.common.Response;
import cn.abtion.blog.common.Utils;
import cn.abtion.blog.domain.User;
import cn.abtion.blog.dto.request.UpdatePasswordRequest;
import cn.abtion.blog.dto.request.UpdateUserInfoRequest;
import cn.abtion.blog.dto.request.UserLoginRequest;
import cn.abtion.blog.dto.request.UserRegisterRequest;
import cn.abtion.blog.dto.response.UserLoginResponse;
import cn.abtion.blog.dto.response.models.UserInfoModel;
import cn.abtion.blog.exception.BaseException;
import cn.abtion.blog.exception.UnknownException;
import cn.abtion.blog.exception.general.FormValidatorException;
import cn.abtion.blog.exception.general.PasswordException;
import cn.abtion.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * @author abtion
 * @since 2018/6/20 14:46
 * email abtion@outlook.com
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/{userId}/info")
    public Response getUserInfo(@PathVariable long userId) {
        User user = userService.getUserById(userId);
        return new Response(0, new UserInfoModel(user));
    }

    @PostMapping("/register")
    public Response register(@RequestBody @Valid UserRegisterRequest registerRequest, BindingResult bindingResult) throws BaseException {
        if (bindingResult.hasErrors()) {
            throw new FormValidatorException(bindingResult);
        }
        User user = new User();
        user.setName(registerRequest.getName());
        user.setPassword(registerRequest.getPassword());
        user.setSex(registerRequest.getSex());
        user.setSignature(registerRequest.getSignature());
        user.setType(2);
        long timestamp = Utils.createTimestamp();
        user.setCreateAt(timestamp);
        user.setUpdateAt(timestamp);

        userService.register(user);

        return new Response(0,user.getId());
    }

    @PostMapping("/login")
    public Response login(HttpServletRequest request, @RequestBody @Valid UserLoginRequest loginRequest, BindingResult bindingResult) throws BaseException {
        if (bindingResult.hasErrors()) {
            throw new FormValidatorException(bindingResult);
        }

        UserLoginResponse response = userService.login(loginRequest.getName(),loginRequest.getPassword(),loginRequest.getClient(),request.getRemoteHost());

        return new Response(0,response);
    }

    @GetMapping("/me")
    public Response getMine(HttpServletRequest request) {
        User user = (User)request.getAttribute("user");
        return new Response(0,new UserInfoModel(user));
    }

    @PostMapping("/update")
    public Response updateUserInfo(@RequestBody @Valid UpdateUserInfoRequest updateUserInfoRequest,HttpServletRequest request)throws BaseException{
        User user = (User)request.getAttribute("user");
        user.setName(updateUserInfoRequest.getName());
        user.setSex(updateUserInfoRequest.getSex());
        user.setSignature(updateUserInfoRequest.getSignature());
        user.setAddOn(updateUserInfoRequest.getAddOn());
        user.setAvatar(updateUserInfoRequest.getAvatar());
        if (!userService.updateUser(user)){
            throw new UnknownException("更新用户信息失败");
        }
        return new Response(0,null);
    }

   @PostMapping("/password")
   public Response updatePassword(@RequestBody @Valid UpdatePasswordRequest updatePasswordRequest,HttpServletRequest request)throws BaseException{
       User user = (User)request.getAttribute("user");
       String old = Encrypt.encrypt(updatePasswordRequest.getOldPassword());
       System.out.println(old);
       System.out.println(user.getPassword());
       if (!old.equals(user.getPassword())) {
           throw new PasswordException();
       }
       user.setPassword(Encrypt.encrypt(updatePasswordRequest.getNewPassword()));
       if (!userService.updateUser(user)) {
           throw new UnknownException("更新用户信息失败");
       }
       return new Response(0,null);

   }

}
