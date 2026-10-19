package dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyElements_3005 {
    public static void main(String[] args) {
        MaxFrequencyElements_3005 m = new MaxFrequencyElements_3005();
        System.out.println(m.maxFrequencyElements(new int[]{1,2,3,4,5}));
    }

    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxFrequency = 0;
        for (Integer num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            maxFrequency = Math.max(maxFrequency, map.get(num));
        }
        int elementsFrequency = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (maxFrequency == entry.getValue()) {
                elementsFrequency += maxFrequency;
            }
        }
        return elementsFrequency;
    }
}
