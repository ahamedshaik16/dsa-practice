package dsa.arrays;

public class Digits_1295 {

    public static void main(String[] args) {
        Digits_1295 d = new Digits_1295();
        System.out.println(d.findNumbers(new int[]{12, 345, 2, 6, 7896}));
        System.out.println(d.findNumbers(new int[]{555,901,482,1771}));
    }

    public int findNumbers(int[] nums) {
        int count = 0;

        for (Integer num: nums) {

            if (String.valueOf(num).length() % 2 == 0) {
                count += 1;
            }
        }

        return count;
    }



    public int findCount(int num) {
        int digitCounts = 0;
        while (num > 0) {
            num = num / 10;
            digitCounts++;
        }
        return digitCounts;
    }
}
