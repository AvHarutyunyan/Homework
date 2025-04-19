package exceptions;

import java.util.Scanner;

/**
 * 7. Write a program that prompts the user to enter their age.
 * If the user enters an age that is negative or greater than 120,
 * the program should throw an exception and print an error message.
 *
 * @author Avet
 */
public class Homework7 {
    public static void main(String[] args) {
        System.out.print("input your age! ");
        Homework7 homework7 = new Homework7();
        homework7.checkNumber();
    }

    public void checkNumber() {
        try {
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();

            if (age < 0 || age > 120) {
                throw new IllegalArgumentException("Age must be between 0 and 120");
            } else {
                System.out.println("Valid age: " + age);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
