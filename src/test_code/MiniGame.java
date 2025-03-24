package test_code;

import java.util.Scanner;

/**
 * Write a program that takes a number from the user and checks whether it is an "interesting" number.
 * A number is considered interesting if:
 * It is divisible by 3 or 5
 * @author aveth
 */
public class MiniGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose Y/N to start the game: ");
        char choose = scanner.next().charAt(0);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        do {

            if (choose == 'Y') {
                System.out.println("you choose: " + choose);
            } else if (choose == 'N') {
                System.out.println("you choose: " + choose);
            } else {
                System.out.println("Not correct, please choose Y or N.");
                System.out.print("Choose Y/N to start the game: ");
                choose = scanner.next().charAt(0);
            }
            if (number % 5 == 0 || number % 3 == 0) {
                System.out.println("Interesting Number: " + number);
            } else {
                System.out.println("Not interesting Number: " + number);
            }

            System.out.print("Enter a new number (or 0 to stop): ");
            number = scanner.nextInt();

        } while ((choose == 'Y' || choose == 'N') && number != 0);

    }
}