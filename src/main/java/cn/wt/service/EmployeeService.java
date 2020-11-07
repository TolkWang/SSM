package cn.wt.service;

import cn.wt.domain.Employee;

public interface EmployeeService {

    public Employee getEmpById(Integer id);

    public int insertEmp(Employee employee);

}
