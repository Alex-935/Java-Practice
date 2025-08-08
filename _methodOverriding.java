public class _methodOverriding {

    public static void main(String[] args) {
        
        /*
         Method overriding = when a subclass provides it's own
                             implementation of a method that is already defined
                             Allows for code reusability and give specific implementations.
        */

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }


    static class Animal {
        
        void move() {
            System.out.println("This animal is running");
        }
    }

    static class Dog extends Animal {
        
    
    }

    static class Cat extends Animal {
        
        
    }

    static class Fish extends Animal {

        //override should be included to indicate to you and other devs that its an override
        @Override
        void move() {
            System.out.println("This animal is swimming");
        }
    }
}