package com.zjw.dao;

import com.zjw.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
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
     * @return 账户集合
     */
    @Select("SELECT * FROM account")
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @param account 账户对象
     */
    @Insert("INSERT INTO account(name,money) VALUES (#{name},#{money})")
    public void saveAccount(Account account);

}
