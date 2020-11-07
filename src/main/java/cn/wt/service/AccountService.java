package cn.wt.service;

import cn.wt.domain.Account;

import java.util.List;

/**
 * @author by wangtao
 * @date 2020/6/10.
 */

public interface AccountService {

    //查询所有账号信息
    public List<Account> findAll();

    //保存账号信息
    public void saveAccount(Account account);
}
