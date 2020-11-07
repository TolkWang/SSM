package cn.wt.dao;

import cn.wt.domain.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeDao {

    public Employee getEmpById(Integer id);

    public Employee getEmpByIdAndName(@Param("id") Integer id, @Param("name") String name);

    public Employee getEmpByIdAndNameMap(Map<String, Object> map);

    public int insertEmployee(Employee employee);

    public int insertEmployee2(Employee employee);

    public int updateEmployee(Employee employee);

    public int deleteEmployee(Integer id);

    public List<Employee> getAllEmp();

    public Map<String, Object> getAllEmp2(Integer id);

    @MapKey("id")
    public Map<Integer, Employee> getAllEmp3();

    public Employee getEmpByIdResultMap(Integer id);

    public Employee getEmpAndHomeById(Integer id);

    public List<Employee> getEmpAndBooksById(Integer id);

    public Employee getEmpAndHomeById2(Integer id);

    public Employee getEmpAndBookById2(Integer id);

    public Employee getEmpById2(Integer id);

    public List<Employee> getEmpByCondition(Employee employee);

    public List<Employee> getEmpByCondition2(Employee employee);

    public List<Employee> getEmpByConditionIn(@Param("ids") List<Integer> id);

    public List<Employee> getEmpByCondition3(Employee employee);

    public int updateEmployee2(Employee employee);
}
