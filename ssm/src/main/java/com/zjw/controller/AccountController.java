package com.zjw.controller;

import com.zjw.domain.Account;
import com.zjw.exception.SysException;
import com.zjw.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 账户Web
 */

@Controller
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("AccountController...findAll方法...");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/saveAccount")
    public void saveAccount(Account account, HttpServletRequest request , HttpServletResponse response) throws Exception {
        try {
            System.out.println("AccountController...saveAccount...");
            accountService.saveAccount(account);
            response.sendRedirect(request.getContextPath()+"/account/findAll");
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("保存用户出错了。。。");
        }
    }
}
