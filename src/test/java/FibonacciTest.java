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
}
