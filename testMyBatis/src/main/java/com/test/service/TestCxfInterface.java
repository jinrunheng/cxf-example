package com.test.service;


import org.apache.cxf.rs.security.cors.CrossOriginResourceSharing;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @Author Dooby Kim
 * @Date 2024/1/22 9:24 下午
 * @Version 1.0
 */

public interface TestCxfInterface {
    @GET
    @Path("/test1")
    @Produces(MediaType.APPLICATION_JSON)
    @CrossOriginResourceSharing(
            allowAllOrigins = true,
            allowCredentials = true,
            allowHeaders = {"*"},
            maxAge = 1
    )
    String test1();
}
