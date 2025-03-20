package arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Arrays exercise
 *
 * @author aveth
 */
public class Arrayss {

    public static void main(String[] args) {
        Arrayss obj = new Arrayss();
        obj.positiveNumbers(7, 6, 5);
        short reverse[] = new short[]{1, 2, 3};
        obj.reverseNumbers(reverse);
        long big[] = new long[]{2, 34, 7, 88};
        obj.largeElement(big);
        float small[] = new float[]{124f, 24f, 234f, 789f};
        obj.smallestElement(small);
        int m[] = new int[]{123, 234, 54, 2, 123};
        obj.changes(m);
        int sum[] = new int[]{3, 5, 6, 7, 8};
        int sum2[] = new int[]{4, 5, 6, 7, 8};
        int[] sumarray = obj.sumArrays(sum, sum2);
        for (int num : sumarray) {
            System.out.print(num + " ");
        }
        int[] numbers = {1, 2, 3, 4, 2, 5, 2, 6};
        int k = 2;
        int result = obj.countOccurrences(numbers, k);
        System.out.println("Number " + k + " appears " + result + " times.");
        int[] tt = new int[]{3, 4, 5};

        int[] array = {1, 2, 3, 2, 1, 4};
        printUniqueTriplets(array);
        int[] numberss = {3, 1, 2, 4, 7, 8, 5, 6};
        obj.oddNumber(numberss);
        System.out.println(Arrays.toString(numberss));

        double[] numbersss = {0.0, 1.5, 2.3, 0.0, 4.6, 0.0, 7.8};
        System.out.println(Arrays.toString(removeZeros(numbersss)));
    }

    /**
     * Write a method that prints the positive elements of an int[] n array
     *
     * @param n
     */
    public void positiveNumbers(int... n) {
        System.out.println(n[0]);
        System.out.println(n[1]);
        System.out.println(n[2]);
    }

    /**
     * Write a method that prints the elements of the short[] s array in reverse order
     * For example: ( 257 -> 752)․
     *
     * @param n
     */
    public void reverseNumbers(short n[]) {
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i] + " ");
        }
    }

    /**
     * Write a method that finds and prints the largest element of a long[] l array.
     *
     * @param l
     */
    public void largeElement(long l[]) {
        int number = 70;
        for (int i = 0; i < l.length; i++) {
            if (l[i] > number) {
                System.out.println(l[i]);
            }
        }
    }

    /**
     * Write a method that finds and prints the smallest element of a float[] f array.
     *
     * @param f
     */
    public void smallestElement(float[] f) {
        float smallest = f[0];
        for (int i = 0; i < f.length; i++) {
            if (f[i] < smallest) {
                System.out.println(f[i]);
            }
        }
    }

    /**
     * Write a method that moves the elements of the int[] n array into the int[] m array.
     *
     * @param n
     * @return ss
     */
    public int[] changes(int n[]) {
        int[] ss = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            ss[i] = n[i];
        }
        return ss;
    }

    /**
     * arrays of the same size, adds the corresponding elements of the arrays, and writes them into a third array.
     *
     * @param n
     * @param m
     * @return sumArray
     */
    public static int[] sumArrays(int[] n, int[] m) {
        int minLength = Math.min(n.length, m.length);
        int[] sumArray = new int[minLength];
        for (int i = 0; i < minLength; i++) {
            sumArray[i] = n[i] + m[i];
        }
        return sumArray;
    }

    /**
     * Counts how many times the given number appears in the array.
     *
     * @param array
     * @param k
     * @return count
     */
    public int countOccurrences(int[] array, int k) {
        int count = 0;
        for (int num : array) {
            if (num == k) {
                count++;
            }
        }
        return count;
    }

    /**
     * Write a method that prints all non-repeating triples in an array. The order of the numbers in the triples is not important.
     *
     * @param arr
     */
    public static void printUniqueTriplets(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                System.out.println("[" + arr[i] + ", " + arr[left] + ", " + arr[right] + "]");

                left++;
                while (left < right && arr[left] == arr[left - 1]) left++;

                right--;
                while (left < right && arr[right] == arr[right + 1]) right--;
            }
        }

    }

    /**
     * Arrange the terms of the given sequence of integers so that the odd ones are at the end.
     *
     * @param n
     */
    public void oddNumber(int n[]) {
        int index = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                int temp = n[i];
                n[i] = n[index];
                n[index] = temp;
                index++;
                System.out.println();
            }
        }
    }

    /**
     * Remove all zeros from the given sequence of real numbers.
     *
     * @param numbers
     */
    public static double[] removeZeros(double[] numbers) {
        ArrayList<Double> list = new ArrayList<>();

        for (double num : numbers) {
            if (num != 0) {
                list.add(num);
            }
        }

        return list.stream().mapToDouble(Double::doubleValue).toArray();
    }

}




