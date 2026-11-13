package dsa.strings;

public class ConvertDateToBinary_3280 {

    public static void main(String[] args) {
        ConvertDateToBinary_3280 c = new ConvertDateToBinary_3280();
        System.out.println(c.convertDateToBinary("1900-01-01"));
    }

    public String convertDateToBinary(String date) {

        String[] values = date.split("-");
        String[] result = new String[3];

        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(values[i]);
            result[i] = binaryFormat(num);
        }

        return result[0] + "-" + result[1] + "-" + result[2];
    }

    public String binaryFormat(int num) {
        StringBuilder numStrFormat = new StringBuilder();
        while (num != 1) {
            numStrFormat.insert(0, (num % 2));
            num = num / 2;
        }
        numStrFormat.insert(0, 1);
        return numStrFormat.toString();
    }
}
