package abstract_interface_1.homework_8;

import java.util.Arrays;

/**
 * 	An abstract class has a construtor which prints "This is constructor of abstract class",
 * 	an abstract method named 'a_method' and a non-abstract method which prints "This is a normal method of abstract class".
 * 	A class 'SubClass' inherits the abstract class and has a method named 'a_method' which prints "This is abstract method".
 * 	Now create an object of 'SubClass' and call the abstract method and the non-abstract method. (Analyse the result)
 * @author Avet
 */
public abstract class AbstractTest {
    AbstractTest() {
        System.out.println("This is constructor of abstract class");
    }

    abstract void a_method();

    void concreteMethod() {
        System.out.println("This is a normal method of abstract class");
    }


}

class A extends AbstractTest {


    void a_method() {
        System.out.println("This is abstract method");
    }

    void vhh(){
        System.out.println("sjd");
    }

    public static void main(String[] args) {
      int [] ijii = new int[] {23,43,3,4};
      Arrays.sort(ijii);
        for (int i = 0; i < ijii.length ; i++) {
            System.out.println(ijii[i]);
        }
    }
}
