package com.study.minghsin.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/com")
public class HelloController {

    @PostMapping("/hello")
    public String hello(){
        return "hello from springSolution";
    }

}
