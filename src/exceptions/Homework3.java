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

    public int readNumbers(int number1,int number2) {
        int result;

      try {
         result = number1/number2;
             // throw new IllegalArgumentException("Error message");
      } catch (ArithmeticException e) {
          throw new RuntimeException("Cannot divide to zero " + e.getMessage());
      }

            return result;
    }

    public static void main(String[] args) {
        Homework3 homework3 = new Homework3();
        Scanner scanner = new Scanner(System.in);


        System.out.print("Write number (not zero!) ");
        int number1 = scanner.nextInt();



        System.out.print("Write second number (not zero!) ");
        int number2 = scanner.nextInt();

        homework3.readNumbers(number1,number2);
        scanner.close();

    }

}
