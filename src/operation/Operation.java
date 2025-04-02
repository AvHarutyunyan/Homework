package operation;
import java.util.*;

public class Operation {
    public static void main(String[] args) {
        results(2 * ((5 + 3) * 4 - 8),2 * 5 + 3 * 4 - 8);
        integersResult(3);
        relationalOp(10, 20);
        printResult(2147483647 , 1);
        longEqual((int)1.0);
        falseBoolean(false);
        swapVariableValues(10,5);
        leftShift(10,2);
        rightShift(20,3);
        ofSubtractionLeftShift(15,2);
        rightShift2(15,3);
        integerCast((int)1.0);
        shortCast((short) 1921222);
        writeCodeSumOfValues(100);
        swapVariableValues(10,5);
        sumOfIntegers(8,6);
        multiplicationOfDoubles(6.4,0.03);
        multiplicationOfIntegers(8,6);
        divisionOfIntegers(8,6);
        modulsOfDoubles(6.4,0.03);
        modulsOfIntegers(8,6);
        subtractionOfIntegers(8,6);
        sumOfDoubles(6.4,0.03);
        divisionOfDoubles(6.4,0.03);
        subtractionOfDoubles(6.4,0.03);
        minusE(10);
        minusF(-88);
        minusEPlusNumber(10);
        plusE(10);
        notEqual(true);
        notEqualTwoTimes(true);
        incrementE(10);
        dicrementF(-88);
        andIntegers(8,3);
        orIntegers(8,3);
        xorIntegers(8,3);
        notIntegers(8);
        orBooleanResult(8,3);
        orResult(8,3);
        questionMark(8,3);
        xorIntegerBX(3);
        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
        safer.add(1,"gg");
    }

