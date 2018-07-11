package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("test1*************");
        return "index";
    }
    @RequestMapping("/param")
    public String testParam(String name){
        return "param";
    }
}
