package dsa.strings;

public class DifferenceOfSums_2894 {

    public static void main(String[] args) {
        DifferenceOfSums_2894 d = new DifferenceOfSums_2894();
        System.out.println(d.differenceOfSums(5, 6));
    }

    public int differenceOfSums(int n, int m) {
        int divisibleSum = 0, nonDivisibleSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                divisibleSum += i;
            } else {
                nonDivisibleSum += i;
            }
        }

        return nonDivisibleSum - divisibleSum;
    }
}
