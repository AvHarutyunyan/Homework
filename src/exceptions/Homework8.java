package exceptions;

import java.util.Scanner;

/**
 * Write a program that reads a string from the user and checks if it is a valid email address.
 * If the string is not a valid email address,
 * the program should throw an exception and print an error message.
 *
 * @author Avet
 */
public class Homework8 {
    String emailAddres = null;
    private String validEmailAddress = "aveth999@gmail.com";

    public String getValidEmailAddress() {
        return validEmailAddress;
    }

    public static void main(String[] args) {
        Homework8 homework8 = new Homework8();
        homework8.checkEmailAddress();
    }

    public void checkEmailAddress() {
        Scanner scanner = new Scanner(System.in);
        emailAddres = scanner.next();
        try {
            if (emailAddres.equals(getValidEmailAddress())) {
                System.out.println("you sucessfuly enterned");
            } else {
                throw new IllegalArgumentException("Error message");
            }
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Not valid Address! " + e.getMessage());
        }

    }

    static {
        System.out.print("(Welcome) input your email adrress: ");
    }

}
