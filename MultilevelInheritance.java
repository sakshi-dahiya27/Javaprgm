// Base class
class Vehicle {
    String type = "Four Wheeler";

    void start() {
        System.out.println(type + " is starting...");
    }
}

// First child class (inherits from Vehicle)
class Car extends Vehicle {
    String brand = "Mahindra";

    void drive() {
        System.out.println(brand + " car is being driven.");
    }
}

// Second child class (inherits from Car)
class SUV extends Car {
    String category = "Sports Utility Vehicle";

    void offRoadDrive() {
        System.out.println(brand + " " + category + " is great for off-road driving.");
    }
}

// Third child class (inherits from SUV)
class Scorpio extends SUV {
    String model = "Scorpio-N";

    void showFeatures() {
        System.out.println(brand + " " + model + " has advanced features like ADAS and 4x4 drive.");
    }
}

// Main class
public class MultilevelInheritance{
    public static void main(String[] args) {
        Scorpio myScorpio = new Scorpio();

        // Accessing methods from all ancestor classes
        myScorpio.start();       // From Vehicle class
        myScorpio.drive();       // From Car class
        myScorpio.offRoadDrive();// From SUV class
        myScorpio.showFeatures();// From Scorpio class
    }
}
