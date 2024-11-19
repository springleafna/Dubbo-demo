package com.springleaf.dubbo.controller;

import com.springleaf.dubbo.api.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @DubboReference
    private DemoService helloService;

    @GetMapping("/hello")
    public String sayHello() {
        return helloService.sayHello("Tom") + ":Hello, Dubbo!";
    }
}
