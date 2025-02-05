package inheritance;

import java.util.Objects;

public class Vehicle {

    protected String manufacturer;
    protected String model;
    int yearOfManufactoring;

    public Vehicle() {
    }

    public Vehicle(String manufacturer, String model, int yearOfManufactoring) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfManufactoring = yearOfManufactoring;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufactoring() {
        return yearOfManufactoring;
    }

    public void setYearOfManufactoring(int yearOfManufactoring) {
        this.yearOfManufactoring = yearOfManufactoring;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return yearOfManufactoring == vehicle.yearOfManufactoring && Objects.equals(manufacturer, vehicle.manufacturer) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, yearOfManufactoring);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufactoring=" + yearOfManufactoring +
                '}';
    }
}
