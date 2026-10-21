package dsa.maths;

public class DetectCapitalUse_520 {

    public static void main(String[] args) {
        DetectCapitalUse_520 d = new DetectCapitalUse_520();
        System.out.println(d.detectCapitalUse("GooglE"));
    }

    public boolean detectCapitalUse(String word) {

        boolean result = true;

        for (char ch: word.toCharArray()) {
            if (!Character.isUpperCase(ch)) {
                result = false;
                break;
            }
        }

        if (result) {
            return result;
        }
        result = true;
        for (char ch: word.toCharArray()) {
            if (!Character.isLowerCase(ch)) {
                result = false;
                break;
            }
        }
        if (result) {
            return result;
        }
        result = true;
        if (Character.isUpperCase(word.charAt(0))) {
            for (int i = 1; i < word.length(); i++) {
                if (!Character.isLowerCase(word.charAt(i))) {
                    result = false;
                    break;
                }
            }
        } else {
            return false;
        }

        return result;
    }
}
