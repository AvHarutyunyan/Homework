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

    public void aVoid() {
        System.out.println("barev");
    }

    public void vah(){
        System.out.println("hi");
    }

}


class Dogs extends Laptop {

    @Override
    public void aVoid(){
        System.out.println("aVoid");
    }
    public void gigaChad(){
        System.out.println("i'm hi");
    }
    public static void main(String[] args) {
        System.out.println(args[1]);
       Laptop dogs = new Dogs();
       dogs.vah();
       dogs.aVoid();

    }

}