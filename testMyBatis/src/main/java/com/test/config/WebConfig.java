package com.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author Dooby Kim
 * @Date 2024/1/22 7:57 下午
 * @Version 1.0
 */
// @Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("localhost:8080", "test:8080")
                .allowedMethods("GET", "POST")
                .maxAge(100000)
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
