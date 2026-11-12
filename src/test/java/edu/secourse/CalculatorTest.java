package edu.secourse;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class CalculatorTest {

    @Test
    @DisplayName ("add(): add two numbers")
     void add() {
        assertAll(
                () -> assertEquals(2.0, Calculator.add(1.0, 1.0)),
                () -> assertEquals(2.0, Calculator.add(2.0, 0.0)),
                () -> assertEquals(-1.0, Calculator.add(2.0, -3.0))
        );
    }

    @Test
    @DisplayName("multiply(): Multiply two numbers")
    void multiply(){
        assertAll(
                () -> assertEquals(1.0, Calculator.multiply(1.0, 1.0)),
                () -> assertEquals(0.0, Calculator.multiply(2.0, 0.0)),
                () -> assertEquals(0.0, Calculator.multiply(0.0, -3.0)),
                () -> assertEquals(0.0, Calculator.multiply(-3.0, 0.0))
        );
    }

    @Test
    @DisplayName("Divide(): Divide two numbers")
    void divide(){
        assertAll(
                () -> assertEquals(1.0, Calculator.divide(1.0, 1.0)),
                () -> assertThrows(ArithmeticException.class,() -> Calculator.divide(1.0, 0.0)),
                () -> assertEquals(2.0, Calculator.divide(2.0, 1.0)),
                () -> assertThrows(ArithmeticException.class, () -> Calculator.divide(-1.0, 1))
        );
    }

    @Test
    @DisplayName("Sqrt(): Square root a number")
    void sqrt(){
        assertAll(
                () -> assertThrows(ArithmeticException.class, () -> Calculator.sqrt(0.0)),
                () -> assertThrows(ArithmeticException.class, () -> Calculator.sqrt(-1)),
                () -> assertEquals(2, Calculator.sqrt(4))
        );
    }
}