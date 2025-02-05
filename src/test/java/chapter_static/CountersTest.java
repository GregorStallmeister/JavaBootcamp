package chapter_static;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountersTest {

    @BeforeEach
    public void cleanAll() {
        Counters.setTotalCount(0);
    }

    @Test
    public void incrementTotalCountExpected1WhenCalled() {
        // given
        // Counters as class without instance
        int expected = 1;

        // when
        int actual = Counters.incrementTotalCount();

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void incrementTotalCountExpectedIncreasedBy1EveryTimeWhenCalled() {
        // given
        // Counters as class without instance
        int expected = 1;

        // when
        for (int i = 0; i < 10; i++) {
            int actual = Counters.incrementTotalCount();

            // then
            assertEquals(expected, actual);

            // for next loop pass
            expected++;;
        }
    }

    @Test
    public void incrementInstanceCountExpectedIncreasedBy1EveryTimeWhenCalled() {
        // given
        Counters counters = new Counters(42);
        int expected = 43;

        // when
        for (int i = 0; i < 100; i++) {
            int actual = counters.incrementInstanceCount();

            // then
            assertEquals(expected, actual);

            // for next loop pass
            expected++;;
        }
    }
}
