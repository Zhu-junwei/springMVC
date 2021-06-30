package com.zjw.spring;

import com.zjw.domain.Account;
import com.zjw.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试service层往下
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestServiceMybatis {

    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void testServiceMybatis(){
        //可以查出数据，Service层没有问题
        List<Account> accountList = accountService.findAll();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }
}
