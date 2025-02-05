package inheritance;

import java.util.Objects;

public class Car extends Vehicle{

    protected int numberOfDoors;

    public Car() {
    }

    public Car(String manufacturer, String model, int yearOfManufactoring, int numberOfDoors) {
        super(manufacturer, model, yearOfManufactoring);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return numberOfDoors == car.numberOfDoors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfDoors);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufactoring=" + yearOfManufactoring +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
