package chapter_static;

public class Calculator {

    private Calculator() {
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double minuend, double subtrahend) {
        return  minuend - subtrahend;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double dividend, double divisor) {
        return  dividend / divisor;
    }
}
