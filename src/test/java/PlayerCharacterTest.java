import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {

    @BeforeEach
    public void cleanAll() {
        PlayerCharacter.setX(0);
        PlayerCharacter.setY(0);
    }

    // (Only!) with the @BeforeEach function also the following "initial" test always works
     @Test
    public void testGetXExpected0 () {
        // given

        int expected = 0;

        // when
        int actual = PlayerCharacter.getX();

        // then
         assertEquals(expected, actual);
    }



    // (Only!) with the @BeforeEach function also the following "initial" test always works
    @Test
    public void testGetYExpected0 () {
        // given
        int expected = 0;

        // when
        int actual = PlayerCharacter.getY();

        // then
        assertEquals(expected, actual);
    }


    @Test
    public void moveExpectedYisIncreasedBy1WhenGivenW () {
        // given
        String param = "W";
        int currentY = PlayerCharacter.getY();
        int expectedY = currentY + 1;

        // when
        PlayerCharacter.move(param);
        int actualY = PlayerCharacter.getY();

        // then
        assertEquals(expectedY, actualY);
    }

    // (Only!) with the @BeforeEach function also the following simple test always works
    @Test
    public void moveExpectedYis1WhenGivenW () {
        // given
        String param = "W";
        int expected = 1;

        // when
        PlayerCharacter.move(param);
        int actual = PlayerCharacter.getY();

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void moveExpectedYisReducesBy1WhenGivenS () {
        // given
        String param = "S";
        int currentY = PlayerCharacter.getY();
        int expectedY = currentY - 1;

        // when
        PlayerCharacter.move(param);
        int actualY = PlayerCharacter.getY();

        // then
        assertEquals(expectedY, actualY);
    }

    @Test
    public void moveExpectedXisIncreasedBy1WhenGivenD () {
        // given
        String param = "D";
        int currentX = PlayerCharacter.getX();
        int expectedX = currentX + 1;

        // when
        PlayerCharacter.move(param);
        int actualX = PlayerCharacter.getX();

        // then
        assertEquals(expectedX, actualX);
    }

    @Test
    public void moveExpectedXisReducedBy1WhenGivenA () {
        // given
        String param = "A";
        int currentX = PlayerCharacter.getX();
        int expectedX = currentX - 1;

        // when
        PlayerCharacter.move(param);
        int actualX = PlayerCharacter.getX();

        // then
        assertEquals(expectedX, actualX);
    }
}
