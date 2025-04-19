package exceptions;

import java.util.Scanner;

/**
 * Write a program that reads two numbers from the user and divides them.
 * If the user enters 0 as the second number,
 * the program should throw an exception and print an error message.
 *
 * @author Avet
 */
public class Homework3 {

    Scanner scanner = new Scanner(System.in);

    public void readNumbers() {
        int result;

        int number1 = scanner.nextInt();
        System.out.print("Write second number (not zero!) ");

        if (number1 == 0) {
            throw new IllegalArgumentException("Error message");
        }
        int number2 = scanner.nextInt();

        if (number2 == 0) {
            throw new IllegalArgumentException("Error message");
        } else {
            result = number1 % number2;
            System.out.print("Cool! the Result of numbers is: " + result);

            scanner.close();
        }
    }

    static {
        System.out.print("Write number (not zero!) ");
    }

    public static void main(String[] args) {
        Homework3 homework3 = new Homework3();
        homework3.readNumbers();

    }

}
