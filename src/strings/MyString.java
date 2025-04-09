package strings;

import java.nio.channels.NotYetBoundException;

public class MyString {
    private char[] characters;

    // Constructor - պահում ենք տողը որպես սիմվոլների զանգված
    public MyString(String input) {
        characters = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            characters[i] = input.charAt(i);
        }
    }

    // Տողում սիմվոլների քանակը
    public int length() {
        return characters.length;
    }

    // Տողի հակառակ տարբերակը վերադարձնում է որպես String
    public String reverse() {
        StringBuilder reversed = new StringBuilder();
        for (int i = characters.length - 1; i >= 0; i--) {
            reversed.append(characters[i]);
        }
        return reversed.toString();
    }

    // Տրված սիմվոլի ինդեքսը, եթե չկա՝ -1
    public int indexOf(char c) {
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == c) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MyString m = new MyString("Hello");
        m.length();
        m.reverse();
        m.indexOf('H');

    }
}









