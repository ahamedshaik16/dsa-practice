package dsa.arrays;

public class LargestAltitude_1732 {

    public static void main(String[] args) {
        LargestAltitude_1732 l = new LargestAltitude_1732();
        System.out.println(l.largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }

    public int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;
        for (Integer val: gain) {
            current = current + val;
            max = Math.max(max, current);
        }
        return max;
    }
}
