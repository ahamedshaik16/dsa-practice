package dsa.maths;

import java.util.HashSet;
import java.util.Set;

public class NumberOfSpecialChars_3120 {

    public static void main(String[] args) {
        NumberOfSpecialChars_3120 c = new NumberOfSpecialChars_3120();
        System.out.println(c.numberOfSpecialChars("abBCab"));
    }

    public int numberOfSpecialChars(String word) {

        Set<Character> set = new HashSet<>();

        for (char ch: word.toCharArray()) {
            if (Character.isLowerCase(ch) && !set.contains(ch) && word.indexOf(Character.toUpperCase(ch)) >= 0) {
                set.add(ch);
            }
        }

        return set.size();
    }
}
