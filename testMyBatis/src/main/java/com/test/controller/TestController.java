package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Dooby Kim
 * @Date 2024/1/22 7:13 下午
 * @Version 1.0
 */
@RestController
public class TestController {

    // @CrossOrigin(value = "http://localhost", methods = {RequestMethod.GET})

    @GetMapping("/test")
    public String test() {
        return "hello";
    }
}
