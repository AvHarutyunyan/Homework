import java.util.Arrays;

public class DayOfWeekParent {
    public static void main(String[] args) {
        System.out.println(DayOfWeek.APRIL.ordinal());
        System.out.println(DayOfWeek.valueOf("APRIL"));
        System.out.println(Arrays.toString(DayOfWeek.values()));
    }
}
