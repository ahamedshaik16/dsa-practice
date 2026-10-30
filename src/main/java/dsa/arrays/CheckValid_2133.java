package dsa.arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckValid_2133 {

//    All Test cases not passed

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {3,1,2}, {2,3,1}};
        CheckValid_2133 c = new CheckValid_2133();
        System.out.println(c.checkValid(matrix));
    }

    public boolean checkValid(int[][] matrix) {
        Set<Integer> set = new HashSet<>();
        int n = matrix.length;

        for (int[] ints : matrix) {
            for (int j = 0; j < n; j++) {
                set.add(ints[j]);
            }
            if (set.size() == n) {
                break;
            }
        }

        for (int[] ints : matrix) {
            Set<Integer> innerSet = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (set.contains(ints[j])) {
                    innerSet.add(ints[j]);
                }
            }
            if (innerSet.size() != set.size()) {
                return false;
            }

        }

        return true;
    }
}
