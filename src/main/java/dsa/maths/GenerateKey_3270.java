package dsa.maths;

public class GenerateKey_3270 {

    public static void main(String[] args) {
        GenerateKey_3270 g = new GenerateKey_3270();
        System.out.println(g.generateKey(987, 879, 798));
    }

    public int generateKey(int num1, int num2, int num3) {
        String num1Str = String.valueOf(num1);
        String num2Str = String.valueOf(num2);
        String num3Str = String.valueOf(num3);
        int maxStrLength = Math.max(num1Str.length(), Math.max(num2Str.length(), num3Str.length()));
        if (num1Str.length() < maxStrLength)
            num1Str = addLeadingZeros(num1Str, maxStrLength);
        if (num2Str.length() < maxStrLength)
            num2Str = addLeadingZeros(num2Str, maxStrLength);
        if (num3Str.length() < maxStrLength)
            num3Str = addLeadingZeros(num3Str, maxStrLength);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxStrLength; i++) {
            result.append(Math.min(num1Str.charAt(i) - '0', Math.min(num2Str.charAt(i)-'0', num3Str.charAt(i) - '0')));
        }
        return Integer.parseInt(result.toString());
    }

    public String addLeadingZeros(String num, int maxLength) {
        int numberOfZeros = maxLength - num.length();
        StringBuilder result = new StringBuilder(num);
        for (int i = 0; i < numberOfZeros; i++) {
            result.insert(0, "0");
        }
        return result.toString();
    }
}
