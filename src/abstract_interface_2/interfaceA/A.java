package abstract_interface_2.interfaceA;

/**
 * 3.	Write a program to create interface A.
 * In this interface we have two abstract methods methOne() and methSecond().
 * Implements this interface in another class named MyClass.
 * @author Avet
 */
public interface A {
    void methOne();
    void methSecond();
}
class MyClass implements A {
    @Override
    public void methOne(){
        System.out.println("This is a first method");
    }
    @Override
    public void methSecond(){
        System.out.println("This is a Second method");
    }

    public static void main(String[] args) {
        A a = new MyClass();
        a.methOne();
        a.methSecond();
    }
}
