package dsa.arrays;

public class EarliestTime_3683 {

    public static void main(String[] args) {
        int[][] tasks = {{1,6}, {2,3}};

        EarliestTime_3683 e = new EarliestTime_3683();
        System.out.println(e.earliestTime(tasks));
    }

    public int earliestTime(int[][] tasks) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < tasks.length; i++) {
            for (int j = 0; j < tasks[0].length; j++) {
                result = Math.min(result, tasks[i][0] + tasks[i][1]);
            }
        }
        return result;
    }
}
