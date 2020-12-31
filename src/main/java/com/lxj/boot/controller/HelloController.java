package com.lxj.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String helloWorld(@RequestParam("name") String name){
        return "This is a SpringBoot2 Hello World!"+name;
    }
}
