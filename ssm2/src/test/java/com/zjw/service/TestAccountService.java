package com.zjw.service;

import org.junit.Test;

import javax.annotation.Resource;

/**
 * 测试AccountService
 */
public class TestAccountService {

    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void testService(){
        //打印地址，代表Service被加载到容器中
        System.out.println(accountService);
    }

}