package com.example.springtestingmockito.service;

import com.example.springtestingmockito.model.Employee;

import java.util.Map;

public interface EmployeeService {

    Employee addEmployee(String firstName, String lastName, Integer salary, Integer department);

    void removeEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);

    Map<String, Employee> getAllEmployees();
}
