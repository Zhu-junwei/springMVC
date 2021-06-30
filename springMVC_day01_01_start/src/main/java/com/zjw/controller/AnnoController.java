package com.zjw.controller;

import com.zjw.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/anno")
public class AnnoController {

    /**
     * RequestParam注解
     *  作用：把请求中的指定名称的参数传递给控制器中的形参赋值
     *      testRequestParam(@RequestParam(name = "name",required = true) String username)
     *  属性：
     *      value:请求参数中的名称
     *      required:请求参数中是否必须提供此参数，默认值是true,必须提供
     */
    @RequestMapping(path = "/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username){
        System.out.println(username);
        return "success";
    }

    /**
     * RequestBody注解
     *   作用：用于获取请求体的内容（注意：get方法不可以）
     *      saveUser(@RequestBody String body)
     *   属性：
     *      required：是否必须有请求体，默认是true
     */
    @RequestMapping("/saveUser")
    public String saveUser(@RequestBody String body){
        System.out.println("@RequestBody-->"+body);
        return "success";
    }

    /*
        PathVariable注解
            作用：拥有绑定url中的占位符的。例如：url中有/delete/{id}，{id}就是占位符
            属性：
                value:指定url中的占位符名称

     */
    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") String id){
        System.out.println(id);
        return "success";
    }

    /*
        RequestHeader注解
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader("Cookie") String header){
        System.out.println(header);
        return "success";
    }

    /*
        CookieValue注解
            作用：用于获取指定cookie的名称的值
        属性:
            value：cookie的名称
     */
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String header){
        System.out.println(header);
        return "success";
    }

    /*
        ModelAttribute注解
        作用
            出现在方法上：表示当前方法会在控制器方法执行前线执行。
            出现在参数上：获取指定的数据给参数赋值。
        应用场景
            当提交表单数据不是完整的实体数据时，保证没有提交的字段使用数据库原来的数据。
     */
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user){
        System.out.println(user);
        return "success";
    }

    /**
     * ModelAttribute注解
     *  会在RequestMapping注解执行之前执行
     */
//    @ModelAttribute
    public void showUser(String uname, Map<String,User> map){
        User user = new User();
        user.setUname(uname);
        user.setAge(18);
        user.setDate(new Date());
        map.put("abc",user);
        System.out.println("showUser方法执行了。。。"+user);

    }
}
