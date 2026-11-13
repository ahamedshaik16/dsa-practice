package dsa.strings;

public class ScoreOfString_3110 {

    public static void main(String[] args) {
        ScoreOfString_3110 s = new ScoreOfString_3110();
        System.out.println(s.scoreOfString("zaz"));
    }

    public int scoreOfString(String s) {
        int result = 0;

        for (int i = 1; i < s.length(); i++) {
            result += Math.abs(s.charAt(i) - s.charAt(i-1));
        }

        return result;
    }
}
