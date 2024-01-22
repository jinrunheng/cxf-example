package com.test.filter;

import org.apache.cxf.rs.security.cors.CrossOriginResourceSharingFilter;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.PreMatching;

/**
 * @Author Dooby Kim
 * @Date 2024/1/22 8:27 下午
 * @Version 1.0
 */
@PreMatching
@Priority(9999)
// @Component
public class CustomCorsFilter extends CrossOriginResourceSharingFilter {

    @Override
    public void filter(ContainerRequestContext context) {
        System.out.println("test CrossOriginResourceSharingFilter");
        super.filter(context);
    }
}
