package cn.wt.controller;

import cn.wt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author by wangtao
 * @date 2020/6/10.
 */

@RequestMapping("/account")
@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll() {
        System.out.println("业务表现层查询");
        accountService.findAll();

        return "list";
    }
}
