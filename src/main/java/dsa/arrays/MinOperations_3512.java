package dsa.arrays;

public class MinOperations_3512 {

    public static void main(String[] args) {
        MinOperations_3512 m = new MinOperations_3512();
        int[] nums = {3,2};
        System.out.println(m.minOperations(nums, 6));
    }


    public int minOperations(int[] nums, int k) {

        int sum = 0;
        for (Integer val: nums) {
            sum += val;
        }

        if (sum < k) {
            return sum;
        }

        System.out.println((sum%k));
        return (sum%k);
    }


}
