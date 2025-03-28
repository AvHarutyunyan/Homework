package date_time;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * DateTime
 * @author aveth
 */
public class DateTimeJava {
    public static void main(String[] args) {
        DateTimeJava dateTimeJava = new DateTimeJava();
        dateTimeJava.dateTimeMow();
        dateTimeJava.timeZone();
        dateTimeJava.calendar();
        dateTimeJava.addSubtract();
        dateTimeJava.format();
        dateTimeJava.DurationBetweenDates();
        dateTimeJava.specificDate();
    }

    /**
     * Write a program to display the current date and time using the Date class.
     */
    public void dateTimeMow(){
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
    }

    /**
     * Write a program to display the current date and time in a specific time zone using the TimeZone class.
     */
    public void timeZone(){
        ZonedDateTime yerevanTime = ZonedDateTime.now(ZoneId.of("Asia/Yerevan"));
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime londonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));

        System.out.println("Yerevan Time: " + yerevanTime);
        System.out.println("New York Time: " + newYorkTime);
        System.out.println("London Time: " + londonTime);
    }

    /**
     * Write a program to create a calendar for a specific date using
     */
    public void calendar(){
        LocalDate date = LocalDate.of(1998,12,4);
        System.out.println(date);
    }
    /**
     * Write a program to add or subtract a specified number of days from a calendar
     */
    public void addSubtract(){
        LocalDate today = LocalDate.now();
        System.out.println("Current " + today);
        LocalDate futureDate = today.plusDays(10);
        System.out.println("Future " + futureDate);

        LocalDate pastDate = today.minusDays(5);
        System.out.println("Old " + pastDate);
    }
    /**
     * Write a program to format a date
     */
    public void format(){
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Current Month,Day " + formattedDateTime);
    }

    /**
     * Write a program to parse a date string using the SimpleDateFormat class.
     */
    public void DurationBetweenDates(){
        LocalDate startDate = LocalDate.of(2025, 3, 1); // 1 March 2025
        LocalDate endDate = LocalDate.of(2025, 3, 28); // 28 March 2025
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("The duration between the two dates is: " + daysBetween + " days.");
    }

    /**
     * Write a program to create a LocalDate object representing a specific date.
     * convert it to a ZonedDateTime object in a specific time zone
     */
    public void specificDate(){
        LocalDateTime date = LocalDateTime.of(2017,Month.APRIL,3 ,3,30);
        System.out.println("dateTime is: " + date);
        ZoneId zoneId = ZoneId.of("Asia/Yerevan");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date , zoneId);
        System.out.println("The ZonedDataTime: " + zonedDateTime);
    }

}





