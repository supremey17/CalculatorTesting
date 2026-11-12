package edu.secourse;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double multiply(double a, double b) {
        if ((a == 0 && b <= 0) || (a <=0 && b == 0)){
            return 0.0;
        }
        return a * b;
    }
    public static double subtract(double a, double b){
        return a - b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero") ;
        }
        if (a < 0){
            throw new ArithmeticException("Cannot divide by negative.");
        }
        return a / b;

    }
    public static double sqrt(double a) {
        if (a == 0) {
            throw new ArithmeticException("Cannot take square root of zero.");
        }
        if (a < 0){
            throw new ArithmeticException("Cannot take square root of a negative");
        }
        return Math.sqrt(a);
    }

}
