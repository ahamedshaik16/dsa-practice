package dsa.strings;

public class CoundAndSay_38 {

    public static void main(String[] args) {
        CoundAndSay_38 c = new CoundAndSay_38();
        System.out.println(c.countAndSay2(4));
    }

    public String countAndSay(int n) {

        int i = 1;
        StringBuilder str = new StringBuilder("1");
        while (i < n) {
            int start = 0;
            StringBuilder result = new StringBuilder();
            while (start < str.length()) {
                char curr_char = str.charAt(start);
                int count = 0;
                while (start < str.length()  && curr_char == str.charAt(start)) {
                    start++;
                    count++;
                }
                result.append(count);
                result.append(curr_char);
            }
            i++;
            str = result;
        }
        return str.toString();
    }

    public String countAndSay2(int n) {
        if (n == 1) {
            return "1";
        }

        String say = countAndSay2(n-1);
        System.out.println(say);

        StringBuilder result = new StringBuilder();
        //Processing
        for (int i = 0; i < say.length(); i++) {
            char curr_char = say.charAt(i);
            int count = 1;
            while (i < say.length()-1 && curr_char == say.charAt(i+1)) {
                count++;
                i++;
            }

            result.append(count);
            result.append(curr_char);
        }
        return result.toString();
    }
}
