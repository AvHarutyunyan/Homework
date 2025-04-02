package oop.superclass;

/**
 * 2. Create a class SuperClass which includes the field String message  =  “Hello SuperClass class ”.
 *     Create a class SubClass which inherits from SuperClass and  has String message = “Hello SubClass  class”.
 *     Print both messages using only one object.
 * @author aveth
 */
public class SuperClass {
    public String message = "Hello SuperClass class";

    void print() {
        System.out.println(message);
    }
}

class SubClass extends SuperClass {
    public String message = "Hello SubClass class";

    void print() {
        System.out.println(message);
    }

    void printBothMessages() {
        System.out.println("Child class message: " + message);
        System.out.println("Parent class message: " + super.message);
    }
}

 class Main {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.printBothMessages();
    }
}

