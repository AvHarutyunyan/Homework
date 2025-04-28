import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public abstract class Testtt {
    abstract void sound();

    abstract void fag();

    abstract int hoko();// Աբստրակտ մեթոդ

    public void eat() {      // Concrete method
        System.out.println("this animal is eating");
    }
}

class Dogo extends Testtt {
    @Override
    void sound() {
        System.out.println("Dog Barks!");
        System.err.println("error message!!!!!!!!!!!");
    }

    @Override
    void fag() {
        System.out.println("sdsf");
    }

    @Override
    int hoko() {
        return 234;
    }

//    public static void main(String[] args) {
//
//    }

    public static void exception() throws NullPointerException {
        String h = null;
        int x = Integer.parseInt(h);
        if (h == null) {
            System.out.println("Bad");
        }

    }


    }
 class Laptop {
 public void start() {
        try {
             System.out.print("Starting up ");
             throw new Exception();
             } catch (Exception e) {
             System.out.print("Problem ");
            // System.exit(0);
             } finally {
             System.out.print("Shutting down ");
             }
         }

}


 class Dogs {
 public String name;
  public void parseName() {
         System.out.print("1");
         try {
         System.out.print("2");
         int x = Integer.parseInt(name);
         System.out.print("3");
         } catch (NumberFormatException e) {
         System.out.print("4");
         }
         }
 public static void main(String[] args) {
     System.out.println(5/0);
         } }