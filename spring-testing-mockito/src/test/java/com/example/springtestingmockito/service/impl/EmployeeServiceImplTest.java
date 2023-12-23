package com.example.springtestingmockito.service.impl;

import com.example.springtestingmockito.exception.EmployeeAlreadyAddedException;
import com.example.springtestingmockito.model.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeServiceImplTest {

    private final EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

    @Test
    public void shouldThrowEmployeeAlreadyAddedExceptionWhenEmployeeIsAlreadyExisted() {
        // given
        Employee employee = new Employee("Ivan", "Petrov", 100_000, 1);
        employeeService.addEmployee(
                employee.getFirstName(), employee.getLastName(), employee.getSalary(), employee.getDepartment()
        );

        // when
        // then
        Assertions.assertThrows(EmployeeAlreadyAddedException.class, () -> {
            employeeService.addEmployee(
                    employee.getFirstName(), employee.getLastName(), employee.getSalary(), employee.getDepartment()
            );
        });
    }

    @Test
    public void shouldCorrectlyFindEmployee() {
        // given
        Employee employee = new Employee("Ivan", "Petrov", 100_000, 1);
        employeeService.addEmployee(
                employee.getFirstName(), employee.getLastName(), employee.getSalary(), employee.getDepartment()
        );

        // when
        Employee actualEmployee = employeeService.findEmployee(employee.getFirstName(), employee.getLastName());

        // then
        Assertions.assertEquals(employee, actualEmployee);
    }
}
