package dsa.strings;

import java.util.HashMap;
import java.util.Map;

public class Ocuurences_1941 {
    public static void main(String[] args) {
        Ocuurences_1941 o = new Ocuurences_1941();
        System.out.println(o.areOccurrencesEqual("aabbucc"));
    }

    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = 0;
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (count == 0) {
                count = entry.getValue();
            }
            if (entry.getValue() != count) {
                return false;
            }
        }
        return true;
    }
}
