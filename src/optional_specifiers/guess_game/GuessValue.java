package optional_specifiers.guess_game;

import java.util.Random;
import java.util.Scanner;


/**
 * 3.	Create a class with a static field that is initialized with a random value between 1 and 100.
 * Write a program that allows the user to guess the value of the field.
 * The program should provide feedback to the user indicating whether the guess is too high, too low, or correct.
 * @author aveth
 */
public class GuessValue {
    public static int randomValue = 0;
    static int guessNumber;

    public static void main(String[] args) {
        Random random = new Random();
        randomValue = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);


        do {
            guessNumber = scanner.nextInt();
            if (guessNumber > randomValue) {
                System.out.println("too high");
            } else if (guessNumber < randomValue) {
                System.out.println("too low");
            } else {
                System.out.println("heigidim");
            }

        } while (randomValue != guessNumber);
    }

    static {
        System.out.println("guess number betwen 1-100 : ");
    }
}

