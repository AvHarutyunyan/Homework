package abstract_interface_1.namedA;
import java.time.LocalTime;

/**
 * Write a program to create interface A.
 * In this interface we have two abstract methods methOne() and methSecond().
 * Implements this interface in another class named MyClass.
 *
 * @author Aveth
 */
public interface A {



    void methodOne();

    void methSecond();
}

class MyClass implements A {


    @Override
    public void methodOne()  {
        System.out.println("This is a methOne method");
    }

    @Override
    public void methSecond() {
        System.out.println("This is a mathSecond");
    }

    public static void main(String[] args) {
      char[] array_variable = new char[10];
        for (int i = 0; i < 10; i++) {
            array_variable[i] = 'i';
            System.out.println(array_variable[i] + "");
           // i++;
        }
    }

}
class ASA{
    public static void main(String[] args) {
       A a = new MyClass();

    }
}

