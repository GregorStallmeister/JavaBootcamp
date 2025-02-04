import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    public void getFibonacciNumberAtPositionExpected0WhenGiven0() {
        // given
        int position= 0;
        int expected = 0;
        Fibonacci myFib = new Fibonacci();

        // when
        int actual = myFib.getFibonacciNumberAtPosition(position);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void getFibonacciNumberAtPositionExpected1WhenGiven1() {
        // given
        int position= 1;
        int expected = 1;
        Fibonacci myFib = new Fibonacci();

        // when
        int actual = myFib.getFibonacciNumberAtPosition(position);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void getFibonacciNumberAtPositionExpected3WhenGiven2() {
        // given
        int position= 2;
        int expected = 3;
        Fibonacci myFib = new Fibonacci();

        // when
        int actual = myFib.getFibonacciNumberAtPosition(position);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void getFibonacciNumberAtPositionExpected21WhenGiven6() {
        // given
        int position= 6;
        int expected = 21;
        Fibonacci myFib = new Fibonacci();

        // when
        int actual = myFib.getFibonacciNumberAtPosition(position);

        // then
        assertEquals(expected, actual);
    }
}
