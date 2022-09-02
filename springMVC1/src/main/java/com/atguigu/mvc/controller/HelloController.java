package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    // "/"-->/WEB-INF/templates/index.html
    //请求localhost:8080/springMVC/
    @RequestMapping( "/")
    public String query(){
        //返回视图名称
        return "index";
    }
    //请求localhost:8080/springMVC/target
    @RequestMapping(value = "/target")
    public String toTarget(){
        return "target";
    }
}
