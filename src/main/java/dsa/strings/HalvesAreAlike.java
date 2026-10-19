package dsa.strings;

public class HalvesAreAlike {

    public static void main(String[] args) {
        HalvesAreAlike h = new HalvesAreAlike();
        System.out.println(h.halvesAreAlike("textbook"));
    }
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = (n/2);
        String a = s.substring(0, mid);
        String b = s.substring(mid, n);
        String vowels = "aeiouAEIOU";
        int aCount = 0, bCount = 0;
        for (char ch: a.toCharArray()) {
            if (vowels.indexOf(ch) >= 0) {
                aCount++;
            }
        }

        for (char ch: b.toCharArray()) {
            if (vowels.indexOf(ch) >= 0) {
                bCount++;
            }
        }

        return aCount == bCount;
    }
}
