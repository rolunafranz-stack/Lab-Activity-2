public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Toyota", "Corolla", 1995);
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 2015);
        Vehicle vehicle3 = new Vehicle("Ford", "Mustang", 2020);

        // Vehicle 1
        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());
        System.out.println();

        // Vehicle 2
        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());
        System.out.println();

        // Vehicle 3
        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
        System.out.println();

        // Demonstrate getters
        System.out.println("=== Getters ===");
        System.out.println("Brand: " + vehicle1.getBrand());
        System.out.println("Model: " + vehicle1.getModel());
        System.out.println("Year: " + vehicle1.getYear());
        System.out.println();

        // Test setYear
        System.out.println("=== setYear Tests ===");

        System.out.println("setYear(2000): " + vehicle1.setYear(2000));
        System.out.println("Stored year: " + vehicle1.getYear());
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());
        System.out.println();

        System.out.println("setYear(1885): " + vehicle1.setYear(1885));
        System.out.println("Stored year: " + vehicle1.getYear());
        System.out.println();

        System.out.println("setYear(2027): " + vehicle1.setYear(2027));
        System.out.println("Stored year: " + vehicle1.getYear());
        System.out.println();

        // Constructor validation tests
        System.out.println("=== Constructor Validation Tests ===");

        Vehicle invalidVehicle1 = new Vehicle("Test", "Invalid 1885", 1885);
        System.out.println("New vehicle with year 1885");
        System.out.println("Initial year: " + invalidVehicle1.getYear());
        System.out.println();

        Vehicle invalidVehicle2 = new Vehicle("Test", "Invalid 2027", 2027);
        System.out.println("New vehicle with year 2027");
        System.out.println("Initial year: " + invalidVehicle2.getYear());
    }
}
