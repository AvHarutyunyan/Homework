package exceptions;

import java.util.Scanner;

/**
 * Write a program that reads two integers from the user and calculates their quotient.
 * If the second integer is 0 or negative, the program should throw an exception and print an error message.
 *
 * @author Avet
 */
public class Homework9 {
    int number1 = 0;
    int number2 = 0;
    int result = 0;

    public void numbersQuotient() {
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        number2 = scanner.nextInt();
        try {
            if (number2 <= 0) {
                throw new IllegalArgumentException("Error message");
            } else {
                result = number1 / number2;
                System.out.println("Quotient is: " + result);
            }
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Not Valid Number: " + e.getMessage());
        }
    }

    static {
        System.out.print("Enter First Number: ");
    }

    public static void main(String[] args) {
        Homework9 homework9 = new Homework9();
        homework9.numbersQuotient();
    }
}
