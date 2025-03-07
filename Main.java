import java.awt.*;
import java.util.logging.XMLFormatter;

public class Main {
    public static void main(String[] args) {
         //Group(Integer)
   //1.
     TwoBytes((byte)12,(byte)-128);
   //2.
     TwoShorts((short)23,(short)-32444);
   //3.
    TwoIntegers(333333,-1231);
   //4.
    TwoLongs((long)2342352,(long)-238957923);
   //5.
   IntegersMaxMin();
   //6.
        ByteAndInt((byte)0b00001010,0b00101101);

        //Group(Floating point number)

    //7.
        TwoFloats((float) 234.4f,(float) -24234.33f);
    //8.
        TwoDoubls((double) 214234.323d,(double) -23487.232d);
    //9.
       FloatingPointNumbersMaxMin();
    //10.
        FloatAndDoublCorrectValues((float)34.567839023f,(double) 8923.1234857d);

          //Group(Character)
    //11.
        TwoChars((char)'s',(char)'o');
    //12.
       TwoCharsAscii((char)77,(char)109);
    //13.
        CharSymbol((char)75,(char)'\u004B',(char)75);

          //Group(Boolean)
    //14.
       TwoBooleans((boolean) true,(boolean) false);

        //int year = 201|; //Int tipy pahuma miayn tvain arjeq (error)
        //System.out.println(year);

          //Java Type Casting
   // 15.
        IntegersCast();
    //16.
        MyIntMyDoubleCast();
   //17.
       DoubleAndIntCast();
    //18.
        IntAndByte();
   //19.
        FindMistake();
    }

    /**
     *1․ Ստեղծել 2 փոփոխական(byte a և byte b ),  վերագրել կամայական արժեքներ և տպել   console -ում․
     */
    public static void TwoBytes(byte a, byte b) {
        System.out.println(a);
        System.out.println(b);
    }
    /**
     *2․ Ստեղծել 2 փոփոխական(short c և short d ),  վերագրել կամայական արժեքներ և տպել console -ում
     */
    public static void TwoShorts(short c, short d) {

        System.out.println(c);
        System.out.println(d);
    }
    /**
     * 3․ Ստեղծել 2 փոփոխական(int e և int f ),  վերագրել կամայական արժեքներ և տպել console -ում․
     */
    public static void TwoIntegers(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }
    /**
     *4․ Ստեղծել 2 փոփոխական(long g և long h ),  վերագրել կամայական արժեքներ և տպել console -ում․
     */
    public static void TwoLongs(long g ,long h ){
        System.out.println(g);
        System.out.println(h);
    }
    /**
     *5. Տպել  byte, short, int և long  Max & Min  արժեքները
     */
    public static void IntegersMaxMin(){
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
     * 6. Ստեղծել 2  փոփոխական (byte և int ) , վերագրել կամայական արժեքներ 2-ական տեսքով  և տպել   console -ում․
     */
    public static void ByteAndInt(byte binaryByte, int binaryInt ){
        System.out.println("Binary byte value: " + binaryByte);
        System.out.println("Binary int value: " + binaryInt);
    }
    /**
     *7. Ստեղծել 2 փոփոխական(float j և float k ),  վերագրել կամայական արժեքներ և տպել console -ում․
     */
    public static void TwoFloats(float j, float k){
        System.out.println(j);
        System.out.println(k);
    }
    /**
     *8․ Ստեղծել 2 փոփոխական(double l և double m ),վերագրել կամայական արժեքներ և տպել console -ում․
     */
    public static void TwoDoubls(double l , double m){
        System.out.println(l);
        System.out.println(m);
    }
    /**
     *9.Տպել float և double  Max & Min  արժեքները.
     */
    public static void FloatingPointNumbersMaxMin(){
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
     *10. Հետևյալ արժեքներից ո՞րը կարելի է վերագրել float տիպի փոփոխականին,
     * իսկ ո՞րը double-ին: 34.567839023, 12.345, 8923.1234857,  3456.091?
     */
    public static void FloatAndDoublCorrectValues(float tt , double dd){
        System.out.println(tt);
        System.out.println(dd);
    }
    /**
     * 11․ Ստեղծել 2 փոփոխական(char n և char o ),
     *       վերագրել կամայական արժեքներ և տպել   console -ում.
     */
    public static void TwoChars(char n, char o){
        System.out.println(n);
        System.out.println(o);
    }
    /**
     * 12. Տպել char s = 77;  և char w = 109;  արժեքները.
     */
    public static void TwoCharsAscii(char s,char w){
        System.out.println(s);
        System.out.println(w);
    }
    /**
     *13. Տպել ՛K՛ symbolը  բոլոր հնարավոր տարբերակներով.
     */
    public static void CharSymbol(char Ascii, char Uni , char Symbol){
        System.out.println(Ascii);
        System.out.println(Uni);
        System.out.println(Symbol);
    }
    /**
     *14․ Ստեղծել 2 փոփոխական(boolean p և boolean q )
     */
    public static void TwoBooleans(boolean p , boolean q){
        System.out.println(p);
        System.out.println(q);
    }
    /**
     *15. Ստեղծել int aa  = 7 և long bb փոփոխականներ,
     *       կատարել Cast գործողություն  aa -> bbb  և տպել console -ում․
     */
    public static void IntegersCast(){
        int aa = 7;
        long bb = aa;
        System.out.println(bb);
    }
    /**
     *16. Ստեղծել int myInt  = 7 և double myDouble փոփոխականներ,
     *      կատարել Cast գործողություն  myInt -> myDouble  և տպել console -ում.
     */
    public static void MyIntMyDoubleCast(){
        int myInt = 7;
        double MyDouble = myInt;
        System.out.println(MyDouble);
    }
    /**
     *17. Ստեղծել double dd = 9.78d և int ii փոփոխականներ,
     *       կատարել Cast գործողություն  dd -> ii  և տպել console -ում․
     */
    public static void DoubleAndIntCast(){
        double dc = 9.78d;
        int ii = (int)dc;
        System.out.println(ii);
    }
    /**
     *18. Ստեղծել int ff = 9999 և byte gg փոփոխականներ,
     *       կատարել Cast գործողություն  ff -> gg  և տպել console -ում․
     */
    public static void IntAndByte(){
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
    public static void FindMistake(){
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

}