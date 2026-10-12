package dsa.strings;


public class ShiftingLetters_848 {
    public static void main(String[] args) {
        ShiftingLetters_848 sl = new ShiftingLetters_848();
        String s = "bad";
        int[] shifts = {10,20,30};
        System.out.println(sl.shiftingLetters(s, shifts));
    }

    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder value = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++) {
            StringBuilder temp = new StringBuilder();
            int tempValue = 0;
            for (int j = 0; j <=i; j++, tempValue++) {
                temp.append((char) (value.charAt(j) + shifts[i]));
            }
            for (int k = tempValue; k < s.length(); k++) {
                temp.append((char) (value.charAt(k)));
            }
            value = new StringBuilder(temp);
        }
        return value.toString();
    }
}
