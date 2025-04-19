package exceptions;

import java.util.Scanner;

/**
 * Write a program that reads an integer from the user and prints its reciprocal.
 * If the user enters 0, the program should throw an exception and print an error message.
 *
 * @author Avet
 */
public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 0) {
            throw new RuntimeException("input 1 or higher number");
        } else {
            System.out.println("Correct value");
        }
    }

    static {
        System.out.print("input Number: ");
    }
}
