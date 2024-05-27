// Step 1: Create the Abstract Class
// Abstract class Vehicle, yo!
abstract class Vehicle {
    private String make; // Make of the vehicle, like a boss
    private String model; // Model, just like Heisenberg's Blue Meth
    private int year; // Year, because even Heisenberg's empire had a timeline

    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Abstract method to calculate fuel efficiency
    public abstract double calculateFuelEfficiency(); // Just like calculating purity

    // Getters for the attributes
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

// Step 2: Create the Concrete Class Car
// Concrete class Car, because not everything can be a mobile meth lab
class Car extends Vehicle {
    private double milesDriven; // How far did you drive, Jesse?
    private double fuelConsumed; // How much fuel, like those trips to Los Pollos Hermanos

    // Constructor
    public Car(String make, String model, int year, double milesDriven, double fuelConsumed) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
    }

    // Override the calculateFuelEfficiency method
    @Override
    public double calculateFuelEfficiency() {
        return milesDriven / fuelConsumed; // Efficiency like cooking pure blue crystal
    }

    // Getters for the attributes
    public double getMilesDriven() {
        return milesDriven;
    }

    public double getFuelConsumed() {
        return fuelConsumed;
    }
}

// Step 3: Create the Concrete Class Truck
// Concrete class Truck, because you need a big boy to move all that product
class Truck extends Vehicle {
    private double milesDriven; // How many miles, like those long hauls with the RV
    private double fuelConsumed; // How much fuel, like Hank chasing you down
    private double cargoWeight; // Weight of the cargo, because we all know how heavy the product is

    // Constructor
    public Truck(String make, String model, int year, double milesDriven, double fuelConsumed, double cargoWeight) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
        this.cargoWeight = cargoWeight;
    }

    // Override the calculateFuelEfficiency method
    @Override
    public double calculateFuelEfficiency() {
        return milesDriven / (fuelConsumed + (cargoWeight * 0.5)); // Efficiency calculation, just like calculating risk
    }

    // Getters for the attributes
    public double getMilesDriven() {
        return milesDriven;
    }

    public double getFuelConsumed() {
        return fuelConsumed;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }
}

// Step 4: Create the Main Class to Test the Implementation
// Main class to test the implementation, like testing a new batch
public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car("Toyota", "Corolla", 2020, 500, 25);
        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Year: " + car.getYear());
        System.out.println("Car Fuel Efficiency: " + car.calculateFuelEfficiency() + " miles per gallon");

        // Create a Truck object
        Truck truck = new Truck("Ford", "F-150", 2021, 800, 40, 2);
        System.out.println("\nTruck Make: " + truck.getMake());
        System.out.println("Truck Model: " + truck.getModel());
        System.out.println("Truck Year: " + truck.getYear());
        System.out.println("Truck Fuel Efficiency: " + truck.calculateFuelEfficiency() + " miles per gallon");
    }
}
