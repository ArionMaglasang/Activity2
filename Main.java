public class Main {

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void main(String[] args) {

        // Demo 1: A parent reference holds a child object
        System.out.println("=== Demo 1: Parent Reference ===");

        Vehicle vehicle = new Car("Toyota", "Fortuner", 2024, 4);
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Motorcycle("Yamaha", "Mio i125", 2023, "Automatic");
        vehicle.displayInfo();
        System.out.println();

        // Demo 2: One method accepts different Vehicle subclasses
        System.out.println("=== Demo 2: Method Parameter ===");

        Car car = new Car("Ford", "Mustang", 2025, 2);

        Motorcycle motorcycle =
            new Motorcycle("Kawasaki", "Ninja 400", 2024, "Manual");

        printDetails(car);
        System.out.println();

        printDetails(motorcycle);
        System.out.println();

        // Demo 3: An array holds different Vehicle subclasses
        System.out.println("=== Demo 3: Polymorphic Array ===");

        Vehicle[] vehicles = {
            new Car("Honda", "Civic", 2022, 4),
            new Motorcycle("Suzuki", "Raider 150", 2021, "Manual"),
            new Car("Mitsubishi", "Montero Sport", 2023, 4),
            new Motorcycle("Honda", "Click 160", 2025, "Automatic")
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            System.out.println();
        }
    }
}
