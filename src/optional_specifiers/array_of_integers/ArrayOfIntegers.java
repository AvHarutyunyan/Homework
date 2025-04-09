package optional_specifiers.array_of_integers;

import java.util.Arrays;
import java.util.Random;

/**
 * 9.	Create a class with a static method that accepts an array of
 * integers and returns a new array containing only the even numbers.
 * Use this method in another class to filter out the even numbers in a randomly generated array of integers.
 */
public class ArrayOfIntegers {

    public static int[] arraysOf(int... arr) {

        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }


        int[] result = new int[count];
        int index = 0;


        for (int num : arr) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        AnotherArrays.arraysBox();
    }
}

class AnotherArrays {

    public static void arraysBox() {
        Random random = new Random();


        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1, 500);
        }
        System.out.println("Original array: " + Arrays.toString(numbers));

        int[] evenNumbers = ArrayOfIntegers.arraysOf(numbers);
        System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
    }
}

