package com.zjw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * @SessionAttributes  作用在类上
 *  用于多次执行控制器方法间的参数共享
 */
@Controller
@RequestMapping("sessionAttribute")
@SessionAttributes(names = {"name"})//把name的值存到session域对象中一份
public class SessionAttributeController {

    /**
     * 存值
     * @param model
     * @return
     */
    @RequestMapping("testPut")
    public String testPut(Model model){
        String name = "朱俊伟";
        model.addAttribute("name",name);
        System.out.println("put:" + name);
        return "success";
    }

    /**
     * 取值
     * @param modelMap
     * @return
     */
    @RequestMapping("testGet")
    public String testGet(ModelMap modelMap){
        String name = (String) modelMap.get("name");
        System.out.println("get:" + name);
        return "success";
    }

    /**
     * 删除
     * @param status
     * @return
     */
    @RequestMapping("testDel")
    public String testDel(SessionStatus status){
        status.setComplete();
        System.out.println("delete session");
        return "success";
    }
}
