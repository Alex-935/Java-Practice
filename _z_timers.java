import java.util.Timer;
import java.util.TimerTask;

public class _z_timers {
    
    public static void main(String[] args) {
        
        // Timer = Class that schedules tasks at specific times of peridoically
        //         Useful for: sending notifications, scheduling updates, repetitive actions

        // TimerTask = Represents the task that will be executed by the Timer
        //             You will extend the TimerTask class to define your task
        //             Create subclass of TimerTask and @override run()

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

            int count = 3;

            @Override
            public void run() {
                System.out.println("Hello");
                count --;
                if (count == 0) {
                    System.out.println("Task Complete");
                    timer.cancel();
                }
            }
        };

        /*
        //after 3 seconds, run the task
        timer.schedule(task, 3000);
        */

        //run the task every 3 seconds
        timer.schedule(task, 0, 3000);

    }
}
