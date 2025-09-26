abstract class Vehicle {
    // abstract method (no body)
    abstract void start();

    // normal method (with body)
    void fuel() {
        System.out.println("This vehicle needs fuel to run.");
    }
}

class Truck extends Vehicle {
    @Override
    void start() {
        System.out.println("Truck starts with a key.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick or button.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Vehicle v1 = new Truck(); // using rerference of abstract class
        v1.start();               // calls Truck's start
        v1.fuel();                // calls Vehicle's fuel

        Vehicle v2 = new Bike();
        v2.start();               // calls Bike's start
        v2.fuel();                // calls Bike's fuel
    }
}
