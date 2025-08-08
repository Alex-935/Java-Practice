

public class _gettersAndSetters {
    
    public static void main(String[] args) {
        
        /*
          They help protect object data and add rules for accessing or modifying them
          Getters - Methods that make a field readable
          Setters - Methods that make a field writeable
        */

        Car car = new Car("Charger", "Yellow", 10000);

        System.out.println(car.getModel() + " " + car.getColour() + " " + car.getPrice());
        
        car.setColour("Blue");
        car.setPrice(-9000);
        car.setPrice(9000);

        System.out.println(car.getModel() + " " + car.getColour() + " " + car.getPrice());
    }

    public static class Car {

        //final makes sure the value cannot change
        private final String model;
        private String colour;
        private int price;

        Car(String model, String colour, int price) {

            this.model = model;
            this.colour = colour;
            this.price = price;

        }

        //getters  type getProperty() {}
        String getModel() {
            return this.model;
        }

        String getColour() {
            return this.colour;
        }

        String getPrice() {
            return "£" + this.price;
        }


        //setters  void setProperty() {}
        void setColour(String colour) {
            this.colour = colour;
        }

        void setPrice(int price) {
            if (price < 0) {
                System.out.println("Price cannot be less than 0");
            } else {
                this.price = price;
            }
        }
    }
}
