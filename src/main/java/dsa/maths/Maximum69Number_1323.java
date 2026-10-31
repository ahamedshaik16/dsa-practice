package dsa.maths;

public class Maximum69Number_1323 {
    public static void main(String[] args) {
        Maximum69Number_1323 m = new Maximum69Number_1323();
        System.out.println(m.maximum69Number(9996));
    }

    public int maximum69Number1 (int num) {
        String numStr = String.valueOf(num);

        String result = numStr;
        if (numStr.indexOf('6') >= 0) {
             result = numStr.substring(0, numStr.indexOf('6')) + '9' + numStr.substring(numStr.indexOf('6') + 1);
        }

        return Integer.parseInt(result);
    }
//  Using charArrays
    public int maximum69Number (int num) {

        char[] digits = String.valueOf(num).toCharArray();
        for (int i =0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break;
            }
        }

        return Integer.parseInt(new String(digits));
    }


}
