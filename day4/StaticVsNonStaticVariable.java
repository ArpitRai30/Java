class Car {
    private String brand; 
    Car(String brand) {
        this.brand = brand;
    }
    // static inner class
    static class Engine {
        void start() {
            System.out.println("Engine is starting...");
        }
    }
    // non-static inner class
    class Dashboard {
        void showBrand() {
            System.out.println("Car brand: " + brand);
        }
    }
}

public class StaticVsNonStaticVariable {
    public static void main(String[] args) {
        // using static nested class (no need of Car object)
        Car.Engine engine = new Car.Engine();
        engine.start();

        //using non-static inener class (needs Car object)
        Car myCar = new Car("Tesla");
        Car.Dashboard dashboard = myCar.new Dashboard();
        dashboard.showBrand();
    }
}
