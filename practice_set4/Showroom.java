// Base Class
class Vehicle {

    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    // Constructor
    Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
        System.out.println("Vehicle Constructor Called");
    }

    // Method
    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass Car
class Car extends Vehicle {

    protected int numberOfSeats;
    protected boolean ACavailable;

    // Constructor (Constructor Chaining)
    Car(String vehicleNumber, String brand, String fuelType,
        int numberOfSeats, boolean ACavailable) {

        super(vehicleNumber, brand, fuelType);  // Call parent constructor
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;

        System.out.println("Car Constructor Called");
    }

    // Overriding method
    @Override
    void displayDetails() {
        super.displayDetails();   // Call parent method
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

// Subclass ElectricCar (Multi-level Inheritance)
class ElectricCar extends Car {

    private double batteryCapacity;
    private double chargingTime;

    // Constructor
    ElectricCar(String vehicleNumber, String brand,
                int numberOfSeats, boolean ACavailable,
                double batteryCapacity, double chargingTime) {

        super(vehicleNumber, brand, "Electric",
              numberOfSeats, ACavailable);

        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;

        System.out.println("ElectricCar Constructor Called");
    }

    // Overriding method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity (kWh): " + batteryCapacity);
        System.out.println("Charging Time (hrs): " + chargingTime);
    }

    // Subclass-specific method
    void ecoMode() {
        System.out.println("Eco Mode Activated!");
    }
}

// Main Class
public class Showroom {
    public static void main(String[] args) {

        System.out.println("---- Vehicle Object ----");
        Vehicle v1 = new Vehicle("GJ01AB1234", "Honda", "Petrol");
        v1.displayDetails();

        System.out.println("\n---- Car Object ----");
        Vehicle v2 = new Car("GJ02CD5678", "Hyundai", "Diesel", 5, true);
        v2.displayDetails();  // Upcasting

        System.out.println("\n---- Electric Car Object ----");
        Vehicle v3 = new ElectricCar("GJ03EF9999", "Tesla",
                5, true, 75.0, 1.5);
        v3.displayDetails();  // Runtime Polymorphism

        // Downcasting using instanceof
        if (v3 instanceof ElectricCar) {
            ElectricCar ec = (ElectricCar) v3;  // Downcasting
            ec.ecoMode();
        }
    }
}
