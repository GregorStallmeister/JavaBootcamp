package enum_optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

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
}
