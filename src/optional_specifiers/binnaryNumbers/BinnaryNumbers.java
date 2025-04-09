package optional_specifiers.binnaryNumbers;

import java.util.Random;

/**\
 * 8.	Create a class with a final method that accepts an integer parameter and returns a string representation of
 * the integer in binary format. Use this method in another class to convert a randomly generated integer to binary format.
 */
public class BinnaryNumbers {
 public static final String binaryFormat(int a){
        return  Integer.toBinaryString(a);
    }

    public static void main(String[] args) {
        System.out.println(binaryFormat(9));
        RandomNumbers.randomBinaryNumbers();
    }
}
 class RandomNumbers{
    public static void randomBinaryNumbers()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(1,100);
       String binaryResult =  BinnaryNumbers.binaryFormat(randomNumber);
        System.out.println(binaryResult);
    }

 }
