public class Car {

    String brand;
    String model;
    String color;
    int yearOfManufacturing;
    private int speed = 0;

    public int getSpeed() {
        return  speed;
    }

    public void start() {
        System.out.println("Car was successfully started!");
    }

    public void accelerate() {
        speed++;
    }
}
