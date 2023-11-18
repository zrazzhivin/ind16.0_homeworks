package ru.skypro.collections.service.impl;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import ru.skypro.collections.exception.EmployeeAlreadyAddedException;
import ru.skypro.collections.exception.EmployeeNotFoundException;
import ru.skypro.collections.exception.EmployeeStorageIsFullException;
import ru.skypro.collections.model.Employee;
import ru.skypro.collections.service.EmployeeService;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final int STORAGE_SIZE = 100;

    @PostConstruct
    public void initEmployees() {
        add("Ivan", "Petrov", 100_000, 1);
        add("Ivan1", "Petrov", 200_000, 1);
        add("Ivan2", "Petrov", 300_000, 1);

        add("Ivan3", "Petrov", 300_000, 2);
        add("Ivan4", "Petrov", 500_000, 2);

        add("Ivan5", "Petrov", 1_000_000, 3);
    }

    private final Map<String, Employee> employees = new HashMap<>();

    @Override
    public Employee add(String firstName, String lastName, Integer salary, Integer department) {
        if (employees.size() >= STORAGE_SIZE) {
            throw new EmployeeStorageIsFullException("Не можем добавить сотрудника! Хранилище уже полное.");
        }

        if (employees.containsKey(getKey(firstName, lastName))) {
            throw new EmployeeAlreadyAddedException("Сотрудник с именеем " + firstName + "и фамилией " + lastName + " " +
                    "уже имеется в хранилище!");
        }

        Employee employee = new Employee(firstName, lastName, salary, department);
        employees.put(getKey(employee), employee);
        return employee;
    }

    @Override
    public Employee remove(String firstName, String lastName) {
        if (!employees.containsKey(getKey(firstName, lastName))) {
            throw new EmployeeNotFoundException("Сотрудник с именеем " + firstName + " и фамилией " + lastName + " " +
                    "не найден в хранилище!");
        }

        return employees.remove(getKey(firstName, lastName));
    }

    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee = employees.get(getKey(firstName, lastName));
        if (employee == null) {
            throw new EmployeeNotFoundException("Сотрудник с именеем " + firstName + " и фамилией " + lastName + " " +
                    "не найден в хранилище!");
        }

        return employee;
    }

    @Override
    public Map<String, Employee> getAll() {
        return Collections.unmodifiableMap(employees);
    }

    private static String getKey(String firstName, String lastName) {
        return firstName + lastName;
    }

    private static String getKey(Employee employee) {
        return employee.getFirstName() + employee.getLastName();
    }
}
