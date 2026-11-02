package dsa.strings;

public class IsPrefixString_1961 {
    public static void main(String[] args) {
        IsPrefixString_1961 i = new IsPrefixString_1961();
        String s = "iloveleetcode";
        String[] words = {"i","love", "leetcode","apples"};
        System.out.println(i.isPrefixString(s, words));
    }

    public boolean isPrefixString(String s, String[] words) {
        boolean result = false;
        if (!s.startsWith(words[0])) {
            return result;
        }
        StringBuilder sub = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sub.append(words[i]);
            if (String.valueOf(sub).startsWith(s) && sub.length() == s.length()) {
                result = true;
                break;
            }
        }
        return result;
    }
}
