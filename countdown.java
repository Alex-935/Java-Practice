public class countdown {
 
    public static void main(String[] args) throws InterruptedException {
        
        int start = 10;

        for (int i = start; i > 0; i--) {

            System.out.println(i);
            // wait 1000 milli-seconds between each i
            //thread.sleep requires throws InterruptedException in function declaration
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR!");
    }
}
