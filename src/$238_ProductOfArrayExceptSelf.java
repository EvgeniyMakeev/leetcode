import java.util.Arrays;

public class $238_ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {4,2,1,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        if (nums.length > 1) {
            int numsMultiply = 1;
            int countZero = 0;
            int indexZero = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    numsMultiply *= nums[i];
                } else {
                    countZero++;
                    indexZero = i;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (countZero > 1) {
                    nums[i] = 0;
                } else if (countZero == 0) {
                    nums[i] = numsMultiply / nums[i];
                } else {
                    if (i != indexZero) {
                        nums[i] = 0;
                    } else {
                        nums[i] = numsMultiply;
                    }
                }
            }
        }
        return nums;
    }
}
