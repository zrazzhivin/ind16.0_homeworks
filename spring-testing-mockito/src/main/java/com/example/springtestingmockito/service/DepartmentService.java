package com.example.springtestingmockito.service;

import com.example.springtestingmockito.model.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {

    List<Employee> getEmployees(Integer departmentId);

    Integer getSalarySum(Integer departmentId);

    Employee getEmployeeWithMaxSalary(Integer departmentId);

    Employee getEmployeeWithMinSalary(Integer departmentId);

    Map<Integer, List<Employee>> getGroupedByDepartmentEmployees();
}
