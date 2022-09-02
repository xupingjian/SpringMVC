package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HttpController {
@RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody){
        System.out.println(requestBody);
        return "success";
}
@RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity){
//    当前requestEntity表示整个请求报文的信息
        System.out.println("请求头："+requestEntity.getHeaders());
        System.out.println("请求体："+requestEntity.getBody());
        return "success";
}
//通过serletAPI的response对象响应浏览器数据
@RequestMapping("/testResponse")
    public void testResponse(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello,response");//将print内容作为响应报文的响应体响应到浏览器页面，也会发生页面跳转
}

//通过@ResponseBody响应浏览器数据
@RequestMapping("/testResponseBody")
@ResponseBody
    public String testResponseBody(){
        return "success";//将return内容当作响应体响应到浏览器页面
}
@RequestMapping("/testResponseUser")
@ResponseBody
    public User testResponseUser(){
        return new User(1001,"jack","123",23,"男");
    }
@RequestMapping("/testAxios")
@ResponseBody
public String testAxios(String username,String password){
    System.out.println(username+","+password);
    return "hello,axios";
}
}
