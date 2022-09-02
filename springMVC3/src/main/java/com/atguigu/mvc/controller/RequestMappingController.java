package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")//RequestMapping作用到类上表示给类里的映射请求方法添加了一个开始路径（就是文件中的上层路径）
public class RequestMappingController {
/*    @RequestMapping("/")
    public String query(){
        return "index";
    }*///不能在两个不同的控制器处理同一个请求

    @RequestMapping(value = {"/testRequestMapping","test"},method = RequestMethod.GET)//符合value请求数组里的任意一个请求并且请求方式为get的请求才能被接收到，当然method是数组形式，可以包括多个请求方式
    public String query(){
        return "success";
    }

    @GetMapping("/set")
    public String set(){
        return "success";
    }
    @RequestMapping(value = "/testPut",method = RequestMethod.PUT)
    public String testPut(){
        return "success";
    }
    @RequestMapping(value = "/testParamsAndHeaders",params = {"username"})//若参数前加了一个！，如params = {"！username"}，表示请求中不能有username，paras参数数组还需要注意的是必须满足数组里的每一个条件，与value和method属性不同
    public String testParamsAndHeaders(){
        return "success";
    }
    @RequestMapping(value = "/testHeaders",params = {"username"},headers = "Host=localhost:8081")//headers用法与params用法类似
    public String testHeaders(){
        return "success";
    }
    @RequestMapping("/a?a/testAnt")//?表示任意一个字符，*表示表示任意的0个或多个字符，**：表示任意的一层或多层目录，只能使用/**/xxx的方式
    public String testAnt(){
        return "success";
    }
    @RequestMapping("/testpath/{id}/{username}")
    public String testPath (@PathVariable("id")Integer id,@PathVariable("username")String username){//通过@PathVariable注解，将占位符所表示的数据赋值给控制器方法的形参
        System.out.println("id:"+id+"username:"+username);
        return "success";
    }
}
