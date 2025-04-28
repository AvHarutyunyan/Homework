import abstract_interface.namedA.A;

import java.util.Locale;

public class ChykaPonterException extends RuntimeException {

    ChykaPonterException(String message){
        super(message);
    }

    public static void qciQci() {
        try {
            int x = 9+7;
            if ( x == x){
                System.out.println("ok");
            }
        }catch (ChykaPonterException e){
            System.out.println("Very bad " + e.getMessage());
        }finally {
            System.out.println("Countiniue");
        }

        int x = 232;
        x += 34;
        System.out.println("x is: " + x);

        System.out.println(DayOfWeek.APRIL.name());

    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("Hello ").append("World").append("!");

        System.out.println(s);
        qciQci();
    }

    static {
        System.out.println("coxswain\n");
    }
}


