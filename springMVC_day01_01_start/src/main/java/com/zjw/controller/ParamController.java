package com.zjw.controller;

import com.zjw.domain.Account;
import com.zjw.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 参数绑定
 */
@Controller
@RequestMapping("param")
public class ParamController {

    /**
     * 普通参数
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("testParam")
    public String testParam(String username,String password){
        System.out.println(username);
        System.out.println(password);
        return "success";
    }

    /**
     * 对象参数
     * @param account
     * @return
     */
    @RequestMapping("saveAccount")
    public String saveAccount(Account account){
        System.out.println(account);
        return "success";
    }

    /**
     * 自定义类型转发
     *  日期类型
     * @param user
     * @return
     */
    @RequestMapping("saveUser")
    public String saveUser(User user){
        System.out.println(user);
        return "success";
    }

    @RequestMapping("testServlet")
    public String testServlet(HttpServletRequest request , HttpServletResponse response){
        System.out.println(request);

        //返回客户端发出请求时的完整URL
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);

        //返回请求行中的参数部分
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURL);

        //方法返回请求行中的参数部分（参数名+值）
        String queryString = request.getQueryString();
        System.out.println(queryString);

        //返回发出请求的客户机的完整主机名
        String remoteHost = request.getRemoteHost();
        System.out.println(remoteHost);

        //返回发出请求的客户机的IP地址
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);

        //返回请求URL中的额外路径信息。额外路径信息是请求URL中的位于Servlet的路径之后和查询参数之前的内容，它以"/"开头
        String pathInfo = request.getPathInfo();
        System.out.println(pathInfo);

        //返回客户机所使用的网络端口号
        int remotePort = request.getRemotePort();
        System.out.println(remotePort);

        //返回WEB服务器的IP地址
        String localAddr = request.getLocalAddr();
        System.out.println(localAddr);

        //返回WEB服务器的主机名
        String localName = request.getLocalName();
        System.out.println(localName);

        System.out.println(response);
        return "success";
    }
}
