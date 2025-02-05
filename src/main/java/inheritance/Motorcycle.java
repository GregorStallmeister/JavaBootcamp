package inheritance;

import java.util.Objects;

public class Motorcycle extends  Vehicle{

    Type myType;

    public Motorcycle() {

    }

    public Motorcycle(String manufacturer, String model, int yearOfManufactoring, Type myType) {
        super(manufacturer, model, yearOfManufactoring);
        this.myType = myType;
    }

    public Type getMyType() {
        return myType;
    }

    public void setMyType(Type myType) {
        this.myType = myType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorcycle that = (Motorcycle) o;
        return myType == that.myType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), myType);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufactoring=" + yearOfManufactoring +
                ", myType=" + myType +
                '}';
    }
}

enum Type {Chopper, Sportbike, Cruiser}
