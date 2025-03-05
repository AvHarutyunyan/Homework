import java.awt.*;
import java.util.logging.XMLFormatter;

public class Main {
    public static void main(String[] args) {
        //Group(Integer)
//1.
    byte a = 12;
    byte b = -128;
    System.out.println(a);
    System.out.println(b);
//2.
    short c = 23;
    short d = -32444;
    System.out.println(c);
    System.out.println(d);
//3.
    int e = 3333333;
    int f = -1231;
    System.out.println(e);
    System.out.println(f);
//4.
    long g = 2342352;
    long h = -238957923;
    System.out.println(g);
    System.out.println(h);

    //5.
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


      //6.
        byte binaryByte = 0b00001010; // 10 decimal
        int binaryInt = 0b00101101; // 45 decimal
        System.out.println("Binary byte value: " + binaryByte);
        System.out.println("Binary int value: " + binaryInt);

            //Group(Floating point number)

    //1.
        float j = 234.4f;
        float k = -24234.33f;
        System.out.println(j);
        System.out.println(k);

    //2.
        double i = 214234.323d;
        double m = -23487.232d;
        System.out.println(i);
        System.out.println(m);

    //3.
        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        System.out.println(maxFloat);
        System.out.println(minFloat);

        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        System.out.println(maxDouble);
        System.out.println(minDouble);

    //4.
        float tt = 34.567839023f;
        double dd = 8923.1234857d;


          //Group(Character)
    //1.
        char n = 's';
        char o = 'o';
        System.out.println(n);
        System.out.println(o);

    //2.
        char s = 77; // 'M' ASCII կոդով
        System.out.println(s);
        char w = 109;  // ASCII 109 = 'm'
        System.out.println(w);

    //3.
        char kSymbol = 'K';
        System.out.println(kSymbol);
        char kUniSymbol = '\u004B';
        System.out.println(kUniSymbol);
        char kAsciiTable = 75;
        System.out.println(kAsciiTable);


          //Group(Boolean)
    //1.
        boolean p = true ;
        boolean q = false ;
        System.out.println(p);
        System.out.println(q);

        //int year = 201|; //Int tipy pahuma miayn tvain arjeq (error)
        //System.out.println(year);

          //Java Type Casting
        //1.
        int aa = 7;
        long bb = aa;
        System.out.println(bb);

        //2.
        int myInt = 7;
        double MyDouble = myInt;
        System.out.println(MyDouble);

        //3.
        double dc = 9.78d;
        int ii = (int)dc;
        System.out.println(ii);

        //4.
        int ff = 9999;
        byte gg = (byte)ff;
        System.out.println(gg);

        //5.
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