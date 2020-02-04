package com.canx;

import com.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setupTest() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("add should return valid result")
    void testAdd() {
        int result = calculator.add(1, 9);

        assertEquals(result, 10);
    }

    @Test
    @DisplayName("substract should return valid result")
    void testSubstract() {
        int result = calculator.substract(9, 1);

        assertEquals(result, 8);
    }

}
