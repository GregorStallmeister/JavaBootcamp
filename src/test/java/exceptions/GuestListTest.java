package exceptions;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class GuestListTest {

    @Test
    public void shouldBeEmptyInitially() {
        // given
        GuestList guestList = new GuestList();
        ArrayList<String> guestsEmpty = new ArrayList<>();

        // when
        guestList.setGuests(guestsEmpty);

        // then
        assertTrue(guestList.getGests().isEmpty());
    }

    @Test
    public void shouldReadSameGuestsAsWrittenBefore() {
        // given
        GuestList guestList = new GuestList();
        ArrayList<String> guests = new ArrayList<>();
        guests.add("Karl");
        guests.add("Ute");

        // when
        guestList.setGuests(guests);
        List<String> actual = guestList.getGests();

        // then
        assertTrue(actual.contains("Karl") && actual.contains("Ute"));
    }

    @Test
    public void shouldWriteToFileSystem() {
        // given
        GuestList guestList = new GuestList();
        ArrayList<String> guests = new ArrayList<>();
        guests.add("Theodor");
        guests.add("Anette");

        // when
        guestList.setGuests(guests);

        // then
        try {
            Stream<String> lines = Files.lines(Path.of("guests.txt"));
            List<String> linesAsList = lines.toList();
            assertTrue(linesAsList.contains("Theodor") && linesAsList.contains("Anette"));
        }
        catch (IOException e) {
            fail();
        }
    }
}
