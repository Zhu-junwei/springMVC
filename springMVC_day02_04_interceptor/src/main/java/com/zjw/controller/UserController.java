package com.zjw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 朱俊伟
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("testInterceptor")
    public String testInterceptor(){
        System.out.println("UserController testInterceptor方法执行了。。");
        return "success";
    }

}
