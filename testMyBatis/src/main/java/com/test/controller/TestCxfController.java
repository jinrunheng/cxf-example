package com.test.controller;

import com.test.service.TestCxfInterface;
import org.springframework.stereotype.Component;

/**
 * @Author Dooby Kim
 * @Date 2024/1/22 8:53 下午
 * @Version 1.0
 */
@Component
public class TestCxfController implements TestCxfInterface {

    // @CrossOrigin(value = "http://localhost", methods = {RequestMethod.GET})
    @Override
    public String test1() {
        return "test1";
    }
}
