package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

@Controller
public class ParamController {

    @RequestMapping("/testServletAPI")
    //形参位置的request表示当前请求
    public String testServletAPI(HttpServletRequest request){
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username+",password"+password);
        return "success";
    }
    @RequestMapping("/testParam")
    public String testParam(@RequestParam(value="user-name",required = false,defaultValue = "hehe") String username, String password, String[] hobby,
                            @RequestHeader(value = "sayhaha" ,required = true,defaultValue = "haha") String host,
                            @CookieValue("JSESSIONID") String JSESSIONID){//通过控制器形参赋值只要保证请求参数名与控制器形参相同，就会自动把请求参数值传递给控制器形参
        //若请求参数名与控制器方法参数名不一致，可以通过@RequestParam注解将请求参数和控制器方法的形参创建映射关系,required：设置是否必须传输此请求参数，默认值为true
        System.out.println("username:"+username+",password:"+password+",hobby"+ Arrays.toString(hobby));//对于请求参数中出现多个同名的请求参数，可以用参数名（返回的参数值会被逗号隔开）或参数名数组接受
        System.out.println("host:"+host);
        System.out.println("JSESSIONID:"+JSESSIONID);
        return "success";
    }
    @RequestMapping("/testBean")
    public String testBean(User user){
        System.out.println(user);
        return "success";
    }
}
