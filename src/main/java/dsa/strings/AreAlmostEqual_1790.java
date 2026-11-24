package dsa.strings;

import java.util.ArrayList;
import java.util.List;

public class AreAlmostEqual_1790 {

    public static void main(String[] args) {

    }

    public boolean areAlmostEqual(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            return true;
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
}
