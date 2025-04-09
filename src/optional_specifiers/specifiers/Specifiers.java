package optional_specifiers.specifiers;

/**
 * Create class with a private static field and a public static method that modifies the value of the fields.
 * Write a Test class to verify that the value of the field is correctly updated/
 */
public class Specifiers {
    private static int number;

    public static int getNumber() {
        return number;
    }

   public static void setNumber(int number) {
       Specifiers.number = number;
    }
}

class test {
    public static void main(String[] args) {
       System.out.println(Specifiers.getNumber());
        Specifiers.setNumber(4);
       System.out.println(Specifiers.getNumber());
      Specifiers.setNumber(77);
       System.out.println(Specifiers.getNumber());
   }
}
