package cn.wt.controller;

import cn.wt.component.SpringMQ_Consumer;
import cn.wt.component.SpringMQ_Produce;
import cn.wt.domain.Employee;
import cn.wt.service.AccountService;
import cn.wt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/employee")
@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    SpringMQ_Produce simpleProducer;

    @Autowired
    SpringMQ_Consumer springMQ_consumer;

    @RequestMapping(value = "/getEmpById/{id}")
    public ModelAndView getEmpById(@PathVariable("id") Integer id) {
        Employee emp = employeeService.getEmpById(id);
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("emp", emp.getEmpname() + "," + emp.getEmail());
        return modelAndView;
    }

    @RequestMapping(value = "/insertEmp")
    public ModelAndView insertEmp() {
        Employee insertEmp = new Employee();
        insertEmp.setEmpname("hahaha");
        insertEmp.setEmail("hahah@qq.com");
        insertEmp.setGender(0);
        int emp = employeeService.insertEmp(insertEmp);

        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("emp", emp);
        return modelAndView;
    }

    @RequestMapping(value = "/testRedis")
    public ModelAndView testRedis() {
        redisTemplate.opsForValue().set("test", "测试");
        String emp = (String) redisTemplate.opsForValue().get("test");
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("emp", emp);
        return modelAndView;
    }

    @RequestMapping(value = "/testMQProduce")
    public ModelAndView testMQProduce() throws Exception {
        simpleProducer.sendMessage();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("emp", "produce 成功.");
        return modelAndView;
    }

    @RequestMapping(value = "/testMQConsumer")
    public ModelAndView testMQConsumer() throws Exception {
        String message = springMQ_consumer.getMessage();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("emp", message);
        return modelAndView;
    }
}
