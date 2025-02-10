package record;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("0", "Doggie", "dog", 15);
        Animal animal2 = new Animal("1", "Pussy", "cat", 3);
        Animal animal3 = new Animal("2", "Charly", "dog", 4);

        System.out.println("animal 1 equals animal 1: " + animal1.equals(animal1));
        System.out.println("animal 1 equals animal 2: " + animal1.equals(animal2));
        System.out.println("animal 3 equals animal 1: " + animal3.equals(animal1));

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
    }
}