    /**
     *            Assignment Operator
     * Print the answers to the following expressions in the console:
     * 1) cast Integer
     * @param xv
     */
    public static void integerCast(int xv){
        System.out.println(xv);
    }
    /**
     * 2) cast Short
     *  @param y
     */
    public static void shortCast(short y){;
        System.out.println(y);
    }
    /**
     * 3) sum of Integers
     * @param random
     * @param random2
     */
    public static void printResult(int random, int random2){
        System.out.println(random + random2);
    }
    /**
     * 4) equality long
     * @param x
     */
    public static void longEqual(int x){
        long ya = (x = 3);
        System.out.println(ya);
    }
    /**
     * 5) false Boolean value
     * @param a
     */
    public static void falseBoolean(boolean a){
        System.out.println(a);
    }
    /**
     * Write a program that calculates the sum of the numbers 1-100. (Do not use a loop)
     * @param n
     */
    public static void writeCodeSumOfValues(int n){
       int sum = (n * (n + 1)) / 2;
        System.out.println(sum);
    }
    /**
     * Arithmetic Operators
     * 1. Create 2 variables (int a = 8, int b = 6), print the following in the console:
     * 1) Sum of Integers
     * @param a
     *  @param b
     */
    public static void sumOfIntegers(int a, int b){
        System.out.println(a + b);
    }
    /**
     * 2) Multiplication of integers
     * @param a
     * @param b
     */
    public static void multiplicationOfIntegers(int a, int b){
        System.out.println(a * b);
    }
    /**
     * 3) Division of Integers
     * @param a
     * @param b
     */
    public static void divisionOfIntegers(int a, int b){
        System.out.println(a / b);
    }
    /**
     * 4) Subtraction of Integers
     * @param a
     * @param b
     */
    public static void subtractionOfIntegers(int a, int b){
        System.out.println(a - b);
    }
    /**
     * 5) Moduls of Integers
     * @param a
     *  @param b
     */
    public static void modulsOfIntegers(int a, int b) {
        System.out.println(a % b);
    }
    /**
     * 2. Create 2 variables (double c = 6.4, double d = 0.03), print the following in the console:
     * 1) Sum of Doubles
     * @param c
     * @param d
     */
    public static void sumOfDoubles(double c, double d){
        System.out.println(c + d);
    }
    /**
     * 2) Division of Doubles
     * @param c
     *  @param d
     */
    public static void divisionOfDoubles(double c, double d){
        System.out.println(c / d);
    }
    /**
     * 3) Multiplication of Doubles
     * @param c
     * @param d
     */
    public static void multiplicationOfDoubles(double c, double d){
        System.out.println(c * d);
    }
    /**
     * 4) Subtraction of Doubles
     * @param c
     * @param d
     */
    public static void subtractionOfDoubles(double c, double d){
        System.out.println(c - d);
    }
    /**
     * 5) Moduls of Doubles
     * @param c
     * @param d
     */
    public static void modulsOfDoubles(double c, double d){
        System.out.println(c % d);
    }
    /**
     * 3. Print the answers to the following expressions in the console:
     * @param y
     * @param x
     */
    public static void results(int x, int y) {
        System.out.println(x);
        System.out.println(y);
    }
    /**
     * Unary Operators
     * 4. Create 2 variables (int e = 10, int f = -88, boolean n1 = true), print the following in the console:
     * 1) Negative number
     * @param e
     */
    public static void minusE(int e){
        System.out.println(-e);
    }
    /**
     * 2) Negative number sum
     * @param e
     */
    public static void minusEPlusNumber(int e){
        System.out.println(-e + 92);
    }
    /**
     * 3) minus f-Symbol
     * @param f
     */
    public static void minusF(int f){
        System.out.println(-f);
    }
    /**
     * 4) plus e-Symbol
     * @param e
     */
    public static void plusE(int e){
        System.out.println(+e);
    }
    /**
     * 5) NOT Equal boolean
     * @param n1
     */
    public static void notEqual(boolean n1){
        System.out.println(!n1);
    }
    /**
     * 6) NOT Equality boolean
     * @param n1
     */
    public static void notEqualTwoTimes(boolean n1){
        System.out.println(!(!n1));
    }
    /**
     * 7) Increment e-Symbol
     * @param e
     */
    public static void incrementE(int e){
        System.out.println(e++);
    }
    /**
     * 8) dicrement f-Symbol
     * @param f
     */
    public static void dicrementF(int f) {
        System.out.println(--f);
    }
    /**
     * Unary Operators
     * int x = 3;
     * 9) Integers result
     * @param x
     */
    public static void integersResult(int x){
        int y;
        y = ++x * 5 / x-- + --x;
    System.out.println("x is " + x);
    System.out.println("y is " + y);
    }
    /**
     * Relational Operators
     * 6. Create 2 variables (int x = 10, int y = 20), print the following in the console:
     * @param x
     * @param y
     */
    public static void relationalOp(int x, int y) {
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x >= y);
        System.out.println(x > y);
    }
    /**
     * Bitwise & Logical Operators
     * 1. Create 2 variables (int ax = 8, int bx = 3), print the following in the console:
     * 1) AND Operation Integers
     * @param ax
     * @param bx
     */
    public static void andIntegers(int ax, int bx) {
        System.out.println(ax & bx);
    }
    /**
     * 2) XOR Operation Integers
     * @param ax
     * @param bx
     */
    public static void xorIntegers(int ax, int bx) {
        System.out.println(ax ^ bx);
    }
    /**
     * 3) OR Operation Integers
     * @param ax
     * @param bx
     */
    public static void orIntegers(int ax, int bx) {
        System.out.println(ax | bx);
    }
    /**
     * 4) NOT Operation Integers
     * @param ax
     */
    public static void notIntegers(int ax) {
        System.out.println(~ax);
    }
    /**
     * 5) OR Operation boolean
     * @param ax
     * @param bx
     */
    public static void orBooleanResult(int ax, int bx) {
        System.out.println(true || (ax < 4));
    }
    /**
     * 6) OR Operation Integers
     * @param ax
     * @param bx
     */
    public static void orResult(int ax, int bx) {
        System.out.println((bx >= 6) || (++ax <= 7));
    }
    /**
     * 7) question Mark Integers
     * @param ax
     * @param bx
     */
    public static void questionMark(int ax, int bx) {
        System.out.println((ax < bx) ? ax : bx);
    }
    /**
     * 8) XOR Operation Integer
     * @param bx
     */
    public static void xorIntegerBX (int bx) {
        System.out.println(bx ^ bx);
    }
    /**
     *      Aditional Tasks
     * Declare two int variables, assign 10 and 5, then swap the values of the variables.
     * @param us
     * @param uu
     */
    public static void swapVariableValues(int uu, int us){
        uu = uu ^ us;
        us = uu ^ us;
        uu = uu ^ us;
        System.out.println(uu);
        System.out.println(us);
    }
    /**
     *          Shift Operator
     *1․Print the following to the console:
     * 1) left shift
     * @param jj
     * @param kk
     */
    public static void leftShift(int kk, int jj){
        System.out.println(kk << jj);
    }
    /**
     * 2) left shift
     * @param ko
     * @param ok
     */
    public static void ofSubtractionLeftShift(int ko,int ok){
        System.out.println(ko << ok);
    }
    /**
     * 3) right shift
     * @param lm
     * @param ml
     */
    public static void rightShift(int lm,int ml){
        System.out.println(lm >> ml);
    }
    /**
     * 4) right shift
     * @param yg
     * @param gy
     */
    public static void rightShift2(int yg, int gy){
        System.out.println(yg >> gy);
    }
}