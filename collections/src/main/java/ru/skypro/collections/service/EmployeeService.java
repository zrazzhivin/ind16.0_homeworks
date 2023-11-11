package ru.skypro.collections.service;

import ru.skypro.collections.model.Employee;

import java.util.Map;

public interface EmployeeService {

    Employee add(String firstName, String lastName);
    Employee remove(String firstName, String lastName);
    Employee find(String firstName, String lastName);

    Map<String, Employee> getAll();
}
