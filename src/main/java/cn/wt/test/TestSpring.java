package cn.wt.test;

import cn.wt.domain.Employee;
import cn.wt.service.AccountService;
import cn.wt.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;

/**
 * @author by wangtao
 * @date 2020/6/10.
 */

public class TestSpring {

    @Test
    public void run1() {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//
//        EmployeeService as = (EmployeeService) ac.getBean(EmployeeService.class);
//
//        Employee insertEmp = new Employee();
//        insertEmp.setEmpname("hahaha");
//        insertEmp.setEmail("hahah@qq.com");
//        insertEmp.setGender(0);
//        int emp = as.insertEmp(insertEmp);
    }

    @Test
    public void run2() {
        Jedis jedis = new Jedis("192.168.91.130", 6379);
        jedis.set("test", "123456");
        System.out.println(jedis.get("test"));
    }
}
