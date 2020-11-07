import cn.wt.domain.Employee;
import cn.wt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

public class Test {

    @Autowired
    EmployeeService employeeService;

    @org.junit.Test
    public void run1() {

        Employee insertEmp = new Employee();
        insertEmp.setEmpname("hahaha");
        insertEmp.setEmail("hahah@qq.com");
        insertEmp.setGender(0);
        int emp = employeeService.insertEmp(insertEmp);


    }
}
