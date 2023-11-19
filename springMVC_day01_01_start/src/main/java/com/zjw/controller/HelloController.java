package com.zjw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 控制器类
 * @author 朱俊伟
 */
@Controller
@RequestMapping(path = "/user")
public class HelloController {

    /**
     *
     * RequestMapping 用于建立请求URL和处理请求方法之间的对应关系。
     * path：
     * value：
     *  作用：要调用的方法
     * method:
     *  请求的方式。
     *      RequestMethod.GET,RequestMethod.POST
     * @return 跳转路径
     */
    @RequestMapping(path = {"hello","/hello2","/hello3"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String sayHello(){
        System.out.println("Hello SpringMVC");
//        return "success";
        return "text";
    }

    /**
     *  params：用于指定限制请求参数的条件。它支持简单的表达式。要求请求参数的key和value必须和配置的一模一样
     *      params = {"username"} 表示请求参数必须要有username
     *
     *
     * @return
     */
    @RequestMapping(path = "testParams" , params = {"username"})
    public String testParams(){
        System.out.println("testParams");
        return "success";
    }

    /**
     * params = {"username=aaa"} 标识username必须等于aaa
     * @return
     */
    @RequestMapping(path = "testParams2" , params = {"username=aaa"})
    public String testParams2(){
        System.out.println("testParams2..username属性必须有值");
        return "success";
    }

    /**
     * headers:用于指定限制请求消息头的条件
     *  headers ={"Accept"} 表示请求头要有Accept参数
     * @return
     */
    @RequestMapping(path = "testHeaders" , headers ={"Accept"})
    public String testHeaders(){
        System.out.println("testHeaders");
        return "success";
    }


}
