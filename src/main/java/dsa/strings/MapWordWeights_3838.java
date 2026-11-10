package dsa.strings;

public class MapWordWeights_3838 {
    public static void main(String[] args) {
        MapWordWeights_3838 m = new MapWordWeights_3838();
//        String[] words = {"abcd","def","xyz"};
//        int[] weights = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
//        String[] words = {"a","b","c"};
//        int[] weights = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        String[] words = {"abcd"};
        int[] weights = {7,5,3,4,3,5,4,9,4,2,2,7,10,2,5,10,6,1,2,2,4,1,3,4,4,5};
        System.out.println(m.mapWordWeights(words, weights));
    }

    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder result = new StringBuilder();
        for (String word: words) {
            int sum = 0;
            for (char ch: word.toCharArray()) {
                int index =  (ch - 'a');
                sum += weights[index];
            }
            int modulo = (sum % 26);
            char wchar = (char) ('a' + (26-modulo-1));
            result.append(String.valueOf(wchar));
        }

        return new String(result);
    }
}
