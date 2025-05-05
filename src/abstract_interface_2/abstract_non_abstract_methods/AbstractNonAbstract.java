package abstract_interface_2.abstract_non_abstract_methods;

/**
 * 8. An abstract class has a construtor which prints "This is constructor of abstract class",
 * an abstract method named 'a_method' and a non-abstract method which prints "This is a normal method of abstract class".
 * A class 'SubClass' inherits the abstract class and has a method named 'a_method' which prints "This is abstract method".
 * Now create an object of 'SubClass' and call the abstract method and the non-abstract method. (Analyse the result)
 * @author Avet
 */
public abstract class AbstractNonAbstract {
    AbstractNonAbstract(){
        System.out.println("This is constructor of abstract class");
    }
    public abstract void aMethod();
    public void nonAbstract(){
        System.out.println("This is a normal method of abstract class");
    }
}
class SubClass extends AbstractNonAbstract {
    public void aMethod(){
        System.out.println("This is abstract method");
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.aMethod();
        subClass.nonAbstract();
    }
}
