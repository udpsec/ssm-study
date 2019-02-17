package com.inofd.ssm.service;

import com.github.pagehelper.PageInfo;
import com.inofd.ssm.entity.Employee;

import java.util.List;

public interface EmployeeService {

    PageInfo<Employee> getAll(Integer pageNum);

    void saveEmp(Employee employee);

    boolean checkUser(String empName);

    Employee getEmp(Integer id);

    void updateEmp(Employee employee);

    void deleteEmp(Integer id);

    void deleteBatch(String ids);
}
