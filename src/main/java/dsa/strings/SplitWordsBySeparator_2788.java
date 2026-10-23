package dsa.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class SplitWordsBySeparator_2788 {
    public static void main(String[] args) {
        SplitWordsBySeparator_2788 s1 = new SplitWordsBySeparator_2788();
        List<String> words = new ArrayList<>();

        String s = "Java,C,Python";

        // Split the string by comma
        String[] p = s.split(",");

        for (String part : p) {
            System.out.println(part);
        }
        words.add("$easy$");
        words.add("$problem$");
        System.out.println(s1.splitWordsBySeparator(words, '$'));
    }

    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for (String word: words) {
            String[] newWords = word.split(Pattern.quote(String.valueOf(separator)));
            Collections.addAll(result, newWords);
//                result.addAll(List.of(newWords));
        }
        result.removeAll(Collections.singleton(""));
        return result;
    }

    public List<String> splitWordsBySeparator1(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for (String word: words) {
            for (String part: word.split("\\" + separator)) {
                if (!part.isEmpty()) {
                    result.add(part);
                }
            }
        }
        return result;
    }
}
