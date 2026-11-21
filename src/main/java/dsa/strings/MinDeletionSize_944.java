package dsa.strings;

public class MinDeletionSize_944 {

    public static void main(String[] args) {
        String[] strs = {"qowfc","spyge","sqbif","vvrkk"};
        MinDeletionSize_944 m = new MinDeletionSize_944();
        System.out.println(m.minDeletionSize(strs));
    }

    public int minDeletionSize(String[] strs) {
        int result = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            int ch = strs[0].charAt(i) - 'a';
            for (int j = 1; j < strs.length; j++) {
                int nextCh = strs[j].charAt(i) - 'a';
                if (ch > nextCh) {
                    result++;
                    break;
                }
                ch = nextCh;
            }
        }


        return result;
    }
}
