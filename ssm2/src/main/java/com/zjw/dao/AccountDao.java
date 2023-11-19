package com.zjw.dao;

import com.zjw.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户dao接口
 * @author 朱俊伟
 */
@Repository
public interface AccountDao {

    /**
     * 查询所有账户
     * @return 账户List集合
     */
    List<Account> findAll();

    /**
     * 保存账户信息
     * @param account 账户信息
     */
    void saveAccount(Account account);

}
