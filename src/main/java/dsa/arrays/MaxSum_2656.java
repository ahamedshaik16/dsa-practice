package dsa.arrays;

import java.util.Arrays;

public class MaxSum_2656 {
    public static void main(String[] args) {
        int[] nums = {5,5,5};
        MaxSum_2656 m = new MaxSum_2656();
        System.out.println(m.maximizeSum(nums, 2));
    }

    public int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += max;
            max += 1;
        }
        return sum;
    }
}
