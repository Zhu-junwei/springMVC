package com.zjw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 朱俊伟
 * @date 2021/07/01
 */
@Controller
public class HelloController {

    @RequestMapping(path = {"hello*"})
    public String hello(){
        System.out.println("This is hello method.");
        return "success";
    }
}
