package cn.wt.service.impl;

import cn.wt.dao.EmployeeDao;
import cn.wt.domain.Employee;
import cn.wt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public Employee getEmpById(Integer id) {

        Employee employee = employeeDao.getEmpById(id);
        return employee;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int insertEmp(Employee employee) {
        int insertEmployee = employeeDao.insertEmployee(employee);
        //int i = 1/0;
        return insertEmployee;
    }
}
