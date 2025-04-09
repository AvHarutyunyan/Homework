package optional_specifiers.work_with_strings;

public class StringUtils {
        public static String getCommonCharacters(String str1, String str2) {
            StringBuilder common = new StringBuilder();

            for (int i = 0; i < str1.length(); i++) {
                char c = str1.charAt(i);
                if (str2.indexOf(c) != -1 && common.indexOf(String.valueOf(c)) == -1) {
                    common.append(c);
                }
            }

            return common.toString();
        }
    }

