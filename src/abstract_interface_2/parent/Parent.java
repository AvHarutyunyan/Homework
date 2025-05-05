package abstract_interface_2.parent;

/**
 * 1.	Create an abstract class 'Parent' with an abstract method message().
 * It has two subclasses ChildOne & ChildSecond each having an override version of
 * message() method that prints "This is first subclass" and "This is second subclass" respectively.
 * Call the message()  by creating an object for each subclass.
 *
 * @author Avet
 */
public abstract class Parent {
    public abstract void message();
}

class ChildOne extends Parent {
    @Override
    public void message() {
        System.out.println("This is first subclass");
    }
}

class ChildSecond extends Parent {
    @Override
    public void message() {
        System.out.println("This is second subclass");
    }

    public static void main(String[] args) {
        Parent parent = new ChildSecond();
        parent.message();

        Parent parent1 = new ChildOne();
        parent1.message();
    }
}
