package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * If the file does not exist or cannot be opened,
 * the program should throw an exception and print an error message.
 *
 * @author Avet
 */
public class Homework4 {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader fileReader = new FileReader("file.txt");
        Scanner scanner = new Scanner(fileReader);
        System.out.println(scanner);

        System.out.println("File opened successfully!");
        scanner.close();


    }
}
