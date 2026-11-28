package dsa.strings;

public class RepeatedSubstringPattern_459 {

    public static void main(String[] args) {
        RepeatedSubstringPattern_459 r = new RepeatedSubstringPattern_459();
        System.out.println(r.repeatedSubstringPattern("abcabcabcabc"));
    }

    public boolean repeatedSubstringPattern(String s) {

        int l =s.length();
        for (int i = 0; i < l-1; i++) {

                String subString = s.substring(0, i+1);
                int subStringLength = subString.length();
                if (l % subStringLength == 0) {
                    int times = l / subStringLength;
//                    System.out.println("i: " + i + ", " + subString + ", times: " + times);
                    String appended = appendTimes(times, subString);
                    if (appended.equals(s)) {
                        return true;
                    }
                }

        }

        return false;
    }

    public String appendTimes(int n, String subString) {
        StringBuilder result = new StringBuilder(subString);
        result.append(subString.repeat(Math.max(0, n - 1)));
        return result.toString();
    }


}
