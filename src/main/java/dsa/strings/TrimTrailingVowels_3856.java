package dsa.strings;

public class TrimTrailingVowels_3856 {

    public static void main(String[] args) {
        TrimTrailingVowels_3856 t = new TrimTrailingVowels_3856();
        System.out.println(t.trimTrailingVowels("idea"));
    }

    public String trimTrailingVowels(String s) {
        int lastIndex = s.length();
        String vowels = "aeiou";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (vowels.indexOf(s.charAt(i)) >= 0) {
                lastIndex = i;
            } else {
                break;
            }
        }
        return s.substring(0, lastIndex);

    }
}
