package com.zjw.spring;

import com.zjw.dao.AccountDao;
import com.zjw.service.AccountService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 测试Sping中的Bean是否加载到容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestSpringBean {

    @Resource(name = "accountService")
    private AccountService accountService;

    @Resource(name = "accountDao")
    private AccountDao accountDao;


    @Test
    public void testService(){
        //打印地址，代表Service被加载到容器中
        System.out.println(accountService);
    }

    @Test
    public void testDao(){
        //打印地址，代表Dao被加载到容器中
        System.out.println(accountDao);
    }

}
