package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/testThymeleafView")
    public String testThymeleafView(){
        return "success";
    }
    @RequestMapping("/testForward")
    //实现内部转发到/testThymeleafView请求,而不是转发去testThymeleafView.html页面
    public String testForward(){
        return "forward:/testThymeleafView";
    }

    @RequestMapping("/testRedirect")
    //实现重定向到/testThymeleafView请求,而不是重定向去testThymeleafView.html页面
    public String testRedirect(){
        return "redirect:/testThymeleafView";
    }
}
