package dsa.strings;

public class IntToRoman_12 {

    public static void main(String[] args) {
        IntToRoman_12 i = new IntToRoman_12();
        System.out.println(i.intToRoman(1994));

    }

    public String intToRoman(int num) {
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 13; i++) {
            if (num == 0) {
                break;
            }

            int times = num / value[i];
            while (times > 0) {
                result.append(symbol[i]);
                times--;
            }

            num = num % value[i];
        }

        return result.toString();
     }

    public void breakIntoNumber(int n) {
        int curr = 1;
        while ( n > 0) {
            System.out.println(((n%10) ) * (curr));
            curr = curr * 10;
            n = n / 10;
        }
    }
}
