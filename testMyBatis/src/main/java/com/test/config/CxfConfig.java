package com.test.config;

import com.test.filter.CustomCorsFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Dooby Kim
 * @Date 2024/1/22 8:16 下午
 * @Version 1.0
 */
@Configuration
public class CxfConfig {
    @Bean
    public CustomCorsFilter customCorsFilter() {
        return new CustomCorsFilter();
    }
}
