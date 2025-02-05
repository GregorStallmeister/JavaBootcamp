package chapter_static;

import org.junit.jupiter.api.Test;

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
        double num1 = 7;
        double num2 = 6;
        double expected = 42;

        // when
        double actual = Calculator.multiply(num1, num2);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void  multiplyExpected49dot5WhenGiven7dot5And6dot6() {
        // given
        double num1 = 7.5;
        double num2 = 6.6;
        double expected = 49.5;

        // when
        double actual = Calculator.multiply(num1, num2);

        // then
        assertEquals(expected, actual);
    }
}
