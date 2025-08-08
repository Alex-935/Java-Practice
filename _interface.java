public class _interface {
    
    public static void main(String[] args) {

        /*
          Inferface = A blueprint for a class that specfies a set of abstract methods
                      that imlementing classes MUST define
                      Supports multiple inheritance-like behaviour

                      In inheritance, a class can only have a single parent, but inheritance
                      allows multiple parents
        */
        Rabbit rabbit = new Rabbit();
        Fish fish = new Fish();

        fish.flee();
        fish.hunt();
    }

    public interface Prey {

        void flee();
    }

    public interface Predator {

        void hunt();
    }

    public static class Rabbit implements Prey {

        @Override
        public void flee(){
            System.out.println("The rabbit is running away");
        }
    }

    public static class Hawk implements Predator {

        @Override
        public void hunt(){
            System.out.println("The hawk is hunting");
        }
    }

    public static class Fish implements Prey, Predator {

        @Override
        public void flee(){
            System.out.println("The fish is running away");
        }

        @Override
        public void hunt(){
            System.out.println("The fish is hunting");
        }
    }
}
