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

    @Test
    public void testGetYExpected0 () {
        // given
        int expected = 0;

        // when
        int actual = PlayerCharacter.getY();

        // then
        assertEquals(expected, actual);
    }
}
