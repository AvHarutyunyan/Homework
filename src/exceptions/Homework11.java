package exceptions;

import java.util.Scanner;
import java.util.Set;

/**
 * Write a program that reads an input string from the user and performs a series of operations on it,
 * such as converting it to uppercase, reversing it, and counting the number of vowels.
 * However, if the input string is empty or null, or if any of the operations fail due to invalid input,
 * your program should handle these cases and throw appropriate exceptions with clear error messages.
 *
 * @author Avet
 */
public class Homework11 {
    String inputText = null;
    String result = null;
    int countOfVowels = 0;

    public int operationsOfText() {
        Scanner scanner = new Scanner(System.in);
        inputText = scanner.next();

        result = inputText.toUpperCase();

        for (int i = result.length() - 1; i >= 0; i--) {
            System.out.print(result.charAt(i));
            char ch = result.charAt(i);

            Set<Character> vowels = Set.of('A', 'E', 'I', 'O', 'U');

            if (vowels.contains(ch)) {
                countOfVowels++;
            }

        }
        return countOfVowels;
    }

    public static void main(String[] args) {
//        Homework11 homework11 = new Homework11();
//        int count = homework11.operationsOfText();
//        System.out.println("\nNumber of vowels: " + count);

        String s = "jsf";
        String g = "jsf";
        System.out.println(g == s);
    }
}
