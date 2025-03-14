package methods;

public class Methods {
    public static void main(String[] args) {
         //Group(Integer)
   //1.
     twoBytes((byte)12,(byte)-128);
   //2.
     twoShorts((short)23,(short)-32444);
   //3.
    twoIntegers(333333,-1231);
   //4.
    twoLongs((long)2342352,(long)-238957923);
   //5.
   integersMaxMin();
   //6.
        byteAndInt((byte)0b00001010,0b00101101);

        //Group(Floating point number)

   //7.
        twoFloats((float) 234.4f,(float) -24234.33f);
   //8.
        twoDoubls((double) 214234.323d,(double) -23487.232d);
   //9.
       floatingPointNumbersMaxMin();
   //10.
        floatAndDoublCorrectValues((float)34.567839023f,(double) 8923.1234857d);

          //Group(Character)
   //11.
        twoChars((char)'s',(char)'o');
   //12.
       twoCharsAscii((char)77,(char)109);
   //13.
        charSymbol((char)75,(char)'\u004B',(char)75);

          //Group(Boolean)
   //14.
       twoBooleans((boolean) true,(boolean) false);

        //int year = 201|; //Int tipy pahuma miayn tvain arjeq (error)
        //System.out.println(year);

          //Java Type Casting
   // 15.
        integersCast();
   //16.
        myIntMyDoubleCast();
   //17.
       doubleAndIntCast();
   //18.
        intAndByte();
   //19.
        findMistake();
   //20.
        returnNull(7,8);
   //21.
        returnHelloWorld(true);
   //22.
        char result = charReturn('A');
        System.out.println(result);
   //23.
        float resultt = floatReturn((float)2.634f, (float) 234.2f);
        System.out.println(resultt);

        int hj = 2;
        int x2;
        x2 = ++hj;
        System.out.println(x2);
    }

