package com.zjw.service.impl;

import com.zjw.dao.AccountDao;
import com.zjw.domain.Account;
import com.zjw.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao ;

    @Override
    public List<Account> findAll() {
        System.out.println("AccountServiceImpl....findAll方法...");
        return accountDao.findAll();
    }

    @Override
//    @Transactional    //我忘记加这个是为了做什么了，发现注释了事务没有受到影响
    public void saveAccount(Account account) {
        System.out.println("AccountServiceImpl....saveAccount方法...");
        accountDao.saveAccount(account);
        int a = 1/0;

    }
}
