package dsa.strings;

import java.util.Arrays;

public class OrderlyQueue_899 {

    public static void main(String[] args) {
        OrderlyQueue_899 o = new OrderlyQueue_899();
        System.out.println(o.orderlyQueue("cba", 1));
    }

    public String orderlyQueue(String s, int k) {

        if (k > 1) {
            char[] array = s.toCharArray();
            Arrays.sort(array);
            return new String(array);
        }

        String result = s;
        for (int i = 0; i <= s.length()-1; i++) {
            String temp = s.substring(i) + s.substring(0, i);
            if (temp.compareTo(result) < 0) {
                result = temp;
            }
        }

        return result;

    }
}
