package exceptions;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 7. Write a program that prompts the user to enter their age.
 * If the user enters an age that is negative or greater than 120,
 * the program should throw an exception and print an error message.
 *
 * @author Avet
 */
public class Homework7 {
    Homework7() {
        System.out.println(9);
    }
   public static void main(String[] args) {
       try {
           throw new ClassCastException();
       } catch (IllegalArgumentException e) {
           throw new IllegalArgumentException();
       } catch (RuntimeException e) {
           throw new NullPointerException();
       } finally {
           throw new RuntimeException();
       }

   }
    {
        System.out.println("ad");
    }
    static {}

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

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
    public static void test(int... n) {
        System.out.println(n[0]); // 1
    }



}

