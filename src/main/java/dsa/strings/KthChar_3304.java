package dsa.strings;

public class KthChar_3304 {

    public static void main(String[] args) {
        KthChar_3304 k = new KthChar_3304();
        System.out.println(k.kthCharacter(10));
    }

    public char kthCharacter(int k) {
        StringBuilder value = new StringBuilder();
        value.append("ab");
        while (value.length() <= k) {
            String temp = new String(value);
            for (int i = 0; i < temp.length(); i++) {
                value.append((char) (temp.charAt(i) + 1));
            }
        }
        return value.charAt(k-1);
    }
}
