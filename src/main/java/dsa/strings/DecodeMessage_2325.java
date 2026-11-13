package dsa.strings;

import java.util.HashMap;
import java.util.Map;

public class DecodeMessage_2325 {

    public static void main(String[] args) {
        DecodeMessage_2325 d = new DecodeMessage_2325();
        System.out.println(d.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }

    public String decodeMessage(String key, String message) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Map<Character, Character> map = new HashMap<>();

        int i = 0;
        for (Character ch: key.toCharArray()) {
            if (!map.containsKey(ch) && ch != ' ') {
                map.put(ch, letters.charAt(i));
                i++;

            }
        }

        for (Character ch: message.toCharArray()) {
            if (ch != ' ')
                result.append(map.get(ch));
            else {
                result.append(' ');
            }
        }

        return result.toString();
    }
}
