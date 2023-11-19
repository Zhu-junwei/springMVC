package com.zjw.controller;

import com.zjw.domain.Account;
import com.zjw.domain.User;
import com.zjw.utils.ServletInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 参数绑定
 * @author 朱俊伟
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    /**
     * 普通参数
     * @param username 用户名
     * @param password 密码
     * @return 跳转地址
     */
    @RequestMapping("/testParam")
    public String testParam(String username,String password){
        System.out.println("执行了...");
        System.out.println(username);
        System.out.println(password);
        return "success";
    }

    /**
     * 对象参数
     * @param account 账户对象
     * @return 跳转地址
     */
    @RequestMapping("saveAccount")
    public String saveAccount(Account account){
        System.out.println(account);
        return "success";
    }

    /**
     * 自定义类型转发
     *  日期类型
     * @param user 用户对象
     * @return 跳转地址
     */
    @RequestMapping("saveUser")
    public String saveUser(User user){
        System.out.println(user);
        return "success";
    }

    /**
     * 获取Servlet原生的api
     * @param request HttpServletRequest
     * @param response HttpServletResponse
     * @return 跳转地址
     */
    @RequestMapping("testServlet")
    public String testServlet(HttpServletRequest request , HttpServletResponse response){
        System.out.println(request);
        System.out.println(response);
        //打印request信息
        ServletInfo.requestInfo(request);
        //获取HttpSession对象
        HttpSession session = request.getSession();
        System.out.println(session);
        //获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);

        return "success";
    }
}
