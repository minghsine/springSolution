package com.study.minghsin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/com")
@Slf4j
public class HelloController {

    @PostMapping("/hello")
    public String hello(){
        log.info("now a request is coming");

        //测试直接返回结果的注释
        return "hello from springSolution";
    }

}
