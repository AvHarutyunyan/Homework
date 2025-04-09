package optional_specifiers.work_with_strings;

import java.util.Random;

public class Main {
        public static void main(String[] args) {
            String str1 = generateRandomString(10);
            String str2 = generateRandomString(10);

            System.out.println("String 1: " + str1);
            System.out.println("String 2: " + str2);

            String common = StringUtils.getCommonCharacters(str1, str2);
            System.out.println("Common characters: " + common);
        }

        public static String generateRandomString(int length) {
            String characters = "abcdefghijklmnopqrstuvwxyz";
            Random random = new Random();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < length; i++) {
                int index = random.nextInt(characters.length());
                result.append(characters.charAt(index));
            }

            return result.toString();
        }
    }
