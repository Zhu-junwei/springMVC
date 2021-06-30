package com.zjw.controller;

import com.zjw.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("testException")
    public String testException() throws Exception {
        System.out.println("testException方法执行了。。。。");
        try {
            int a = 1/0 ;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("查询所有用户出现错误了。。。");
        }
        return "success";
    }
}
