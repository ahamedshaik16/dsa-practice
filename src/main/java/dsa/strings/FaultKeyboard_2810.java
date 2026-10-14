package dsa.strings;

public class FaultKeyboard_2810 {
    public static void main(String[] args) {
        FaultKeyboard_2810 f = new FaultKeyboard_2810();
        System.out.println(f.finalString("string"));
        System.out.println(f.finalString("poiinter"));
    }

    public String finalString(String s) {
        StringBuilder res = new StringBuilder();

        for (char ch: s.toCharArray()) {
            if (ch == 'i') {
                res.reverse();
            } else {
                res.append(ch);
            }
        }

        return new String(res);
    }
}
