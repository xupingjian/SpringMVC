package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
/*    @RequestMapping("/")
    public String index(){
        return "index";
    }*/
    //可以等价在springMVC中配置视图控制器<mvc:view-controller path="/" view-name="index"></mvc:view-controller>
    @RequestMapping("/test_view")
    public String test(){
        return "test_view";
    }

    @RequestMapping("/testExceptionHandler")
    public String testExceptionHandler(){
        System.out.println(1/0);
        return "success";
    }
}
