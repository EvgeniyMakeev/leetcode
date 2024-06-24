import java.util.Arrays;

public class $283_MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,0,1};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
    public static int[] moveZeroes(int[] nums) {
        if (nums.length > 1) {
            int insertPos = 0;
            for (int num: nums) {
                if (num != 0) {
                    nums[insertPos++] = num;
                }
            }
            while (insertPos < nums.length) {
                nums[insertPos++] = 0;
            }
        }
//        if (nums.length > 1) {
//            int temp = nums.length;
//            int countNonZero = 0;
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] == 0) {
//                    temp = i;
//                    for (int j = i + 1; j < nums.length; j++) {
//                        if (nums[j] != 0) {
//                            nums[temp] = nums[j];
//                            i += j - i + 1;
//                            temp++;
//                            countNonZero++;
//                        }
//                    }
//                } else {
//                    countNonZero++;
//                }
//            }
//            if (countNonZero < nums.length && countNonZero > 0) {
//                for (int i = countNonZero; i < nums.length; i++) {
//                    nums[i] = 0;
//                }
//            }
//        }
        return nums;
    }
}
