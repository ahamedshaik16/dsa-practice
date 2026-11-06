package dsa.arrays;

public class PeakValleyDifference_4088 {

    public int peakValleyDifference(int[] nums) {
        int sumOfPeaks = 0;
        int sumOfValleys = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i-1] && nums[i] > nums[i+1]) {
                sumOfPeaks += nums[i];
            } else if (nums[i] < nums[i - 1] && nums[i] < nums[i + 1]) {
                sumOfValleys += nums[i];
            }
        }
        return sumOfPeaks - sumOfValleys;
    }
}
