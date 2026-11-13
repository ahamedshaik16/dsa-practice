package dsa.strings;

import java.util.HashSet;
import java.util.Set;

public class RecoverOrder_3668 {
    public static void main(String[] args) {
        RecoverOrder_3668 r = new RecoverOrder_3668();
        int[] order = {3,1,2,5,4}, friends = {1,3,4};
        int[] result = r.recoverOrder(order, friends);
        for (Integer val: result) {
            System.out.println(val);
        }
    }

    public int[] recoverOrder(int[] order, int[] friends) {
        int[] result = new int[friends.length];
        Set<Integer> set = new HashSet<>();

        for (Integer val: friends) {
            set.add(val);
        }

        int count = 0;
        for (int i = 0; i < order.length; i++) {
            if (set.contains(order[i])) {
                result[count] = order[i];
                count++;
            }
            if (count == friends.length) {
                break;
            }
        }
        return result;
    }
}
