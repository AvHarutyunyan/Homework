package test_code;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * this page created for my personal homeworks
 *
 * @author aveth
 */
public class Arrays2 {
    public static void main(String[] args) {
        Arrays2 arrays2 = new Arrays2();
        arrays2.arrayOfStrings();
        arrays2.arrayOfIntegers();
        arrays2.arrayOfIntegers();
        arrays2.check();
        arrays2.changeBox();
        arrays2.sortingArray();
        arrays2.matrix();
        int[] numbers = new int[]{3, 2, 1};
//        System.out.println(Arrays.binarySearch(numbers, 2));
//        System.out.println(Arrays.binarySearch(numbers, 2));
        ArrayList<String> g = new ArrayList<>();



    }
    /**
     * Write method which print reverse of these strings
     */
    public void arrayOfStrings() {
        String[] s = new String[]
                {"banana",
                        "cherry",
                        "date",
                        "apple"};
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.println(s[i]);
        }


    }

    /**
     * write method which print parameters of Array
     */
    public void arrayOfIntegers() {
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        for (int gg : array) {
            System.out.println(gg);
        }
    }

    /**
     * write method which print sum of Arrays
     */
    public void sumOfArrays() {
        int[] array1 = new int[6];
        array1[0] = 3;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 1;
        array1[5] = 6;
        System.out.println(array1[0] + array1[1] + array1[2] + array1[3] + array1[4] + array1[5]);
    }

    /**
     * write method which print the biggest Value
     */
    public void theBiggestValue() {

        int[] array2 = new int[]{3, 2, 1, 4};
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > 3) {
                System.out.println("The biggest number is: " + array2[i]);
                break;
            }
        }
    }

    /**
     * Check if Array Contains a Specific Value
     */
    public void check() {
        String[] s = new String[]{"dog", "cat", "bird", "lion"};
        boolean kk = true;
        for (int i = s.length - 1; i >= 0; i--) {
            //   if (s[i] == "cat"){
            //     System.out.println(s[i]);
            //      }
            if (s[i].contains("cat")) {
                System.out.println(kk);
            }
        }
    }

    /**
     * Copy an Array
     */
    public void changeBox() {
        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 34;
        numbers[2] = 43;
        for (int i = 0; i < numbers.length; i++) {
            int[] another = numbers.clone();
            System.out.println(another[i]);
        }

    }

    /**
     * Array Sorting
     */
    public void sortingArray() {
        int[] camry = new int[]{1, 8, 4, 6, 3, 7, 2, 9};
        Arrays.sort(camry);
        for (int i = 0; i < camry.length; i++) {
            System.out.println(camry[i]);
        }

    }

    /**
     * 2D Array
     */
    public void matrix() {
        int[][] matrix01 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < matrix01.length; i++) {
            for (int j = 0; j < matrix01[i].length; j++) {
                System.out.print(matrix01[i][j] + " ");
            }
            System.out.println();

        }

    }
}
