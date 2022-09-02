package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {
    @RequestMapping(value = "/")
    public String query(){
        return "index";
    }
    @RequestMapping("/param")
    public String param(){
        return "test_param";
    }

}
