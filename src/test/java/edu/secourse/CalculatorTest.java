package edu.secourse;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    @DisplayName ("add(): add two numbers")
    void add() {
        assertAll(
                () -> assertEquals(2, Calculator.add(1, 1)),
                () -> assertEquals(2, Calculator.add(2, 0)),
                () -> assertEquals(-1, Calculator.add(2, -3))
        );
    }

    @Test
    @DisplayName ("multiply(): Multiply two numbers")
    void mulitply(){
        assertAll(
                () -> assertEquals(2, Calculator.multiply(1, 1)),
                () -> assertEquals(2, Calculator.multiply(2, 0)),
                () -> assertEquals(2, Calculator.multiply(2, -3))
        );
    }
}