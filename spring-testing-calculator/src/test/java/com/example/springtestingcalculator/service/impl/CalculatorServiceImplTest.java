package com.example.springtestingcalculator.service.impl;

import com.example.springtestingcalculator.exception.DivisionByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceImplTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldCalculatePlusCorrectly() {
        // given
        int num1 = 10, num2 = 20;
        int expectedResult = num1 + num2;

        // when
        int actualResult = calculatorService.plus(num1, num2);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldCalculateMinusCorrectly() {
        // given
        int num1 = 10, num2 = 20;
        int expectedResult = num1 - num2;

        // when
        int actualResult = calculatorService.minus(num1, num2);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldCalculateMultiplyCorrectly() {
        // given
        int num1 = 10, num2 = 20;
        int expectedResult = num1 * num2;

        // when
        int actualResult = calculatorService.multiply(num1, num2);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldCalculateDivideCorrectly() {
        // given
        int num1 = 10, num2 = 20;
        double expectedResult = (double) num1 / num2;

        // when
        double actualResult = calculatorService.divide(num1, num2);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldThrowExceptionWhenTheSecondNumIsNull() {
        // given
        int num1 = 10;
        int num2 = 0;

        // when
        // then
        Assertions.assertThrows(
                DivisionByZeroException.class,
                () -> calculatorService.divide(num1, num2)
        );
    }
}
