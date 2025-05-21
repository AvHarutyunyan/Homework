import java.util.Enumeration;

public enum DayOfWeek {
   HUNVAR,
    PETRVAR,
    MART,
    APRIL,
    MAYIS,
    HUNIS,
    HULIS,
    OGOSTOS,
    SEPTEMBER ,
    HOKTEMBER,
    NOYEMBER,
    DEKTEMBER
}
class sd{
 public static void main(String[] args) {
  System.out.println(DayOfWeek.APRIL.getDeclaringClass());
  for (DayOfWeek day : DayOfWeek.values())
  System.out.println(day);
 }
}