    /**
     * @param a
     * @param b
     *1․ Ստեղծել 2 փոփոխական(byte a և byte b ),  վերագրել կամայական արժեքներ և տպել   console -ում․
     */
    public static void twoBytes(byte a, byte b) {
        System.out.println(a);
        System.out.println(b);
    }
    /**
     * @param c
     * @param d
     *2․ Ստեղծել 2 փոփոխական(short c և short d ),  վերագրել կամայական արժեքներ և տպել console -ում
     */
    public static void twoShorts(short c, short d) {

        System.out.println(c);
        System.out.println(d);
    }
    /**
     * @param a
     * @param b
     * 3․ Ստեղծել 2 փոփոխական(int e և int f ),  վերագրել կամայական արժեքներ և տպել console -ում․
     */
    public static void twoIntegers(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }
    /**
     * @param g
     * @param h
     *4․ Ստեղծել 2 փոփոխական(long g և long h ),  վերագրել կամայական արժեքներ և տպել console -ում․
     */
    public static void twoLongs(long g ,long h ){
        System.out.println(g);
        System.out.println(h);
    }
    /**
     *5. Տպել  byte, short, int և long  Max & Min  արժեքները
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
     * @param binaryByte
     * @param binaryInt
     * 6. Ստեղծել 2  փոփոխական (byte և int ) , վերագրել կամայական արժեքներ 2-ական տեսքով  և տպել   console -ում․
     */
    public static void byteAndInt(byte binaryByte, int binaryInt ){
        System.out.println("Binary byte value: " + binaryByte);
        System.out.println("Binary int value: " + binaryInt);
    }
    /**
     * @param j
     * @param k
     *7. Ստեղծել 2 փոփոխական(float j և float k ),  վերագրել կամայական արժեքներ և տպել console -ում․
     */
    public static void twoFloats(float j, float k){
        System.out.println(j);
        System.out.println(k);
    }
    /**
     * @param l
     * @param m
     *8․ Ստեղծել 2 փոփոխական(double l և double m ),վերագրել կամայական արժեքներ և տպել console -ում․
     */
    public static void twoDoubls(double l , double m){
        System.out.println(l);
        System.out.println(m);
    }
    /**
     *9.Տպել float և double  Max & Min  արժեքները.
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
     * @param dd
     * @param tt
     *10. Հետևյալ արժեքներից ո՞րը կարելի է վերագրել float տիպի փոփոխականին,
     * իսկ ո՞րը double-ին: 34.567839023, 12.345, 8923.1234857,  3456.091?
     */
    public static void floatAndDoublCorrectValues(float tt , double dd){
        System.out.println(tt);
        System.out.println(dd);
    }
    /**
     * @param n
     * @param o
     * 11․ Ստեղծել 2 փոփոխական(char n և char o ),
     *       վերագրել կամայական արժեքներ և տպել   console -ում.
     */
    public static void twoChars(char n, char o){
        System.out.println(n);
        System.out.println(o);
    }
    /**
     * @param s
     * @param w
     * 12. Տպել char s = 77;  և char w = 109;  արժեքները.
     */
    public static void twoCharsAscii(char s,char w){
        System.out.println(s);
        System.out.println(w);
    }
    /**
     * @param Ascii
     * @param Uni
     * @param Symbol
     *13. Տպել ՛K՛ symbolը  բոլոր հնարավոր տարբերակներով.
     */
    public static void charSymbol(char Ascii, char Uni , char Symbol){
        System.out.println(Ascii);
        System.out.println(Uni);
        System.out.println(Symbol);
    }
    /**
     * @param p
     * @param q
     *14․ Ստեղծել 2 փոփոխական(boolean p և boolean q )
     */
    public static void twoBooleans(boolean p , boolean q){
        System.out.println(p);
        System.out.println(q);
    }
    /**
     *15. Ստեղծել int aa  = 7 և long bb փոփոխականներ,
     *       կատարել Cast գործողություն  aa -> bbb  և տպել console -ում․
     */
    public static void integersCast(){
        int aa = 7;
        long bb = aa;
        System.out.println(bb);
    }
    /**
     *16. Ստեղծել int myInt  = 7 և double myDouble փոփոխականներ,
     *      կատարել Cast գործողություն  myInt -> myDouble  և տպել console -ում.
     */
    public static void myIntMyDoubleCast(){
        int myInt = 7;
        double MyDouble = myInt;
        System.out.println(MyDouble);
    }
    /**
     *17. Ստեղծել double dd = 9.78d և int ii փոփոխականներ,
     *       կատարել Cast գործողություն  dd -> ii  և տպել console -ում․
     */
    public static void doubleAndIntCast(){
        double dc = 9.78d;
        int ii = (int)dc;
        System.out.println(ii);
    }
    /**
     *18. Ստեղծել int ff = 9999 և byte gg փոփոխականներ,
     *       կատարել Cast գործողություն  ff -> gg  և տպել console -ում․
     */
    public static void intAndByte(){
        int ff = 9999;
        byte gg = (byte)ff;
        System.out.println(gg);
    }
    /**
     * 19․ Գտնել սխալը , ուղղել և տպել․
     * long max = 3123456789;
     * double d = 1000_.00;
     * char i =’i’; char j=’j’; char ij = i +j;
     * int 7a = 8;
     * long h = h  + 8;
     * int n, m = 11; m = n;
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
     * @param u
     * @param y
     * @return
     *20. Write a method which has two input parameters: type  int and return 0.
     */
    public static int returnNull(int u, int y){
        return 0;
    }
    /**
     * @param tr
     * @return
     *21. Write a method which has boolean input parameters  and print “Hello World”.
     */
    public static void returnHelloWorld(boolean tr ){
        System.out.println("Hello World!");
    }
    /**
     * @param rr
     * @return
     *22. Write a method which has a char input parameter  and return this  input parameter.
     */
    public static char charReturn(char rr){
        return rr;
    }
    /**
     * @param cc
     * @param fg
     * @return
     * 23. Write a method which has  two float input parameters  and return  one of them.
     */
    public static float floatReturn(float cc , float fg){
        return cc;
    }



}