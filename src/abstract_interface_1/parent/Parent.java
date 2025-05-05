package abstract_interface_1.parent;

/**
 * 1. Create an abstract class 'Parent' with an abstract method message().
 * It has two subclasses ChildOne & ChildSecond each having an override version of
 * message() method that prints "This is first subclass" and "This is second subclass" respectively.
 * Call the message() by creating an object for each subclass.
 *
 * @author Aveth
 */
public abstract class Parent {
    public abstract String message();
}

class Child1 extends Parent {
    @Override
    public String message() {
        return "This is first subclass";
    }
}

class Child2 extends Parent {
    @Override
    public String message() {
        return "This is second subclass";
    }

    public static void main(String[] args) {
        Parent parent1 = new Child1();
        System.out.println(parent1.message());


        Parent parent2 = new Child2();
        System.out.println(parent2.message());
    }
}