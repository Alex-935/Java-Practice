import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class countdownTimer {
    
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("How long do you want your timer to be?: ");
        int response = scanner.nextInt();


        Timer timer = new Timer();

        TimerTask countdown = new TimerTask() {

            int time = response;
            
            @Override
            public void run(){

                System.out.println(time);
                time --;

                if (time < 0) {

                    System.out.println("BOOM!");
                    timer.cancel();
                }

            };
        };

        timer.scheduleAtFixedRate(countdown, 0, 1000);
    }
}
