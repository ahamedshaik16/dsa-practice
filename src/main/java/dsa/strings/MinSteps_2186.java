package dsa.strings;

public class MinSteps_2186 {

    public static void main(String[] args) {
        MinSteps_2186 m = new MinSteps_2186();
        System.out.println(m.minSteps("leetcode", "coats"));
    }

    public int minSteps(String s, String t) {
        int[] sFreq = new int[26];
        int[] tFreq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);

            int sIdx = sChar - 'a';
            sFreq[sIdx]++;
        }

        for (int i = 0; i < t.length(); i++) {
            char tChar = t.charAt(i);

            int tIdx = tChar - 'a';
            tFreq[tIdx]++;
        }

        int result = 0;
        for (int i = 0; i < 26; i++) {
            if (tFreq[i] > sFreq[i]) {
                result += tFreq[i] - sFreq[i];
            }

            if (sFreq[i] > tFreq[i]) {
                result += sFreq[i] - tFreq[i];
            }
        }

        return result;
    }

}
