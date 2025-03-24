package strings;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.SplittableRandom;

/**
 * Write methods for string
 *
 * @author aveth
 */
public class Strings {
    public static void main(String[] args) {
        Strings strings = new Strings();
        strings.concatenation();
        strings.literal(" we\n are\n living\n in");
        strings.reverses();
        String line = "We are living in an yellow submarine. We don't  have anything";
        String token = "in";
        int count = strings.countOccurrences(line, token);
        System.out.println("The token '" + token + "' appears " + count + " times.");
        StringBuilder builder = new StringBuilder();
        strings.toUpper("hello world!");
        String xa = strings.builderToUpper();
        System.out.println(xa);
        String fa = strings.bigSmall();
        System.out.println(fa);
        strings.deleteeSymbol();
        strings.changeSymbol();
        String hh = strings.findLongestWord("We are living in an yellow submarine. We don't  have anything");
        System.out.println(hh);
        strings.printSubLine("Hello World", 5);
        strings.printSubLine("Hello World", 5);
        strings.emptyOrNot();

        String s = new String("ss");
        s= "ff";
        System.out.println(s);

    }

    /**
     * Write a method that performs String concatenation with a given parameter.
     */
    public void concatenation() {
        String hi = new String("hello");
        String ih = hi + " " + "world";
        System.out.println(ih);
        System.out.println(1 + 2 + " " + hi);
        System.out.println("1" + 2 + hi);
        System.out.println(hi + " " + 1 + 2 + " " + "world");
    }

    /**
     * @param n String parameter and prints each empty character on a new line using String Literal ( \t, \b ….)
     */
    public void literal(String n) {
        System.out.println(n);
    }

    /**
     * write method reverse
     */
    public void reverses() {
        StringBuilder str = new StringBuilder("Hello World!");
        str = str.reverse();
        System.out.println(str);
    }

    /**
     * Write a method that checks how many times a token appears in a given text
     * int countSubString(String line, String token)
     *
     * @param text
     * @param token
     */
    public int countOccurrences(String text, String token) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(token, index)) != -1) {
            count++;
            index += token.length();
        }
        return count;
    }

    /**
     * String toUpperCase
     *
     * @param m
     */
    public void toUpper(String m) {
        System.out.println(m.toUpperCase());
    }

    /**
     * Same problem with StringBuilder.
     *
     * @return
     */
    public String builderToUpper() {
        StringBuilder builder2 = new StringBuilder("hello bro!");
        String ax = builder2.toString();
        return ax.toUpperCase();
    }

    /**
     * prints it if we write the "*" symbol instead of the missing characters in the string.
     *
     * @return
     */
    public String bigSmall() {
        String hh;
        StringBuilder builder = new StringBuilder("Armenia");
        hh = builder.toString();
        if (hh.length() < 20) {
            for (int i = hh.length(); i < 20; i++) {
                hh += "*";
            }
        }
        return hh;
    }

    /**
     * Write a method that removes all "a" characters from a given text. Same problem with StringBuilder.
     */
    public void deleteeSymbol() {
        StringBuilder builder1 = new StringBuilder("We are living in an yellow submarine. We don't  have anything");
        for (int i = builder1.length() - 1; i >= 0; i--) {
            if (builder1.charAt(i) == 'a') {
                builder1.deleteCharAt(i);

            }
        }
        System.out.println(builder1);
    }

    /**
     * Write a method that replaces all "a" characters in a given text with "*" using String.
     */
    public void changeSymbol() {
        String ff = "We are living in an yellow submarine. We don't  have anything";
        ff = ff.replace('a', '*');
        System.out.println(ff);
    }

    /**
     * Write a method that finds the longest word in a text, where the words in the text are separated by a comma.
     *
     * @param text
     * @return
     */
    public String findLongestWord(String text) {
        String[] words = text.split("\\s+");
        String longestWord = "";

        for (String word : words) {

            word = word.replaceAll("[^a-zA-Z]", "");

            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    /**
     * Write a method that finds and prints from the beginning of a given string to the nth index
     *
     * @param n
     * @param line
     */
    public void printSubLine(String line, int n) {
        String subLine = line.substring(0, n + 1);
        System.out.println(subLine);
    }

    /**
     * Same problem with StringBuilder.
     *
     * @param line
     * @param n
     */
    public static void printSubLine(StringBuilder line, int n) {
        String subLine = line.substring(0, n + 1);
        System.out.println(subLine);
    }

    /**
     * Empty or Not ?
     */
    public void emptyOrNot() {
        String d = new String();
        d = "S";
        if (d == null) {
            System.out.println("Yes Empty:");
        } else System.out.println("NO:");
    }

}
