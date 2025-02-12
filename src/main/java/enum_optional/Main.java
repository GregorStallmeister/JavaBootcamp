package enum_optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        PersonRepository personRepository = new PersonRepository();

        personRepository.addPerson(new Person(0, "Maxi", DaysOfWeek.SUNDAY));
        personRepository.addPerson(new Person(1, "Mini", DaysOfWeek.THURSDAY));

        Optional<Person> person1 = personRepository.searchPerson(0);
        if (person1.isPresent()) {
            System.out.println("Person 1 without call of get(): " + person1.toString());
            System.out.println("Person 1 with call of get(): " + person1.get().toString());
            System.out.println("Favorite day with call of weekday(DaysOfWeek): " + person1.get().favoriteDay().weekday(person1.get().favoriteDay()));
        }
        else
            System.out.println("Person 1 not found");

        Optional<Person> person2 = personRepository.searchPerson(3);
        if (person2.isPresent())
            System.out.println("Person 2: " + person2.toString());
        else
            System.out.println("Person 2 not found");
    }
}
