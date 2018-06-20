package cn.abtion.blog.dto.response;

import cn.abtion.blog.domain.User;
import cn.abtion.blog.dto.response.models.UserInfoModel;

/**
 * @author abtion
 * @since 2018/6/20 12:58
 * email abtion@outlook.com
 */
public class UserLoginResponse {
    private String token;
    private UserInfoModel user;

    public UserLoginResponse(String token, User user) {
        this.token = token;
        this.user = new UserInfoModel(user);
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UserInfoModel getUser() {
        return user;
    }

    public void setUser(UserInfoModel user) {
        this.user = user;
    }
}
