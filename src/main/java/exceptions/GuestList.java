package exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class GuestList {
    protected List<String> guests;

    public void setGuests(ArrayList<String> guests) {
        this.guests = guests;

        try {
            String guestLines = "";
            for (String guest : guests) {
                guestLines = guestLines + guest + "\n";
            }
            Files.writeString(Path.of("guests.txt"), guestLines);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> getGests() {
        return this.guests;
    }
}
