package com.example.demo.controleer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class ControllerTest {

    @GetMapping
    public String check(){
        return "testing my controller";
    }


}
