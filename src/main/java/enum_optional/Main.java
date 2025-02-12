package enum_optional;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        PersonRepository personRepository = new PersonRepository();

        personRepository.addPerson(new Person(0, "Maxi", DaysOfWeek.SUNDAY, Gender.FEMALE));
        personRepository.addPerson(new Person(1, "Mini", DaysOfWeek.THURSDAY, Gender.FEMALE));
        personRepository.addPerson(new Person(2, "Moritz", DaysOfWeek.MONDAY, Gender.MALE));
        personRepository.addPerson(new Person(3, "Maurice", DaysOfWeek.TUESDAY, Gender.DIVERSE));
        personRepository.addPerson(new Person(4, "Ronny", DaysOfWeek.WEDNESDAY, Gender.DIVERSE));
        personRepository.addPerson(new Person(5, "Dory", DaysOfWeek.SUNDAY, Gender.DIVERSE));

        Optional<Person> person1 = personRepository.searchPerson(0);
        if (person1.isPresent()) {
            System.out.println();
            System.out.println("Person 1 without call of get(): " + person1.toString());
            System.out.println("Person 1 with call of get(): " + person1.get().toString());
            System.out.println("Favorite day with call of weekday(DaysOfWeek): " + person1.get().favoriteDay().weekday(person1.get().favoriteDay()));
        } else
            System.out.println("\nPerson 1 not found");

        Optional<Person> person2 = personRepository.searchPerson(42);
        if (person2.isPresent())
            System.out.println("Person 2: " + person2.toString());
        else
            System.out.println("Person 2 not found");

        System.out.println();
        personRepository.printPersonCountsByGender();

        String[] names = {"Maxi", "Klaus", "Maurice"};

        for (String name : names) {
            Optional<Person> person = personRepository.searchPerson(name);

            if (person.isPresent())
                System.out.println("Found: " + person.get().toString());
            else
                System.out.println(name + " not found");
        }

        for (DaysOfWeek daysOfWeek : DaysOfWeek.values()) {
            List<Person> foundPersons = personRepository.searchPersons(daysOfWeek);
            System.out.println();
            System.out.println("With the favorite day " + daysOfWeek + " we know the following persons:");
            for (Person foundPerson : foundPersons)
                System.out.println(foundPerson.toString());
        }
    }
}
