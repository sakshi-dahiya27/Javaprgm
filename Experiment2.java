class Vehicle {
    String make, model;
    int year;

    // Constructor
    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Display method
    void display() {
        System.out.println(make + " " + model + " (" + year + ")");
    }
}

// Car class inherits Vehicle
class Car extends Vehicle {
    Car(String make, String model, int year) {
        super(make, model, year); // using super
    }
}

// Motorcycle class inherits Vehicle
class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year) {
        super(make, model, year); // using super
    }
}

// Main class
public class Experiment2 {
    public static void main(String[] args) {
        Car car = new Car("Mahindra", "Scorpio", 2022); // Updated car
        Motorcycle bike = new Motorcycle("Royal Enfield", "Classic", 2023); // Updated bike

        car.display();
        bike.display();
    }
}
