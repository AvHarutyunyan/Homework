package exceptions;

import java.io.FileNotFoundException;

/**
 * Create three new types of exceptions. Write a method that throws all three. In main( ),
 * call the method but only use a single catch clause that will catch all three types of exceptions.
 */
public class MyCustomException {

    public static void riskyMethod(int code) throws FirstException, SecondException, ThirdException {
        if (code == 1) {
            throw new FirstException("First Exception occurred");
        } else if (code == 2) {
            throw new SecondException("Second Exception occurred");
        } else if (code == 3) {
            throw new ThirdException("Third Exception occurred");
        } else {
            System.out.println("No exception thrown!");
        }
    }

    // Main method
    public static void main(String[] args)  {
        try {
            riskyMethod(2);
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

    }
}
class FirstException extends Exception {
    public FirstException(String message) {
        super(message);
    }
}

class SecondException extends Exception {
    public  SecondException(String message) {
        super(message);
    }
}

class ThirdException extends Exception {
    public ThirdException(String message) {
        super(message);
    }
}

