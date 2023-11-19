package com.zjw.service;

import com.zjw.domain.Account;

import java.util.List;

/**
 * @author 朱俊伟
 */
public interface AccountService {

    /**
     * 查询所有账户
     * @return list
     */
    public List<Account> findAll();

    /**
     * 查询账户信息
     * @param account 账户
     */
    public void saveAccount(Account account);
}
