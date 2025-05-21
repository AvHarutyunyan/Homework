package oop_1.parent;

/**
 * 1. Create a class Parent which includes the method showMessage() print “Hello Parent class ”.
 *     Create a class Child which inherits from Parent and  override showMessage() print “Hello Child class”.
 *    Print both messages using only one object.
 * @author aveth
 */

public class Parent {
    public void showMessage() {
        System.out.println("Hello Parent class");
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.showMessage();

    }
}
class Child extends Parent{
    @Override
    public void showMessage() {
        super.showMessage();
        System.out.println("Hello Child class");
    }
    void vahan(){
        System.out.println("vahan");
    }
}