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
}
