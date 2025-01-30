import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {

    @Test
    public void testGetXExpected0 () {
        // given
        int expected = 0;

        // when
        int actual = PlayerCharacter.getX();

        // then
        assertEquals(expected, actual);
    }

    /**
    // @Test
    public void testGetYExpected0 () {
        // given
        int expected = 0;

        // when
        int actual = PlayerCharacter.getY();

        // then
        assertEquals(expected, actual);
    }
     */

    @Test
    public void moveExpectedYis1WhenGivenW () {
        // given
        String param = "W";
        int expectedY = 1;

        // when
        PlayerCharacter.move(param);
        int actualY = PlayerCharacter.getY();

        // then
        assertEquals(expectedY, actualY);
    }
}
