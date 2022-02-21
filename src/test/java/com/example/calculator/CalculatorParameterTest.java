package com.example.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParameterTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(1,2),
                Arguments.of(3,4)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void shouldReturnSum(int num1, int num2) {
        assertEquals(calculatorService.plus(num1, num2), num1+num2);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void shouldReturnSubstr(int num1, int num2) {
        assertEquals(calculatorService.minus(num1, num2), num1-num2);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void shouldReturnMultiply(int num1, int num2) {
        assertEquals(calculatorService.multiply(num1, num2), num1*num2);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void shouldReturnDivide(int num1, int num2) {
        assertEquals(calculatorService.divide(num1, num2), num1/num2);
    }
}
