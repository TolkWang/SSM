package com.wt.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wt.bean.Employee;
import com.wt.service.EmployeeService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Service
@Component
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> getEmployee(int id) {

        Employee employee1 = new Employee(1, "1183925089@qq.com");
        Employee employee2 = new Employee(1, "422956303@qq.com");
        return Arrays.asList(employee1, employee2);
    }
}
