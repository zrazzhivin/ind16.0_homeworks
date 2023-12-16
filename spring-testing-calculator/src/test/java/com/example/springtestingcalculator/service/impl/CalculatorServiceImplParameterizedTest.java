package com.example.springtestingcalculator.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceImplParameterizedTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    private static Stream<Arguments> provideNumbersForCalculator() {
        return Stream.of(
                Arguments.of(10, 20),
                Arguments.of(0, 5),
                Arguments.of(-10, 20),
                Arguments.of(1000, 20000),
                Arguments.of(-10, -20)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void shouldCalculatePlusCorrectly(int num1, int num2) {
        // given
        int expectedResult = num1 + num2;

        // when
        int actualResult = calculatorService.plus(num1, num2);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void shouldCalculateMinusCorrectly(int num1, int num2) {
        // given
        int expectedResult = num1 - num2;

        // when
        int actualResult = calculatorService.minus(num1, num2);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void shouldCalculateMultiplyCorrectly(int num1, int num2) {
        // given
        int expectedResult = num1 * num2;

        // when
        int actualResult = calculatorService.multiply(num1, num2);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void shouldCalculateDivideCorrectly(int num1, int num2) {
        // given
        double expectedResult = (double) num1 / num2;

        // when
        double actualResult = calculatorService.divide(num1, num2);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
