
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _z_date {

    public static void main(String[] args) {
        
        //working wiht date and times
        //LocalDate, LocalTime, LocalDateTime, UTC timestamps

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println(date + " at " + time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        Instant instant = Instant.now();
        System.out.println("The time in UTC is: " + instant);


        //custom format for date and time
        LocalDateTime dateTime2 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        //Custom time
        LocalDate date2 = LocalDate.of(2024, 12, 25);
        System.out.println(date2);

        LocalDateTime dateTime3 = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        System.out.println(dateTime3);
    
        //comparing dates
        //dateTime3 is christmas noon 2024
        LocalDateTime dateTime4 = LocalDateTime.of(2025, 12, 25, 12, 0, 0);
        
        if (dateTime3.isBefore(dateTime4)) {
            System.out.println(dateTime3 + " is before " + dateTime4);
        }
        else if (dateTime4.isBefore(dateTime3)) {
            System.out.println(dateTime3 + " is after " + dateTime4);
        }
        else if (dateTime3.isEqual(dateTime4)) {
            System.out.println("They are both " + dateTime3);
        }
    
    }

}