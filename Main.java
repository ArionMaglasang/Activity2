public class Main {

    public static void main(String[] args) {

      
        Vehicle vehicle1 = new Vehicle("Toyota", "Vios", 2000);
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 2010);
        Vehicle vehicle3 = new Vehicle("Ford", "Ranger", 2020);

        System.out.println("=== VEHICLE 1 ===");
        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        System.out.println("Brand: " + vehicle1.getBrand());
        System.out.println("Model: " + vehicle1.getModel());
        System.out.println("Year: " + vehicle1.getYear());

    
        System.out.println("\n=== VEHICLE 2 ===");
        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());

    
        System.out.println("\n=== VEHICLE 3 ===");
        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());



        System.out.println("\n=== setYear() TESTS ===");

    
        boolean result1 = vehicle1.setYear(2000);
        System.out.println("setYear(2000): " + result1);
        System.out.println("Stored year: " + vehicle1.getYear());
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        boolean result2 = vehicle1.setYear(1885);
        System.out.println("\nsetYear(1885): " + result2);
        System.out.println("Stored year: " + vehicle1.getYear());

      
        boolean result3 = vehicle1.setYear(2027);
        System.out.println("\nsetYear(2027): " + result3);
        System.out.println("Stored year: " + vehicle1.getYear());




        System.out.println("\n=== CONSTRUCTOR VALIDATION ===");

     
        Vehicle invalidVehicle1 =
                new Vehicle("Test", "Vehicle 1", 1885);

        System.out.println("Vehicle with year 1885");
        System.out.println("Initial year: " + invalidVehicle1.getYear());

       
        Vehicle invalidVehicle2 =
                new Vehicle("Test", "Vehicle 2", 2027);

        System.out.println("\nVehicle with year 2027");
        System.out.println("Initial year: " + invalidVehicle2.getYear());
    }
}