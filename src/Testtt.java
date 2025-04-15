import java.util.Scanner;

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

    public static void main(String[] args) {
        Testtt testtt = new Dogo();
        testtt.sound();
        testtt.fag();
        System.out.println(testtt.hoko());
    }
}