package cn.abtion.blog.config;

import cn.abtion.blog.interceptors.CorsInterceptor;
import cn.abtion.blog.interceptors.TokenInterceptor;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author abtion
 * @since 2018/6/29 15:07
 * email abtion@outlook.com
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Autowired
    CorsInterceptor corsInterceptor;
    @Autowired
    TokenInterceptor tokenInterceptor;


    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(corsInterceptor);
        System.out.println("add cos inter ===================");
        registry.addInterceptor(tokenInterceptor);
        super.addInterceptors(registry);
    }
}
