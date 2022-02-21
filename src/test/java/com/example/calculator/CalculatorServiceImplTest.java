package com.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceImplTest {
    private int number1;
    private int number2;
    private int number3;
    private int number4;
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @BeforeEach
    public void setUp() {
        number1 = 1;
        number2 = 2;
        number3 = 4;
        number4 = 9;
    }

    @Test
    public void shouldReturnSum() {
        int actual1 = number1 + number2;
        int actual2 = number3 + number4;
        assertEquals(calculatorService.plus(number1,number2),actual1);
        assertEquals(calculatorService.plus(number3,number4),actual2);
    }

    @Test
    public void shouldReturnSub() {
        int actual1 = number1 - number2;
        int actual2 = number3 - number4;
        assertEquals(calculatorService.minus(number1,number2),actual1);
        assertEquals(calculatorService.minus(number3,number4),actual2);
    }

    @Test
    public void shouldReturnMultiply() {
        int actual1 = number1 * number2;
        int actual2 = number3 * number4;
        assertEquals(calculatorService.multiply(number1,number2),actual1);
        assertEquals(calculatorService.multiply(number3,number4),actual2);
    }

    @Test
    public void shouldReturnDivide() {
        int actual1 = number1 / number2;
        int actual2 = number3 / number4;
        assertEquals(calculatorService.divide(number1,number2),actual1);
        assertEquals(calculatorService.divide(number3,number4),actual2);
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(5, 0));
    }
}
