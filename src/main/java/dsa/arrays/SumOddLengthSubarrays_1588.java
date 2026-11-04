package dsa.arrays;

public class SumOddLengthSubarrays_1588 {
    public static void main(String[] args) {
        SumOddLengthSubarrays_1588 s = new SumOddLengthSubarrays_1588();
        int[] arr = {10,11,12};
        System.out.println(s.sumOddLengthSubarrays(arr));
    }

    public int sumOddLengthSubarrays(int[] arr) {
        int result = arr[0];
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result += arr[i];
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        for (int i =0; i < arr.length; i++) {
            System.out.println("prefix sum of i: " + i + " = " + prefixSum[i]);
        }

        int oddLength = 3;
        while (oddLength <= arr.length) {
            for (int i = 0; i < arr.length && (i+oddLength) <= arr.length; i++) {

                if (i == 0) {
                    System.out.println("from: " + i + ", to: " + (i+oddLength-1) + ", sum: " + (prefixSum[i+oddLength-1]));
                    result += prefixSum[i+oddLength-1];
                } else {
                    System.out.println("from: " + i + ", to: " + (i+oddLength-1) + ", sum: " + (prefixSum[i+oddLength-1] - prefixSum[i-1]));
                    result += prefixSum[i+oddLength-1] - prefixSum[i-1];
                }

            }
            oddLength += 2;
        }

        return result;
    }
}
