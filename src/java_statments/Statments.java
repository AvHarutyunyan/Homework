package java_statments;

import java.util.Scanner;

/**
 * Java Statments
 *
 * @author aveth
 */
public class Statments {
    public static void main(String[] args) {
        checkEvenOdd(20);
        checkEvenOdd(19);
        positiveNegative(1);
        positiveNegative(-1);
        orSmallORBig(30);
        orSmallORBig(19);
        modulCheck(20);
        modulCheck(23);
        modulCheck(14);
        isSecondDigitSeven(974);
        isSecondDigitSeven(846);
        isInsideCircle(9, 6);
        isInsideCircle(6, 0);
        theGreatestNumber(7, 9, 10);
        leapYear(1900);
        leapYear(2024);
        forStatment();
        forStatment2();
        whileStatment(2, 2);
        printSquare(8);
        Scanner scanner = new Scanner(System.in);

        int gg = scanner.nextInt();
        int sum = sumOfMultiplesOfFive(gg);
        System.out.println("The sum of the numbers divisible by 5: " + sum);

        int result = multiplyOfTwoDigitEvenNumbers(20);
        System.out.println("multiple result: " + result);

        double kk = scanner.nextInt();
        double resultt = findAverge(kk);
        System.out.println("arithmetic mean " + resultt);


    }

    /**
     * Write a method that checks whether a given integer x is even or odd.
     *
     * @param x
     */
    public static void checkEvenOdd(int x) {
        if (x % 2 == 0) {
            System.out.println("Value is correct");
        } else {
            System.out.println("Not correct");
        }
    }

    /**
     * Write a method that checks whether a given integer x is positive or negative.
     *
     * @param x
     */
    public static void positiveNegative(int x) {
        if (x > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }

    /**
     * Write a method that checks if a given integer x is either less than 8 and greater than 5
     * Or less than 20 and greater than 15
     *
     * @param x
     */
    public static void orSmallORBig(int x) {
        if (x < 8 && x > 5 || x < 20 && x > 15) {
            System.out.println("Print integer");
        } else {
            System.out.println("Not correct answer");
        }
        /**
         * Write a method that checks whether a given integer can be divided by 5 and 7 without a remainder.
         * @param x
         */
    }

    public static void modulCheck(int x) {
        if (x % 5 == 0 || x % 7 == 0) {
            System.out.println("print departure");
        } else {
            System.out.println("This value is Not correct");
        }

    }

    /**
     * Write a method that checks whether the second digit of a given three-digit number is 7 or not.
     * Example: 974 -> true, 846 -> false
     *
     * @param number
     */
    public static boolean isSecondDigitSeven(int number) {
        if (number < 100 || number > 999) {
            System.out.println("Illegal Argument Exception");
        }

        int secondDigit = (number / 10) % 10;
        return secondDigit == 7;
    }

    /**
     * Write a method that checks whether the point with coordinates (x,y) is in the region K(0,5) or not.
     *
     * @param x
     * @param y
     */
    public static boolean isInsideCircle(double x, double y) {
        double radius = 5;
        double distance = Math.sqrt(x * x + y * y);

        return distance <= radius;
    }

    /**
     * Write a method that finds the largest of 3 given numbers.
     *
     * @param y
     * @param x
     * @param z
     */
    public static void theGreatestNumber(int x, int y, int z) {
        if (x > y && x > z) {
            System.out.println("The greatest number is X: " + x);
        } else if (y > x && y > z) {
            System.out.println("The greatest number is Y: " + y);
        } else if (z > y && z > x) {
            System.out.println("The greatest number is Z: " + z);
        }
    }

    /**
     * Write a method that checks whether a given year is considered a leap year.
     *
     * @param x
     */
    public static void leapYear(int x) {
        if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)) {
            System.out.println(x + " - Leap year");
        } else {
            System.out.println(x + " - Not leap year");
        }
    }

    /**
     * Write a method that prints the numbers 1 to 200 to the console.
     */
    public static void forStatment() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Return i: " + i);
        }
    }

    /**
     * Write a method that prints the first digit of a given number to the console.
     */
    public static void forStatment2() {
        for (int i = 0; i < 200; i++) {
            if (i == 1) {
                break;
            }
            System.out.println("i: " + i);
        }

    }

    /**
     * Given int x = 1, int y = 0. As long as x < 5 and y < 10, print the expression x+y.
     *
     * @param x
     * @param y
     */
    public static void whileStatment(int x, int y) {
        while (x < 5 && y < 10) {
            System.out.println("x + y = " + x + y);
            break;
        }
    }

    /**
     * To write a method that prints a square to the console, use the * symbol.
     *
     * @param size
     */
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Write a method that receives the number N from the console and calculates the sum of all numbers divisible by 5 in the range [1-N]
     *
     * @param n
     */
    public static int sumOfMultiplesOfFive(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Write a method that calculates the product of all two-digit even numbers in [1-N].
     *
     * @param n
     */
    public static int multiplyOfTwoDigitEvenNumbers(int n) {
        int multiple = 1;
        for (int i = 10; i <= n; i++) {
            if (i % 2 == 0) {
                multiple *= i;
            }

        }
        return multiple;
    }

    public static double findAverge(double n) {
        double max = n;
        int min = 1;
        return (max + min) / 2.0;
    }
}


