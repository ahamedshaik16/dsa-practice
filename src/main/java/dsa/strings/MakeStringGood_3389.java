package dsa.strings;

public class MakeStringGood_3389 {

    // Completely not solved.
    public static void main(String[] args) {
        MakeStringGood_3389 m = new MakeStringGood_3389();
        System.out.println(m.makeStringGood("aaabbc"));
    }

    public int makeStringGood(String s) {

        int[] letters = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            letters[idx]++;

        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != 0)
                min = Math.min(min, letters[i]);
        }

        int result = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != 0)
                result += letters[i] - min;
        }

        return result;
    }
}
