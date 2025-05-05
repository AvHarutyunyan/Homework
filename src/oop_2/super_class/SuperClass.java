package oop_2.super_class;

/**
 * . Create a class SuperClass which includes the field
 * String message  =  “Hello SuperClass class ”.
 * Create a class SubClass which inherits from SuperClass and  has
 * String message = “Hello SubClass  class”.
 * <p>
 * Print both messages using only one object.
 *
 * @author Avet
 */
public class SuperClass {
    private String message = "Hello SuperClass class";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

class SubClass extends SuperClass {
    public String message = "Hello SubClass";

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    public void printBothMessage() {
        System.out.println(super.getMessage());
        System.out.println(this.getMessage());
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.printBothMessage();
    }
}
