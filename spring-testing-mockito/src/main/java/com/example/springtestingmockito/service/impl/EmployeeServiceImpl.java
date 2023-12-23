package com.example.springtestingmockito.service.impl;

import com.example.springtestingmockito.exception.EmployeeAlreadyAddedException;
import com.example.springtestingmockito.exception.EmployeeNotFoundException;
import com.example.springtestingmockito.exception.EmployeeStorageIsFullException;
import com.example.springtestingmockito.model.Employee;
import com.example.springtestingmockito.service.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final int EMPLOYEES_STORAGE_SIZE = 5;
    private final Map<String, Employee> employees = new HashMap<>();

    @PostConstruct
    public void init() {
        addEmployee("Ivan", "Petrov1", 100_000, 1);
        addEmployee("Ivan", "Petrov2", 200_000, 1);
        addEmployee("Ivan", "Petrov3", 300_000, 1);
    }

    @Override
    public Employee addEmployee(String firstName, String lastName, Integer salary, Integer department) {
        String employeeKey = getEmployeeKey(firstName, lastName);

        if (employees.containsKey(employeeKey)) {
            throw new EmployeeAlreadyAddedException("Сотрудник уже есть в хранилище!");
        }

        if (employees.size() == EMPLOYEES_STORAGE_SIZE) {
            throw new EmployeeStorageIsFullException("Хранилище полное!");
        }

        employees.put(
                employeeKey,
                new Employee(firstName, lastName, salary, department)
        );

        return employees.get(employeeKey);
    }

    @Override
    public void removeEmployee(String firstName, String lastName) {
        String employeeKey = getEmployeeKey(firstName, lastName);

        if (!employees.containsKey(employeeKey)) {
            throw new EmployeeNotFoundException("Такого сотрудника нет в хранилище!");
        }

        employees.remove(employeeKey);
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        String employeeKey = getEmployeeKey(firstName, lastName);

        if (!employees.containsKey(employeeKey)) {
            throw new EmployeeNotFoundException("Такого сотрудника нет в хранилище!");
        }

        return employees.get(employeeKey);
    }

    @Override
    public Map<String, Employee> getAllEmployees() {
        return employees;
    }

    private String getEmployeeKey(String firstName, String lastName) {
        return firstName + lastName;
    }
}
