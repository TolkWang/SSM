package cn.wt.service.impl;

import cn.wt.domain.Account;
import cn.wt.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author by wangtao
 * @date 2020/6/10.
 */

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有账号信息");
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层保存账号");
    }
}
