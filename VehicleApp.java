// Package: vehicles
package vehicles;

// Vehicle class representing a generic vehicle
class Vehicle {
    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void drive() {
        System.out.println("Driving the " + model);
    }
}

// Car class representing a car, inherits from Vehicle
class Car extends Vehicle {
    private int numOfDoors;

    public Car(String model, int numOfDoors) {
        super(model);
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }
}

// Exception class for when a vehicle runs out of fuel
class OutOfFuelException extends Exception {
    public OutOfFuelException(String message) {
        super(message);
    }
}

// Main class
public class VehicleApp {
    public static void main(String[] args) {
        Car[] cars = new Car[3];

        cars[0] = new Car("Toyota Camry", 4);
        cars[1] = new Car("Honda Civic", 4);
        cars[2] = new Car("Ford Mustang", 2);

        try {
            for (Car car : cars) {
                if (car != null) {
                    car.drive();
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred while driving: " + e.getMessage());
        }
    }
}
