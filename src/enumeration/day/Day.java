package enumeration.day;

/**
 * Exercise 1 (Days of the week)
 * Create an enum called "Day" that contains values for the days of the week.
 * Then, write a class that prints whether a given day is a weekday or weekend.
 * @author Avet
 */
public enum Day {
    MONDEY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

class Check {
    public void weekdayOrNot(Day day) {
        switch (day) {
            case MONDEY:
                System.out.println("Weekday");
                break;
            case TUESDAY:
                System.out.println("Weekday");
                break;
            case WEDNESDAY:
                System.out.println("Weekday");
                break;
            case THURSDAY:
                System.out.println("Weekday");
                break;
            case FRIDAY:
                System.out.println("Weekday");
                break;
            case SATURDAY:
                System.out.println("Weekend");
                break;
            case SUNDAY:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("only Day of Week");
        }
    }

    public static void main(String[] args) {
        Check check = new Check();
        check.weekdayOrNot(Day.SUNDAY);
    }
}
