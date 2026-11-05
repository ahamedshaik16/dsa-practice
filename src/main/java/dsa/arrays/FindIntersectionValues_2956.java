package dsa.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindIntersectionValues_2956 {

    public static void main(String[] args) {

    }

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] result = new int[2];
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int indicesCount1 = 0, indicesCount2 = 0;
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }

        for (Integer val: nums1) {
            if (set2.contains(val)) {
                indicesCount1++;
            }
        }

        for (Integer val: nums2) {
            if (set1.contains(val)) {
                indicesCount2++;
            }
        }
        result[0] = indicesCount1;
        result[1] = indicesCount2;

        return result;
    }
}
