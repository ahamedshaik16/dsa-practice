package dsa.strings;

import java.util.ArrayList;
import java.util.List;

public class BuddyString_859 {

    public static void main(String[] args) {
        BuddyString_859 b = new BuddyString_859();
        System.out.println(b.buddyStrings("abac", "abad"));
    }

    public boolean buddyStrings(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            return checkFrequency(s);
        }

        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                indices.add(i);
            }
        }

        if (indices.size() != 2) {
            return false;
        }

        char[] goalChars = goal.toCharArray();
        char tempChar = goalChars[indices.get(0)];
        goalChars[indices.get(0)] = goalChars[indices.get(1)];
        goalChars[indices.get(1)] = tempChar;

        return s.equals(new String(goalChars));
    }

    public boolean checkFrequency(String s) {
        int[] array = new int[26];
        for (char ch: s.toCharArray()) {
            array[ch - 'a']++;
            if (array[ch-'a'] > 1)
                return true;
        }

        return false;
    }
}
