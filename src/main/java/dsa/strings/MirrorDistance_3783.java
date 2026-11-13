package dsa.strings;

public class MirrorDistance_3783 {

    public static void main(String[] args) {
        MirrorDistance_3783 m = new MirrorDistance_3783();
        System.out.println(m.mirrorDistance(10));
    }

    public int mirrorDistance(int n) {

        return Math.abs(n-reverseNum(n));
    }

    public int reverseNum(int n) {
        StringBuilder str = new StringBuilder();
        while (n > 0) {
            str.append(n%10);
            n = n /10;
        }
        return Integer.parseInt(str.toString());
    }
}
