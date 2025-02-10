package record;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("0", "Doggie", new Species("Golden Retriever", 800), 15, new Owner("Max", 16, "Testweg 1, 12345 Teststadt"));
        Animal animal2 = new Animal("1", "Pussy", new Species("Egyptian Mohaire", 250), 3, new Owner("Moritz", 14, "Testweg 1, 12345 Teststadt"));
        Animal animal3 = new Animal("2", "Charly", animal1.sepcies(), 4, animal1.owner());

        System.out.println("animal 1 equals animal 1: " + animal1.equals(animal1));
        System.out.println("animal 1 equals animal 2: " + animal1.equals(animal2));
        System.out.println("animal 3 equals animal 1: " + animal3.equals(animal1));

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);

        Zoo zoo = new Zoo(animals);
        System.out.println(zoo);
        System.out.println("Food amount: " + zoo.calculateFoodAmount() + " grams every day");
    }
}
