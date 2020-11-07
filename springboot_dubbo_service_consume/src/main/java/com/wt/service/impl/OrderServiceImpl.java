package com.wt.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wt.bean.Employee;
import com.wt.service.EmployeeService;
import com.wt.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    EmployeeService employeeService;

    @Override
    public List<Employee> initOrder(int id) {
        List<Employee> employee = employeeService.getEmployee(id);
        for (Employee employee1 : employee) {
            System.out.println(employee1);
        }
        System.out.println("调用结束");

        return employee;
    }
}
