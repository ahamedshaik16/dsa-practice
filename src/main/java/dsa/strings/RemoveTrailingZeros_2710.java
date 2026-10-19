package dsa.strings;

public class RemoveTrailingZeros_2710 {
    public static void main(String[] args) {
        RemoveTrailingZeros_2710 r = new RemoveTrailingZeros_2710();
        System.out.println(r.removeTrailingZeros1("12300"));
    }

    public String removeTrailingZeros(String num) {
        StringBuilder str = new StringBuilder(num);
        int index = str.length() - 1;
        while (Integer.parseInt(String.valueOf(str.charAt(index))) == 0) {
            str.deleteCharAt(index);
            index--;
        }

        return new String(str);
    }

    public String removeTrailingZeros1(String num) {
        StringBuilder str = new StringBuilder(num);
        int index = num.length() - 1;
        int count = 1;
        while (num.charAt(index) == '0') {
            count = count+1;
            index--;
        }

        return num.substring(0, num.length()-count+1);
    }
}
