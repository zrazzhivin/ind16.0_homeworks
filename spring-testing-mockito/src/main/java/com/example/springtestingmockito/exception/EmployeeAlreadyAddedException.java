package com.example.springtestingmockito.exception;

public class EmployeeAlreadyAddedException extends RuntimeException {

    public EmployeeAlreadyAddedException(String message) {
        super(message);
    }
}
