

public class _z_generics {
    
    public static void main(String[] args) {


        // Generics = A concept where you can write a class, interface, or method
                    //that is compatible with different data types.
                    //<T> type parameter (placeholder that gets replaced with a real type)
                    //<String> type arguement (specifies the type)

    
        Box<String> box = new Box<>();
        box.setItem("Banana");
        System.out.println(box.getItem());


        Box<Integer> box2 = new Box<>();
        box2.setItem(3);
        System.out.println(box2.getItem());

        Product<String, Double> product = new Product<>("Chocolate", 1.23);
        System.out.println("The price of the " + product.getItem() + " is: £" + product.getPrice());

    }

    public static class Box<T> {

        T item;

        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return this.item;
        }
        
    }


    public static class Product<T, U> {

        T item;
        U price;

        Product(T item, U price) {
            this.item = item;
            this.price = price;
        }

        public T getItem() {
            return this.item;
        }

        public U getPrice() {
            return this.price;
        }
    }
}
