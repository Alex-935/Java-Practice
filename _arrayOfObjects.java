public class _arrayOfObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("Charger", "Yellow");

        Car[] cars = {car1, car2, car3};

        for (Car car : cars) {
            car.drive();
        }

        //Using Anonymous objects
        Car[] carsList = {new Car("Mustang", "Red"), 
                          new Car("Corvette", "Blue"),
                          new Car("Charger", "Yellow")};

        for (Car car : cars) {
            car.colour = "Black";
            car.drive();
        }
    }


    static class Car {

        String model;
        String colour;

        Car(String model, String colour) {
            this.model = model;
            this.colour = colour;
        }

        void drive() {
            System.out.println("You drive the " + this.colour + " " + this.model);
        }

    }
}