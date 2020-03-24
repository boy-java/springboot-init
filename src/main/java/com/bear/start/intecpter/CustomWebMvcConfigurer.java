package com.bear.start.intecpter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CustomWebMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LocalIntecpter()).addPathPatterns("/api/*");
        //registry.addInterceptor(new LocalIntecpter2()).addPathPatterns("/api/*");//再增加一个拦截器
       // registry.addInterceptor(new LocalIntecpter()).addPathPatterns("/api/*").excludePathPatterns("/api/*/xx");//xx不想被拦截
    }
}
