package exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Homework10 {

        public static void main(String[] args) {
            Scanner inputScanner = new Scanner(System.in);
            System.out.print("Enter the file name: ");
            String filename = inputScanner.nextLine();

            try {
                File file = new File(filename);
                Scanner fileScanner = new Scanner(file);

                int wordCount = 0;
                while (fileScanner.hasNext()) {
                    fileScanner.next(); // անցնում ենք հաջորդ բառին
                    wordCount++;
                }

                fileScanner.close();
                System.out.println("Number of words in the file: " + wordCount);

            } catch ( FileNotFoundException e) {
                System.out.println("Error: The file does not exist or cannot be opened.");
            }

            inputScanner.close();
        }
    }

