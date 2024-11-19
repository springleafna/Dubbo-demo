package com.springleaf.dubbo.service;

import com.springleaf.dubbo.api.DemoService;
import org.apache.dubbo.config.annotation.DubboService;


@DubboService
public class HelloServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return name;
    }
}
