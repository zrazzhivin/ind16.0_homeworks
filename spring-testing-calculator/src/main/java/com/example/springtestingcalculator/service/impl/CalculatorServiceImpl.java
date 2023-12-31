package com.example.springtestingcalculator.service.impl;

import com.example.springtestingcalculator.exception.DivisionByZeroException;
import com.example.springtestingcalculator.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public double divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new DivisionByZeroException("Второй аргумент равен нулю! Делить на ноль нельзя!");
        }

        return (double) num1 / num2;
    }
}
