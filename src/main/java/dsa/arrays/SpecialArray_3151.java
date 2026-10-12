package dsa.arrays;

public class SpecialArray_3151 {

    public static void main(String[] args) {

    }

    public boolean isArraySpecial(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] % 2 == 0 && nums[i-1] % 2 == 0) || (nums[i] % 2 != 0 && nums[i-1] % 2 != 0)) {
                return false;
            }
        }

        return true;
    }
}
