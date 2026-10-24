package dsa.strings;

public class MinRotations_4070 {
    public static void main(String[] args) {
        String s = "6042195975";
        MinRotations_4070 m = new MinRotations_4070();
        System.out.println(m.minRotations(s));
    }

    public int minRotations(String s) {
        int result = Math.min((s.charAt(0)-'0'),10-(s.charAt(0)-'0'));;
        for (int i = 0; i < s.length()-1; i++) {


            int diff = Math.abs((s.charAt(i) - '0')-(s.charAt(i+1) - '0'));
            result += Math.min(diff, 10-diff);
        }

        return result;
    }
}
