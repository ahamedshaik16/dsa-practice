package dsa.arrays;

public class DiagonalSum_1572 {

    public static void main(String[] args) {
        DiagonalSum_1572 d = new DiagonalSum_1572();
//        int[][] mat = {{1,2,3}, {4,5,6},{7,8,9}};
        int[][] mat = {{1,1,1,1}, {1,1,1,1},{1,1, 1,1},{1,1, 1,1}};
        System.out.println(d.diagonalSum(mat));
    }

    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0, matrixDiagonalValue = n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i+j == n-1 || i == j) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
