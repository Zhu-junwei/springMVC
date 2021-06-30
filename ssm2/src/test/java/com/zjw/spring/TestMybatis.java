package com.zjw.spring;

import com.zjw.dao.AccountDao;
import com.zjw.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试mybatis层是否连通数据库
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestMybatis {

    @Resource(name = "accountDao")
    private AccountDao accountDao;


    /**
     * 测试mybatis是否可以查询到数据
     */
    @Test
    public void testDao(){
        List<Account> accountList = accountDao.findAll();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }
}
