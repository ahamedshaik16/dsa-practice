package dsa.strings;

import java.util.HashMap;
import java.util.Map;

public class Compress_443 {

    public static void main(String[] args) {
        Compress_443 c = new Compress_443();
        char[] ch = {'a','b','b','c','c','a'};
        System.out.println(c.compress2(ch));
    }

    public int compress(char[] chars) {


        char currentChar = chars[0];
        int currentCharCount = 1;
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == currentChar) {
                currentCharCount++;
            } else {
                str.append(currentChar);
                if (currentCharCount > 1) {
                    str.append(currentCharCount);
                }
                currentChar = chars[i];
                currentCharCount = 1;
                System.out.println(currentChar);
            }
        }

        str.append(currentChar);
        if (currentCharCount > 1) {
            str.append(currentCharCount);
        }

        String resultStr = str.toString();
        int result = resultStr.length();
        for (int i = 0; i < result; i++) {
            chars[i] = resultStr.charAt(i);
        }

        System.out.println(str.toString());
        return result;
    }

    // Approach 2
    public int compress2(char[] chars) {
        int n = chars.length;
        int index = 0, i = 0;
        while (i < n) {
            char curr_char = chars[i];
            int count = 0;
            while (i < n && curr_char == chars[i]) {
                count++;
                i++;
            }
            chars[index] = curr_char;
            index++;

            if (count > 1) {
                String countStr = Integer.toString(count);
                for (char ch: countStr.toCharArray()) {
                    chars[index] = ch;
                    index++;
                }
            }
        }

        return index;
    }
}
