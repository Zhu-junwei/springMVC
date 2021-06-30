package com.zjw.dao;

import com.zjw.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试AccountDao层
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestAccountDao {

    @Resource(name = "accountDao")
    private AccountDao accountDao;


    /**
     * 测试是否可以查询到数据
     *
     * 通过
     */
    @Test
    public void testFindAll(){
        List<Account> accountList = accountDao.findAll();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    /**
     * 测试保存数据，是否返回id,数据库是否有数据。
     *
     *
     */
    @Test
    public void testSaveAccount(){
        Account account = new Account();
        account.setName("张三");
        account.setMoney(99.99);
        accountDao.saveAccount(account);
        System.out.println(account);
    }

}
