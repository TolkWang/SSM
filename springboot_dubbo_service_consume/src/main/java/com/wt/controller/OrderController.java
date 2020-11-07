package com.wt.controller;

import com.wt.bean.Employee;
import com.wt.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    @ResponseBody
    @RequestMapping("/initOrder")
    public List<Employee> initOrder(@RequestParam("uid") int id) {
        System.out.println("123456");
        return orderService.initOrder(id);

    }

}
