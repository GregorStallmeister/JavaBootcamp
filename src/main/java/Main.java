import oop.Book;
import oop.Library;

public class Main {
    public static void main(String[] args) {

        Book[] myBooks = new Book[12];

        for (int i = 0; i < 6; i++)
        {
            Book currentBook = new Book("title_" + i, "author_" + i, "isbn_" + i);
            myBooks[i] = currentBook;
        }

        Library myLibrary = new Library(myBooks);

        System.out.println(myLibrary);

        myLibrary.addBook(new Book("Die Losungen 2025", "Herrnhuter Brüdergemeine", "123456"));

        System.out.println();
        System.out.println(myLibrary);

        myLibrary.removeBook(4);

        System.out.println();
        System.out.println(myLibrary);

//        Car myCar = new Car();
//
//        myCar.start();
//
//        Car myCar2 = new Car();
//        myCar2.start();
//
//       // System.out.println("Car speed: " + myCar2.speed);
//        System.out.println("Car speed: " + myCar2.getSpeed());
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Accelerate!");
//            myCar2.accelerate();
//            System.out.println("Car speed: " + myCar2.getSpeed());
//        }

//        Person myPerson1 = new Person("Jane", 12, "female");
//        Person myPerson2 = new Person("Jimmy", 13, "male");
//        Person myPerson3 = new Person("Janno", 11, "fluent");
//
//        myPerson1.introduceYourself();
//        myPerson2.introduceYourself();
//        myPerson3.introduceYourself();
//
//        Fibonacci myFib = new Fibonacci();
//
//        for (int i = 0; i < 12; i++) {
//            System.out.println("Fibonacci number at position " + i + " is " + myFib.getFibonacciNumberAtPosition(i));
//        }

    }
}
