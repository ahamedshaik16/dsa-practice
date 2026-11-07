package dsa.arrays;

public class FindMissingAndRepeatedValues_2965 {


    public static void main(String[] args) {
        FindMissingAndRepeatedValues_2965 f = new FindMissingAndRepeatedValues_2965();
        int[][] grid = {{1,2}, {2,3}};
        System.out.println(f.findMissingAndRepeatedValues(grid));
    }

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] elements = new int[n*n];
        int missing = 0, duplicate = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                if (elements[val-1] == 0) {
                    elements[val-1] = val;
                } else {
                    duplicate = val;
                }
            }
        }

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == 0) {
                missing = i+1;
            }
        }
        System.out.println(duplicate +", " + missing);
        return new int[]{duplicate, missing};
    }
}
