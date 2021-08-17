package com.example.toron.common.config.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class StaticResourceConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //resource가 추가 될 때마다 경로를 지정 해줘야 함.
        //static/ 밑으로 적음됨
        registry.addResourceHandler("/css/**",
                "/js/**" ,
                "/ckeditor/**"
                )
                .addResourceLocations("classpath:/static/css/",
                        "classpath:/static/js/" ,
                        "classpath:/static/ckeditor/");
    }
}
