public class Main {
    public static void main(String[] args) {

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

        Person myPerson1 = new Person("Jane", 12, "female");
        Person myPerson2 = new Person("Jimmy", 13, "male");
        Person myPerson3 = new Person("Janno", 11, "fluent");

        myPerson1.introduceYourself();
        myPerson2.introduceYourself();
        myPerson3.introduceYourself();

        Fibonacci myFib = new Fibonacci();

        for (int i = 0; i < 12; i++) {
            System.out.println("Fibonacci number at position " + i + " is " + myFib.getFibonacciNumberAtPosition(i));
        }


    }
}
