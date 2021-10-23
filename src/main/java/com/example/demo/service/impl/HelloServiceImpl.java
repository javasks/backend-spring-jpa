package com.example.demo.service.impl;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl {


    public String hello() {
        return "hello you are testing your controller";
    }
}