package optional_specifiers.specifiers;
import java.util.*;
/**
 * 2.	Create a class with a static method that accepts an array of integers and returns the index of the maximum value
 * in the array. Use this method in another class to find the index of the maximum value in a randomly generated array of
 * integers.
 */
public class Specifiers2 {
    public static int indexOfMax(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int max = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        return index;
    }
}
class MaxIndexFinder {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Array: " + Arrays.toString(numbers));

        int maxIndex = Specifiers2.indexOfMax(numbers);
        System.out.println("Index of max value: " + maxIndex);
        System.out.println("Max value: " + numbers[maxIndex]);
    }
}