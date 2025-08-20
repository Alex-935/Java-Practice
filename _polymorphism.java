public class _polymorphism {

    public static void main(String[] args) {

        /*
          Polymorphism = Poly - many
                         Morph - shape
                         Objects can identify as other objects
                         Objects can be treated as objects of a common superclass
        */
        
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();
        
        car.go();

         //eachvehicle is identifying as a Class Vehicle despite also being a Car, Bike and Ship
        Vehicle[] vehicles = {car, bike, boat};
        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }

    //interfaces can be used too
    public abstract static class Vehicle {

        //@SuppressWarnings("unused")
        abstract void go();
    }

    public static class Car extends Vehicle {

        @Override
        void go() {
            System.out.println("You drive the car");
        }
    }

    public static class Bike extends Vehicle {

        @Override
        void go() {
            System.out.println("You ride the bike");
        }
    }

    public static class Boat extends Vehicle {

        @Override
        void go() {
            System.out.println("You sail the boat");
        }
    }
}