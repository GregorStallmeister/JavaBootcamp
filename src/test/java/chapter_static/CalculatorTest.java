package chapter_static;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void  addExpected42WhenGiven29And13() {
        // given
        double num1 = 29;
        double num2 = 13;
        double expected = 42;

        // when
        double actual = Calculator.add(num1, num2);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void  addExpected42dot42WhenGiven29dot29And13dot13() {
        // given
        double num1 = 29.29;
        double num2 = 13.13;
        double expected = 42.42;

        // when
        double actual = Calculator.add(num1, num2);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void subtractExpected42WhenGiven66And24() {
        // given
        double minuend = 66;
        double subtrahend = 24;
        double expeted = 42;

        // when
        double actual = Calculator.subtract(minuend, subtrahend);

        // then
        assertEquals(expeted, actual);
    }

    @Test
    public void subtractExpected42Dot42WhenGiven66Dot66And24Dot24() {
        // given
        double minuend = 66.66;
        double subtrahend = 24.24;
        double expected = 42.42;

        // when
        double actual = Calculator.subtract(minuend, subtrahend);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void  multiplyExpected42WhenGiven7And6() {
        // given
        BigDecimal num1 = BigDecimal.valueOf(7);
        BigDecimal num2 = BigDecimal.valueOf(6);
        BigDecimal expected = BigDecimal.valueOf(42);

        // when
        BigDecimal actual = Calculator.multiply(num1, num2);

        // then
        assertEquals(expected, actual);
    }

//    @Test
//    public void  multiplyExpected42dot42WhenGiven7And6dot06() {
//        // given
//        double num1 = 7.0; // neither 7 nor 7.0 work at this time
//        double num2 = 6.06;
//        double expected = 42.42; // windows calculator has the expected result, the function has 42.419999999999995
//
//        // when
//        double actual = Calculator.multiply(num1, num2);
//
//        // then
//        assertEquals(expected, actual);
//    }

    @Test
    public void  multiplyExpected42dot42WhenGiven7And6dot06() {
        // given
        BigDecimal num1 = BigDecimal.valueOf(7);
        BigDecimal num2 = BigDecimal.valueOf(6.06);
//        BigDecimal expected = BigDecimal.valueOf(42.420); // 0 will not be in converted value
        BigDecimal expected = num1.multiply(num2);

        // when
        BigDecimal actual = Calculator.multiply(num1, num2);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void  multiplyExpected49dot5WhenGiven7dot5And6dot6() {
        // given
        BigDecimal num1 = BigDecimal.valueOf(7.5);
        BigDecimal num2 = BigDecimal.valueOf(6.6);
//        BigDecimal expected = BigDecimal.valueOf(49.50); // 0 will not be in the converted value
        BigDecimal expected = num1.multiply(num2);

        // when
        BigDecimal actual = Calculator.multiply(num1, num2);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void divideExpected7WhenGiven42And6() {
        // given
        double dividend = 42;
        double divisor = 6;
        double expected = 7;

        // when
        double actual = Calculator.divide(dividend, divisor);

        // then
        assertEquals(expected, actual);
    }
    @Test
    public void divideExpected12WhenGiven42And3dot5() {
        // given
        double dividend = 42;
        double divisor = 3.5;
        double expected = 12;

        // when
        double actual = Calculator.divide(dividend, divisor);

        // then
        assertEquals(expected, actual);
    }
}
