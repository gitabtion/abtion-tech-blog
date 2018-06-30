package cn.abtion.blog.interceptors;

import cn.abtion.blog.domain.User;
import cn.abtion.blog.exception.user.NeedLoginException;
import cn.abtion.blog.service.TokenService;
import cn.abtion.blog.service.UserService;
import org.apache.ibatis.plugin.Intercepts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author abtion
 * @since 2018/4/26 16:27
 * email abtion@outlook.com
 */
@Component
public class TokenInterceptor implements HandlerInterceptor {
    @Autowired
    private TokenService tokenService;

    @Autowired
    private UserService userService;

    private ArrayList<String> unCheckUrlsRegex = new ArrayList<>() {{

    }};

    private ArrayList<String> unCheckUrlNormal = new ArrayList<>() {{
        add("/user/register");
        add("/user/login");
        add("/error");
    }};

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String token = httpServletRequest.getHeader("token");
        String url = httpServletRequest.getRequestURI();

        if (httpServletRequest.getMethod().equals("OPTIONS")) {
            return true;
        }

        for (String u:unCheckUrlsRegex) {
            Pattern pattern = Pattern.compile(u);
            Matcher matcher = pattern.matcher(url);
            if (matcher.matches()) {
                return true;
            }
        }

        for (String u:unCheckUrlNormal) {
            if (url.equals(u)) {
                return true;
            }
        }

        long userId = tokenService.checkToken(token);

        if (userId == -1) {
            throw new NeedLoginException();
        }

        User user = userService.getUserById(userId);
        System.out.println(user);
        httpServletRequest.setAttribute("user",user);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle========================");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("afterCompletion================");
    }

}
