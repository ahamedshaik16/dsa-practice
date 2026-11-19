package dsa.strings;

import java.util.*;

public class CloseStrings_1657 {

    public static void main(String[] args) {
        CloseStrings_1657 c = new CloseStrings_1657();
        System.out.println(c.closeStrings("xxxxxxxxxxxxxxxxxxx", "zzzzzzzzzzzzzzzzzzz"));
    }

    public boolean closeStrings(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int n = word1.length();
        int m = word2.length();
        if (n != m) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);

            int idx1 = ch1 - 'a';
            int idx2 = ch2 - 'a';
            freq1[idx1]++;
            freq2[idx2]++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq1[i] != 0 && freq2[i] != 0) continue;

            if (freq1[i] == 0 && freq2[i] == 0) continue;

            return false;
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }
}
