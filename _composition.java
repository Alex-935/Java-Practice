public class _composition {
    
    public static void main(String[] args) {
        
        /*
          Composition = Represents a "part-of" relationship between objects
                        For example, an Engine is "part of" a Car.
                        Allows complex objects to be constructed from smaller objects.
        */


        Car car = new Car("Covertte", 2025, "V8");

        System.out.println(car.model + " " + car.year + " " + car.engine.type);

        car.start();
    }

    public static class Car { 

        String model;
        int year;
        Engine engine;

        Car(String model, int year, String engineType) {
            this.model = model;
            this.year = year;
            this.engine = new Engine(engineType);
        }

        void start() {
            this.engine.start();
            System.out.println("The " + this.model + " is run");
        }
    }
    
    public static class Engine {

        String type;

        Engine(String type) {
            this.type = type;          
        }

        void start() {
            System.out.println("Your start the " + this.type + " engine");
        }
    }
}
