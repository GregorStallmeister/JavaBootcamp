package dateAndTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        System.out.println(Instant.now());
        System.out.println(ZonedDateTime.now());
        System.out.println(LocalDateTime.now());

        System.out.println();
        System.out.println(ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));
        System.out.println("in 2 weeks:");
        System.out.println(ZonedDateTime.now().plusWeeks(2).format(DateTimeFormatter.RFC_1123_DATE_TIME));

        System.out.println();
        System.out.println("Is the 12th of September 2025 after the current date?");
//        System.out.println(ZonedDateTime.now().isAfter(ZonedDateTime.parse("2025-09-12T11:15:16.300558100+01:00[Europe/Berlin]"))); // wrong order in comparison!
        System.out.println(ZonedDateTime.parse("2025-09-12T11:15:16.300558100+01:00[Europe/Berlin]").isAfter(ZonedDateTime.now()));
        System.out.println("Days to it:");
        System.out.println(ChronoUnit.DAYS.between(ZonedDateTime.now(), ZonedDateTime.parse("2025-09-12T11:15:16.300558100+01:00[Europe/Berlin]")));

        System.out.println();
        System.out.println("Days between 2025-01-27 and 2025-04-23: ");
        System.out.println(ChronoUnit.DAYS.between(ZonedDateTime.parse("2025-01-27T11:15:16.300558100+01:00[Europe/Berlin]"), ZonedDateTime.parse("2025-04-23T11:15:16.300558100+01:00[Europe/Berlin]")));

        Animal dog = new Animal("Otto", ZonedDateTime.parse("2010-01-24T00:00:00.000000000+01:00[Europe/Berlin]"));
        System.out.println();
        System.out.println("Days until " + dog.name + "'s next birthday:");

        ZonedDateTime birthdayThisYear = ZonedDateTime.parse(dog.birthday.toString().replaceFirst("[0-9]+", "" + Year.now().getValue()));
        if (birthdayThisYear.isAfter(ZonedDateTime.now()))
            System.out.println(ChronoUnit.DAYS.between(ZonedDateTime.now(), birthdayThisYear));
        else
            System.out.println(ChronoUnit.DAYS.between(ZonedDateTime.now(), birthdayThisYear.plusYears(1)));
    }
}
