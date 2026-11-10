package dsa.arrays;

public class MinMoves_3736 {

    public static void main(String[] args) {
        MinMoves_3736 m = new MinMoves_3736();
        int[] nums = {4,4,5};
        System.out.println(m.minMoves(nums));
    }

    public int minMoves(int[] nums) {
        int result = 0;

        int max = Integer.MIN_VALUE;
        for (Integer num: nums) {
            max = Math.max(num, max);
        }

        for (Integer num: nums) {
            result += (max - num);
        }

        return result;
    }
}
