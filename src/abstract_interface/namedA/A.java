package abstract_interface.namedA;

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
    public void methodOne() {
        System.out.println("This is a methOne method");
    }

    @Override
    public void methSecond() {
        System.out.println("This is a mathSecond");
    }

    public static void main(String[] args) {
        A a = new MyClass();
        a.methodOne();
        a.methSecond();
    }
}
