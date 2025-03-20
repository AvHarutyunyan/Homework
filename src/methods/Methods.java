package methods;

public class Methods {
    public static void main(String[] args) {
         //Group(Integer)
     twoBytes((byte)12,(byte)-128);
     twoShorts((short)23,(short)-32444);
    twoIntegers(333333,-1231);
    twoLongs((long)2342352,(long)-238957923);
   integersMaxMin();
        byteAndInt((byte)0b00001010,0b00101101);

        //Group(Floating point number)

        twoFloats((float) 234.4f,(float) -24234.33f);
        twoDoubls((double) 214234.323d,(double) -23487.232d);
       floatingPointNumbersMaxMin();
        floatAndDoublCorrectValues((float)34.567839023f,(double) 8923.1234857d);

          //Group(Character)
        twoChars((char)'s',(char)'o');
       twoCharsAscii((char)77,(char)109);
        charSymbol((char)75,(char)'\u004B',(char)75);

          //Group(Boolean)
       twoBooleans((boolean) true,(boolean) false);

        //int year = 201|; //Int tipy pahuma miayn tvain arjeq (error)
        //System.out.println(year);

          //Java Type Casting
        integersCast();
        myIntMyDoubleCast();
        doubleAndIntCast();
        intAndByte();
        findMistake();
        returnNull(7,8);
        returnHelloWorld(true);
        char result = charReturn('A');
        System.out.println(result);
        float resultt = floatReturn((float)2.634f, (float) 234.2f);
        System.out.println(resultt);

        int hj = 2;
        int x2;
        x2 = ++hj;
        System.out.println(x2);
    }

    /**
     * Create 2 variables (byte a and byte b ), assign arbitrary values and print to the console:
     * @param a
     * @param b
     */
    public static void twoBytes(byte a, byte b) {
        System.out.println(a);
        System.out.println(b);
    }
    /**
     * Create 2 variables (short c and short d ), assign arbitrary values and print to console
     * @param c
     * @param d
     */
    public static void twoShorts(short c, short d) {

        System.out.println(c);
        System.out.println(d);
    }
    /**
     * Create 2 variables (int e and int f ), assign arbitrary values and print them to the console.
     * @param a
     * @param b
     */
    public static void twoIntegers(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }
    /**
     * Create 2 variables (long g and long h ), assign arbitrary values and print to the console:
     * @param g
     * @param h
     */
    public static void twoLongs(long g ,long h ){
        System.out.println(g);
        System.out.println(h);
    }
    /**
     * Print byte, short, int and long Max & Min values
     */
    public static void integersMaxMin(){
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Max int value: " + maxInt);
        int minInt = Integer.MIN_VALUE;
        System.out.println(minInt);

        byte maxByte = Byte.MAX_VALUE;
        System.out.println(maxByte);
        byte minByte = Byte.MIN_VALUE;
        System.out.println(minByte);

        long maxLong = Long.MAX_VALUE;
        System.out.println(maxLong);
        long minLong = Long.MIN_VALUE;
        System.out.println(minLong);
    }
    /**
     * Create 2 variables (byte and int), assign arbitrary values to each in the form of 2, and print them to the console.
     * @param binaryByte
     * @param binaryInt
     */
    public static void byteAndInt(byte binaryByte, int binaryInt ){
        System.out.println("Binary byte value: " + binaryByte);
        System.out.println("Binary int value: " + binaryInt);
    }
    /**
     * Create 2 variables (float j and float k ), assign arbitrary values and print to the console:
     * @param j
     * @param k
     */
    public static void twoFloats(float j, float k){
        System.out.println(j);
        System.out.println(k);
    }
    /**
     *Create 2 variables (double l and double m ), assign arbitrary values and print them to the console.
     * @param l
     * @param m
     */
    public static void twoDoubls(double l , double m){
        System.out.println(l);
        System.out.println(m);
    }
    /**
     * Print float and double max and min values
     */
    public static void floatingPointNumbersMaxMin(){
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
     * Which of the following values can be assigned to a variable of type float,
     * and which to a double: 34.567839023, 12.345, 8923.1234857, 3456.091?
     * @param dd
     * @param tt
     */
    public static void floatAndDoublCorrectValues(float tt , double dd){
        System.out.println(tt);
        System.out.println(dd);
    }
    /**
     * Create 2 variables (char n and char o ),
     * assign arbitrary values and print to console.
     * @param n
     * @param o
     */
    public static void twoChars(char n, char o){
        System.out.println(n);
        System.out.println(o);
    }
    /**
     * print char s = 77 and char w = 109
     * @param s
     * @param w
     */
    public static void twoCharsAscii(char s,char w){
        System.out.println(s);
        System.out.println(w);
    }
    /**
     * Print the symbol "K" in all possible variations.
     * @param Ascii
     * @param Uni
     * @param Symbol
     */
    public static void charSymbol(char Ascii, char Uni , char Symbol){
        System.out.println(Ascii);
        System.out.println(Uni);
        System.out.println(Symbol);
    }
    /**
     * create two variables boolean
     * @param p
     * @param q
     */
    public static void twoBooleans(boolean p , boolean q){
        System.out.println(p);
        System.out.println(q);
    }
    /**
     * Create variables int aa = 7 and long bb,
     * perform Cast operation aa -> bbb and print to console.
     */
    public static void integersCast(){
        int aa = 7;
        long bb = aa;
        System.out.println(bb);
    }
    /**
     * Create variables int myInt = 7 and double myDouble,
     * perform Cast operation myInt -> myDouble and print to console.
     */
    public static void myIntMyDoubleCast(){
        int myInt = 7;
        double MyDouble = myInt;
        System.out.println(MyDouble);
    }
    /**
     * cast action double
     */
    public static void doubleAndIntCast(){
        double dc = 9.78d;
        int ii = (int)dc;
        System.out.println(ii);
    }
    /**
     * cast action
     */
    public static void intAndByte(){
        int ff = 9999;
        byte gg = (byte)ff;
        System.out.println(gg);
    }
    /**
     * find mistake and write correct answer
     */
    public static void findMistake(){
        //long max = 3123456789; shat mec tiva long-i hamar
        long max = 31234567;
        System.out.println(max);

        //double d = 1000_.00 ( _ )-senc nshan goyutyun chi drvum double-i het , verjum d-chyka
        double ds = 1000.00d;

        //char ij = i+j (error) 1 simvola yndunum chary , ex.'k'
        char is = 'i';

        //long ha = ha + 8  (error) 'h' might not have been initialized
        long ha = 8;
        ha = ha +9;
        System.out.println(ha); //correct

        //int ns , ms=11; ,ms=ns; (error) ms-in int tip-y chenq tvel, ns-um arjeq chenq nshanakel
        int ns = 12;
        int ms = 11;
        ms = ns;
        System.out.println(ms);

    }
    /**
     *20. Write a method which has two input parameters: type  int and return 0.
     * @param y
     * @param u
     * @return
     */
    public static int returnNull(int u, int y){
        return 0;
    }
    /**
     *21. Write a method which has boolean input parameters  and print “Hello World”.
     * @param tr
     * @return
     */
    public static void returnHelloWorld(boolean tr ){
        System.out.println("Hello World!");
    }
    /**
     * Write a method which has a char input parameter  and return this  input parameter.
     * @param rr
     * @return
     */
    public static char charReturn(char rr){
        return rr;
    }
    /**
     * Write a method which has  two float input parameters  and return  one of them.
     * @param cc
     * @param fg
     * @return
     */
    public static float floatReturn(float cc , float fg){
        return cc;
    }



}