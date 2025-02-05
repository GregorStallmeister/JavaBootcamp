import inheritance.Motorcycle;
import inheritance.Type;
import inheritance.Vehicle;
import inheritance.Car;

public class Main_inheritance {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("Opel", "Meriva A", 2008);
        System.out.println(myVehicle);

        Car myCar = new Car("Opel", "Meriva A", 2009, 5);
        System.out.println(myCar);

        Motorcycle myMotorcycle = new Motorcycle("Honda", "Goldwing", 1988, Type.Cruiser);
        System.out.println(myMotorcycle);
        System.out.println("Type as String: " + myMotorcycle.getTypeString());
    }
}
