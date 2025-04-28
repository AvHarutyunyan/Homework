import javax.imageio.metadata.IIOMetadataFormatImpl;
import javax.xml.stream.StreamFilter;
import java.io.IOException;
import java.util.Arrays;

/**
 * mixture of test codes
 * @author Avet
 */
class Animal {
    void sound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() throws RuntimeException {
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();

        Animal animal2 = new Cat();
        animal2.sound();

        System.out.println();

        int[] arrays = {1, 24, 6, 7, 8, 8, 4};
        int sum;
        sum = Arrays.stream(arrays).sum();
        System.out.println("sum of Arrays: " + sum + "\n");

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > arrays[arrays.length - 1]) {
                System.out.println("Max Element: " + arrays[i] + "\n");
            }
        }

        int pahest;
        for (int i = arrays.length - 1; i >= 0; i--) {
            pahest = arrays[i];
            System.out.print("Reverese Element: " + pahest + "\n");
        }
        System.out.println();

        System.out.println("research method which return (true/false): " + research(9));

        double reeesultl = 0;
        for (int i = 0; i < arrays.length; i++) {
            reeesultl = Arrays.stream(arrays).sum();
        }
        System.out.println("Averge number is: " + reeesultl / 5 + "\n");


        int count = 0;
        int numberMix[] = {2, 4, 6, 8, 8, 9, 3};
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < numberMix.length; j++) {
                count = arrays[i] + numberMix[i];
                System.out.println("sum of Arrays: " + count);
                break;
            }
        }

        int count_1 = 0;
        int count_2 = 0;

        for (int num : numberMix){
            if (num % 2 == 0){
               count_1++;
            }else {
                count_2++;
            }

        }
        System.out.println(count_1);
        System.out.println(count_2);
   }



    static boolean research(int number) {
        int numberOfArray[] = {2, 4, 5, 7, 9, 10};

        for (int i = 0; i < numberOfArray.length; i++) {
            if (number == numberOfArray[i]) {
                return true;
            }
        }
        return false;
    }


}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

