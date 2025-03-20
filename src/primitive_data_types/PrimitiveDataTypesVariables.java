package primitive_data_types;

public class PrimitiveDataTypesVariables {
    public static void main(String[] args) {
        twoBytes((byte) 12, (byte) -128);
        twoShorts((short) 23, (short) -32444);
        twoIntegers(333333, -1231);
        twoLongs(2342352L, -238957923L);
        integersMaxMin();
        byteAndInt((byte) 10, 45);
        twoFloats(234.4F, -24234.33F);
        twoDoubls(214234.323, -23487.232);
        floatingPointNumbersMaxMin();
        floatAndDoublCorrectValues(34.56784F, 8923.1234857);
        twoChars('s', 'o');
        twoCharsAscii('M', 'm');
        charSymbol('K', 'K', 'K');
        twoBooleans(true, false);
        integersCast();
        myIntMyDoubleCast();
        doubleAndIntCast();
        intAndByte();
        findMistake();
        returnNull(7, 8);
        returnHelloWorld(true);
        char result = charReturn('A');
        System.out.println(result);
        float resultt = floatReturn(2.634F, 234.2F);
        System.out.println(resultt);
        int hj = 2;
        ++hj;
        System.out.println(hj);

        int j = 7;



        while (j > 0){
            System.out.println(j);
            j--;
        }

    }

    /**
     * Print two bytes
     * @param a
     * @param b
     */
    public static void twoBytes(byte a, byte b) {
        System.out.println(a);
        System.out.println(b);
    }

    /**
     * print two shorts
     * @param c
     * @param d
     */
    public static void twoShorts(short c, short d) {
        System.out.println(c);
        System.out.println(d);
    }

    /**
     * print two integers
     * @param a
     * @param b
     */
    public static void twoIntegers(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    /**
     * print two longs
     * @param g
     * @param h
     */
    public static void twoLongs(long g, long h) {
        System.out.println(g);
        System.out.println(h);
    }

    /**
     * print Max and Min values
     */
    public static void integersMaxMin() {
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Max int value: " + maxInt);
        int minInt = Integer.MIN_VALUE;
        System.out.println(minInt);
        byte maxByte = 127;
        System.out.println(maxByte);
        byte minByte = -128;
        System.out.println(minByte);
        long maxLong = Long.MAX_VALUE;
        System.out.println(maxLong);
        long minLong = Long.MIN_VALUE;
        System.out.println(minLong);
    }

    /**
     * print byte and int binary values
     * @param binaryByte
     * @param binaryInt
     */
    public static void byteAndInt(byte binaryByte, int binaryInt) {
        System.out.println("Binary byte value: " + binaryByte);
        System.out.println("Binary int value: " + binaryInt);
    }

    /**
     * print two floats
     * @param j
     * @param k
     */
    public static void twoFloats(float j, float k) {
        System.out.println(j);
        System.out.println(k);
    }

    /**
     * print two doubles
     * @param l
     * @param m
     */
    public static void twoDoubls(double l, double m) {
        System.out.println(l);
        System.out.println(m);
    }

    /**
     * print floating point numbers Max and Min
     */
    public static void floatingPointNumbersMaxMin() {
        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        System.out.println(maxFloat);
        System.out.println(minFloat);
        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        System.out.println(maxDouble);
        System.out.println(minDouble);
    }

    /**
     * print correct values
     * @param tt
     * @param dd
     */
    public static void floatAndDoublCorrectValues(float tt, double dd) {
        System.out.println(tt);
        System.out.println(dd);
    }

    /**
     * print two chars
     * @param n
     * @param o
     */
    public static void twoChars(char n, char o) {
        System.out.println(n);
        System.out.println(o);
    }

    /**
     * print Ascii table values in char
     * @param s
     * @param w
     */
    public static void twoCharsAscii(char s, char w) {
        System.out.println(s);
        System.out.println(w);
    }

    /**
     * print all Symbol types in char
     * @param Ascii
     * @param Uni
     * @param Symbol
     */
    public static void charSymbol(char Ascii, char Uni, char Symbol) {
        System.out.println(Ascii);
        System.out.println(Uni);
        System.out.println(Symbol);
    }

    /**
     * print two booleans
     * @param p
     * @param q
     */
    public static void twoBooleans(boolean p, boolean q) {
        System.out.println(p);
        System.out.println(q);
    }

    /**
     * print long cast
     */
    public static void integersCast() {
        int aa = 7;
        long bb = (long) aa;
        System.out.println(bb);
    }

    /**
     * print double cast
     */
    public static void myIntMyDoubleCast() {
        int myInt = 7;
        double MyDouble = (double) myInt;
        System.out.println(MyDouble);
    }

    /**
     * print integer cast
     */
    public static void doubleAndIntCast() {
        double dc = 9.78;
        int ii = (int) dc;
        System.out.println(ii);
    }

    /**
     * print byte cast
     */
    public static void intAndByte() {
        int ff = 9999;
        byte gg = (byte) ff;
        System.out.println(gg);
    }

    /**
     * Find mistake and write correct answer
     */
    public static void findMistake() {
        long max = 31234567L;
        System.out.println(max);
        double ds = (double) 1000.0F;
        char is = 'i';
        long ha = 8L;
        ha += 9L;
        System.out.println(ha);
        int ns = 12;
        int ms = 11;
        System.out.println(ns);
    }

    /**
     * return keyword
     * @param u
     * @param y
     * @return
     */
    public static int returnNull(int u, int y) {
        return 0;
    }

    /**
     * print Hello World
     * @param tr
     */
    public static void returnHelloWorld(boolean tr) {
        System.out.println("Hello World!");
    }

    /**
     * return char value
     * @param rr
     * @return
     */
    public static char charReturn(char rr) {
        return rr;
    }

    /**
     * return float value
     * @param cc
     * @param fg
     * @return
     */
    public static float floatReturn(float cc, float fg) {
        return cc;
    }
}