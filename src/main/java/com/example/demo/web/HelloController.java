package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public Object hello(){
        return "HelloWorld";
    }

    @RequestMapping("/hello1")
    public Object hello1(){
        return "HelloWorld1";
    }

    @RequestMapping("/hello2")
    public Object hello2(){
        return "HelloWorld2";
    }
}
