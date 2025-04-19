package exceptions;

import java.util.Scanner;

/**
 * Write a program that accepts an array of integers from the user and calculates the sum of its elements.
 * If the user enters a non-integer value, the program should throw an exception and print an error message.
 * @author Avet
 */
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("input array element: ");
            int size = scanner.nextInt();

            int[] numbers = new int[size];
            int sum = 0;

            System.out.println("input " + size + "  array elements:");

            for (int i = 0; i < size; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
                sum += numbers[i];
            }

            System.out.println("sum of Arrays elements " + sum);
        } catch (Exception e) {
            System.out.println("error message");
        } finally {
            scanner.close();
        }
    }
}
