package com.example.springtestingcalculator.exception;

public class DivisionByZeroException extends IllegalArgumentException {
    public DivisionByZeroException(String s) {
        super(s);
    }
}
