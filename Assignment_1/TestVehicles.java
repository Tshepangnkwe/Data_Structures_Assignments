package Assignment_1;

public class TestVehicles {
    public static void main(String[] args) {
        // Superclass reference --> Subclass objects (polymorphism)
        Vehicle v1 = new Car("Toyota", 2020, 4);
        Vehicle v2 = new Motorcycle("Harley-Davidson", 2018, true);

        // Demonstrate polymorphism and abstract method (vehicleType)
        System.out.println("v1 is a: " + v1.vehicleType());
        System.out.println("v2 is a: " + v2.vehicleType());

        // Explicit call of toString
        System.out.println("Car details (explicit): " + v1.toString());
        System.out.println("Motorcycle details (explicit): " + v2.toString());

        // Implicit call of toString
        System.out.println("Car details (implicit): " + v1);
        System.out.println("Motorcycle details (implicit): " + v2);

        // Example of using mutators
        ((Car) v1).setNumberOfDoors(2);
        ((Motorcycle) v2).setHasSidecar(false);

        System.out.println("After modification:");
        System.out.println(v1);
        System.out.println(v2);
    }
}
