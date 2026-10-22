package dsa.arrays;

import java.util.Arrays;

public class FindNonMinOrMax_2733 {

    public static void main(String[] args) {
        FindNonMinOrMax_2733 f = new FindNonMinOrMax_2733();
        System.out.println(f.findNonMinOrMax1(new int[] {3,2, 1}));
    }

    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        if (nums.length > 2) {
            return nums[1];
        }
        return -1;
    }

    public int findNonMinOrMax1(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minIndex = -1, maxIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
            if ( nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        if (maxIndex != -1 && minIndex != -1 && nums.length > 2) {
            for (int i = 0; i < nums.length; i++) {
                if (minIndex != i && maxIndex != i) {
                    return nums[i];
                }
            }
        }

        return -1;
    }
}
