package dsa.strings;

public class MinSteps_1347 {

    public static void main(String[] args) {
        MinSteps_1347 m = new MinSteps_1347();
        System.out.println(m.minSteps("bab", "aba"));
    }

    public int minSteps(String s, String t) {
        int[] sFreq = new int[26];
        int[] tFreq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            int sIdx = sChar - 'a';
            int tIdx = tChar - 'a';
            sFreq[sIdx]++;
            tFreq[tIdx]++;
        }

        int result = 0;
        for (int i = 0; i < 26; i++) {
            if (tFreq[i] > sFreq[i]) {
                result += tFreq[i] - sFreq[i];
            }
        }

        return result;
    }
}
