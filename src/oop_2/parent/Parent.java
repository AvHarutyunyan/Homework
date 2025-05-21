package oop_2.parent;

/**
 * 1. Create a class Parent which includes the method
 * showMessage() print “Hello Parent class ”.
 * Create a class Child which inherits from Parent and  override
 * showMessage() print “Hello Child class”.
 * <p>
 * Print both messages using only one object.
 *
 * @author Avet
 */
public class Parent {
    public void showMessage() {
        System.out.println("Hello Parent class");
    }
}

class Child extends Parent {

    @Override
    public void showMessage() {
        System.out.println("Hello Child class");
    }

    /**
     * this method prints Both showMessages
     */
    public void printBothMethods() {
        this.showMessage();
        super.showMessage();
        return;
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.printBothMethods();

        Parent parent = new Child();
        parent.showMessage();
    }
}
