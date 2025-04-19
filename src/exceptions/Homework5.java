package exceptions;

import java.util.Scanner;

/**
 * Write a program that reads an integer number and  calculates and prints its square root
 * . If the number is  invalid or negative, print "Invalid number".
 * In all  cases finally print "Good bye". Use try-catch-finally.
 */
public class Homework5 {
    Scanner scanner = new Scanner(System.in);

    public void calculateSquareRoot() {
        try {
            int number = scanner.nextInt();
            if (number < 0) {
                throw new ArithmeticException("Why?");
            } else {
                int result = (number * number) / number;
                System.out.println("Result: " + result);
            }
        } catch (ArithmeticException e) {
            System.out.println("Invalid number: " + e.getMessage());
        } finally {
            System.out.println("Good bye");
        }
    }

    public static void main(String[] args) {
        Homework5 homework5 = new Homework5();
        homework5.calculateSquareRoot();
    }

}
