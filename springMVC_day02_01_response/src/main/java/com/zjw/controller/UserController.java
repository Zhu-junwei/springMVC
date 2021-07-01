package com.zjw.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zjw.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString方法执行了。。。");
        User user = new User("朱俊伟","123456",18);
        model.addAttribute("user",user);
        return "success";
    }

    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("testVoid方法执行了。。。");
        //1、请求转发 不会再调用视图解析器，需要写完整的资源路径
//        request.getRequestDispatcher("/pages/success.jsp").forward(request,response);

        //2、重定向
//        response.sendRedirect(request.getContextPath()+"/index.jsp");
//        response.sendRedirect(request.getContextPath()+"/user/testVoid2");

        //3、直接打印
        //解决中文乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.print("hello,<br>");
        writer.print("<a href='#'>朱俊伟</a>。");
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){

        //创建ModelAndView
        ModelAndView mv = new ModelAndView();
        System.out.println("testModelAndView方法执行了。。。");
        //模拟从数据库中查询出User对象
        User user = new User();
        user.setUsername("朱俊伟");
        user.setPassword("123");
        user.setAge(18);
        //把user对象存储到mv对象中，也会把user对象存入到request对象中
        mv.addObject("user",user);
        //跳转到哪个页面
        mv.setViewName("success");
        return mv;
    }

    /**
     * 使用关键字的方式进行转发或者重定向，不会用到视图解析器
     * @return
     */
    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect(){
        System.out.println("testForwardOrRedirect方法执行了。。。");

        //请求转发
//        return "forward:/pages/success.jsp";

        //重定向 不用加项目名称
//        return "redirect:/index.jsp";
        return "redirect:/user/testString";
    }

    @RequestMapping("/testAjax")
    @ResponseBody
    public User testAjax(@RequestBody User user){
        System.out.println("testAjax方法执行了。。。。");
        System.out.println(user);
        User resUser = new User();
        resUser.setUsername("朱俊伟");
        resUser.setPassword("654321");
        resUser.setAge(19);
        return resUser;
    }

    @RequestMapping("/testJson1")
    @ResponseBody
    public User testJson1() {
        System.out.println("testJson1方法执行了。。。。");
        User resUser = new User();
        resUser.setUsername("朱俊伟");
        resUser.setPassword("654321");
        resUser.setAge(19);
        System.out.println(resUser);
        return resUser;
    }

    @ResponseBody
    @RequestMapping(value = "/testJson2" , produces = {"application/json;charset=UTF-8"})
    public String testJson2() throws JsonProcessingException {
        System.out.println("testJson2方法执行了。。。。");
        User resUser = new User();
        resUser.setUsername("朱俊伟");
        resUser.setPassword("654321");
        resUser.setAge(19);
        System.out.println(resUser);
        ObjectMapper objectMapper = new ObjectMapper();
        String userJson = objectMapper.writeValueAsString(resUser);
        return userJson;
    }

}
