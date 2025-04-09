package optional_specifiers.factorial;

import java.util.Random;

public class RandomNumbers {
    public static void randomNumber() {
        Random random = new Random();
        int number = random.nextInt(1, 10);
        Factorial.factorialCalculator(number);
    }

    public static void main(String[] args) {

    }
}
