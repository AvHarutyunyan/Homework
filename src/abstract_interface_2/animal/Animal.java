package abstract_interface_2.animal;

import abstract_interface_1.namedA.A;

import java.util.Scanner;
import java.util.SortedMap;

/**
 * 9.Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'.
 * Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs' which prints "Dogs bark",
 * both inheriting the class 'Animals'. Now create an object for each of the subclasses and call their respective methods.
 * @author Avet
 */
public abstract class Animal {
    public abstract void dogs();
    public abstract void cats();
}

class Cat extends Animal {
    @Override
    public void dogs(){

    }
    @Override
    public void cats(){
        System.out.println("Cats meow");
    }
}
class Dog extends Animal{
    public void dogs(){
        System.out.println("Dogs bark");
    }
    public void cats(){

    }

    public static void main(String[] args) {

        int [][] matrix = new int[2][2];
        matrix[0][0] = 23;
        matrix[1][0] = 5;
        matrix[0][1] = 34;
        matrix[1][1] = 76;

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.println(matrix[i][j]);
            }
        }


        Animal animal1 = new Cat();
        animal1.cats();

        Animal animal2 = new Dog();
        animal2.dogs();

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Write number between 1-10");
            byte val = (byte) scanner.nextInt();
            if (val > 10)
                System.out.println("Number is too large");
            else if (val == 2 || val == 3  || val == 4) {
                System.out.println("it won't be better");
                break;
            }
        }
    }
}
