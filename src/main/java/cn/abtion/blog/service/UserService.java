package cn.abtion.blog.service;

import cn.abtion.blog.common.Encrypt;
import cn.abtion.blog.domain.User;
import cn.abtion.blog.dto.response.UserLoginResponse;
import cn.abtion.blog.exception.BaseException;
import cn.abtion.blog.exception.general.PasswordException;
import cn.abtion.blog.exception.general.ResourceExistedException;
import cn.abtion.blog.exception.general.ResourceNotExistException;
import cn.abtion.blog.mappers.TokenMapper;
import cn.abtion.blog.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author abtion
 * @since 2018/6/20 12:56
 * email abtion@outlook.com
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private TokenService tokenService;

    public UserLoginResponse login(String name,String password,int client,String ip) throws BaseException{
        User user = userMapper.getUserByName(name);
        if (user ==null){
            throw  new ResourceNotExistException("用户");
        }else if(!Encrypt.check(password,user.getPassword())){
            throw new PasswordException();
        }
        String token = tokenService.createToken(user.getId(),client,ip);
        return new UserLoginResponse(token,user);
    }

    public void register(User user) throws BaseException{
        if (userMapper.getUserByName(user.getName())!=null){
            throw new ResourceExistedException("用户");
        }
        user.setPassword(Encrypt.encrypt(user.getPassword()));
        userMapper.createUser(user);
    }
    public User getUserById(long userId) {
        return userMapper.getUserById(userId);
    }

    public boolean updateUser(User user) {
        return userMapper.updateUser(user) == 1;
    }

}
