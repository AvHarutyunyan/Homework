package optional_specifiers.date_time_calculation;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * 4.	Create a class with a final static field that is initialized with the current date and time.
 * Write a program that calculates the number of seconds that have elapsed since the field was initialized.
 * @author aveth
 */
public class TimeTracker {
    final static LocalDateTime current = LocalDateTime.now();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("waiting 5 seconds...");
        Thread.sleep(5000);

        LocalDateTime now = LocalDateTime.now();


        Duration duration = Duration.between(current, now);
        long secondsElapsed = duration.getSeconds();

        System.out.println("past seconds " + secondsElapsed);

    }
}

