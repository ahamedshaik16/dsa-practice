package dsa.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfStringPairs_2744 {
    public static void main(String[] args) {
        String[] words = {"aa","ab"};
        MaximumNumberOfStringPairs_2744 m = new MaximumNumberOfStringPairs_2744();
        System.out.println(m.maximumNumberOfStringPairs(words));
    }

    public int maximumNumberOfStringPairs(String[] words) {
        int result = 0;

        Map<String, Integer> map = new HashMap<>();
        for (String word: words) {
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String sorted = new String(letters);
            map.put(sorted, map.getOrDefault(sorted, 0) + 1);
            if (map.get(sorted) == 2) {
                result += 1;
            }

        }

        return result;
    }
}
