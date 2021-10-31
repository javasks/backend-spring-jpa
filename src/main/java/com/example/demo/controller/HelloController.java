package com.example.demo.controleer;

import com.example.demo.service.impl.HelloServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private HelloServiceImpl helloService;

    public HelloController(HelloServiceImpl helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String sayHello(){

        return helloService.hello();
    }

}
