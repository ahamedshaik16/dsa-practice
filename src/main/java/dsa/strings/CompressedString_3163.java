package dsa.strings;

public class CompressedString_3163 {

    public static void main(String[] args) {
        CompressedString_3163 c = new CompressedString_3163();
        System.out.println(c.compressedString("aaaaaaaaaaaaaabb"));
    }

    public String compressedString(String word) {
        int n = word.length();
        int i = 0;
        StringBuilder str = new StringBuilder();
        while (i < n) {
            char curr_char = word.charAt(i);

            int count = 0;
            while (i < n && curr_char == word.charAt(i) && count < 9) {
                i++;
                count++;
            }
            str.append(count);
            str.append(curr_char);


        }
        return str.toString();
    }
}
