package Project;
public class Operation {
    public static void main(String[] args) {
        twoIntegers(8, 6);
        twoDoubles(6.4, 0.03);
        results();
        twoIntegeresAndBool(10, -88, true);
        twoIntegeresAndBool(10, -88, true);
        integersResult();
        relationalOp(10, 20);
        twoIntegerss(8, 3);

/**
 *            Assignment Operator
 * Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները`
 */
        int x = (int) 1.0;
        short y = (short) 1921222;
        System.out.print(2147483647 + 1);
        long ya = (x = 3);
        boolean a = false;
        // boolean b = (ya = true);
        System.out.println(x);
        System.out.println(y);
        System.out.println(ya);
        System.out.println(a);

        /**
         *      Aditional Tasks
         * Հայտարարել երկու int տիպի փոփոխականներ, վերագրել 10 և 5 այնուհետև փոփոխականի արժեքները տեղերով փոխել։
         */
        int uu = 10;
        int us = 5;
        uu = uu ^ us;
        us = uu ^ us;
        uu = uu ^ us;
        System.out.println(uu);
        System.out.println(us);
        /**
         *  Գրել ծրագիր, որը հաշվում է  1-100 թվերի գումարը։ (ցիկլ չoգտագործել)
         */

        int n = 100;
        int sum = (n * (n + 1)) / 2;
        System.out.println(sum);
        /**
         *          Shift Operator
         *1․ Տպել console -ում  հետևյալը․
         */
        System.out.println(10 << 2);
        System.out.println(-10 << 3);
        System.out.println(20 >> 3);
        System.out.println(15 >> 3);
        //2․ Տրված փոփոխականը բազմապատկեք 8-ով և 16-ով առանց օգտագործելու *-նշանը։
        System.out.println("10 << 2 = " + (10 << 2));
        System.out.println("-10 << 3 = " + (-10 << 3));
        System.out.println("20 >> 2 = " + (20 >> 2));
        System.out.println("15 >> 3 = " + (15 >> 3));

    }
    /**
     *      Arithmetic Operators
     *1․ Ստեղծել 2 փոփոխական(int a = 8, int b = 6), տպել console -ում  հետևյալը․
     * @param a
     * @param b
     */
    public static void twoIntegers(int a , int b){
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a-b);
        System.out.println(a%b);
    }

    /**
     * 2․ Ստեղծել 2 փոփոխական(double c = 6.4, double d = 0.03), տպել  console -ում հետևյալը.
     * @param c
     * @param d
     */
    public static void twoDoubles(double c,double d){
        System.out.println(c+d);
        System.out.println(c*d);
        System.out.println(c/d);
        System.out.println(c-d);
        System.out.println(c%d);
    }

    /**
     * 3․ Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները`
     */
    public static void results(){
        int x = 2 * ((5 + 3) * 4 - 8);
        int y = 2 * 5 + 3 * 4 - 8;
        System.out.println(x);
        System.out.println(y);
    }
    /**
     * @param e
     * @param f
     * @param n1
     *      Unary Operators
     *4․ Ստեղծել 2 փոփոխական(int e = 10,  int f = -88, boolean n1 = true), տպել console -ում  հետևյալը․
     */
    public static void twoIntegeresAndBool(int e, int f, boolean n1 ){
        System.out.println(-e);
        System.out.println(-f);
        System.out.println(+e);
        System.out.println(-e +92);
        System.out.println(!n1);
        System.out.println(!(!n1));
        System.out.println(e++);
        System.out.println(--f);
    }
    public static void integersResult() {
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
    /**
     *       Relational Operators
     * 6․ Ստեղծել 2 փոփոխական(int x = 10, int y = 20), տպել console -ում  հետևյալը․
     * @param x
     * @param y
     */
    public static void relationalOp(int x , int y){
        	System.out.println(x < y);
        	System.out.println(x <= y);
        	System.out.println(x >= y);
        	System.out.println(x > y);
    }
    /**
     *       Bitwise & Logical Operators
     * 1․ Ստեղծել 2 փոփոխական(int ax = 8, int bx = 3), տպել console -ում  հետևյալը․
     * @param ax
     * @param bx
     */
    public static void twoIntegerss(int ax, int bx){
        System.out.println(ax & bx);
        System.out.println(ax ^ bx);
        System.out.println(ax | bx);
        System.out.println( ~ax);
        System.out.println(true || (ax < 4));
        System.out.println((bx >= 6) || (++ax <= 7));
        System.out.println((ax<bx)?ax:bx);
        System.out.println(bx^bx);
    }




}
