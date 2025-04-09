package optional_specifiers.factorial;

import java.util.Random;

public class Factorial {
    public static int count = 1;

    public static void main(String[] args) {
        // factorialCalculator(8);
        RandomNumbers.randomNumber();
    }

    public static void factorialCalculator(int n) {
        for (int i = 1; i <= n; i++) {
            count *= i;
            System.out.println(count);
        }
        System.out.println();
    }
}
