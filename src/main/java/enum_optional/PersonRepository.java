package enum_optional;

import java.util.*;

public class PersonRepository {
    protected Map<Integer, Person> persons;

    public PersonRepository() {
        this.persons = new HashMap<Integer, Person>();
    }

    public void addPerson(Person person) {
        persons.put(person.ID(), person);
    }

    public Optional<Person> searchPerson(int id) {
        if (persons.containsKey(id))
            return Optional.of(persons.get(id));

        return Optional.empty();
    }

    public Optional<Person> searchPerson(String name) {
        for (Person person : persons.values())
            if (person.name().equals(name))
                return Optional.of(person);

        return Optional.empty();
    }

    public List<Person> searchPersons(DaysOfWeek favoriteDay) {
        LinkedList<Person> personsFound = new LinkedList<Person>();

        for (Person person : persons.values())
            if (person.favoriteDay().equals(favoriteDay))
                personsFound.add(person);

        return personsFound;
    }

    public void printPersonCountsByGender() {
        int male = 0;
        int female = 0;
        int diverse = 0;

        for (Person person : persons.values()) {
            switch (person.gender()) {
                case MALE -> male++;
                case FEMALE -> female++;
                case DIVERSE -> diverse++;
            }
        }

        System.out.printf("We have %s male, %s female, and %s diverse persons.\n", male, female, diverse);
    }
}
