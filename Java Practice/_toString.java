public class _toString {
    
    public static void main(String[] args) {

        /*
         .toString() = Method inherited from the Object class.
                       Used to return a string representation of an object.
                       By default, it returns a hash code as a unique identifier.
                       It can be overridden to provide meaningful details. 
        */

        Car car = new Car("Ford", "Mustang", 2025, "Red");

        System.out.println(car);
        //before override: _toString$Car@251a69d7
        //after override: Red 2025 Ford Mustang

        
    }

    static class Car {

        String make;
        String model;
        int year;
        String colour;

        Car(String make, String model, int year, String colour) {

            this.make = make;
            this.model = model;
            this.year = year;
            this.colour = colour;
        }

        //yhe toString method is public so we need to override it with a public method
        @Override
        public String toString() {
            return this.colour + " " + this.year + " " + this.make + " " + this.model;
        }

    }

    
}
