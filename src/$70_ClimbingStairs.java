import java.util.Arrays;

public static void main(String[] args) {
    int[] nums = {1, 1, 2, 9, 9};
    int target = 1;
    System.out.println(Arrays.toString(searchRange(nums, target)));
}

public static int[] searchRange(int[] nums, int target) {
    int[] result = {-1, -1};
    if (nums.length > 1) {
        int start = 0;
        int r = nums.length - 1;
        while (start < r) {
            int m = (start + r) / 2;
            if (nums[m] >= target) {
                r = m;
            } else {
                start = m + 1;
            }
        }
        int l = start;
        int finish = nums.length - 1;
        while (l < finish) {
            int m = (l + finish + 1) / 2;
            if (nums[m] == target) {
                l = m;
            } else {
                finish = m - 1;
            }
        }
        if (nums[start] == target && nums[finish] == target) {
            result[0] = start;
            result[1] = finish;
        }
    } else if (nums.length == 1) {
        if (nums[0] == target) {
            result[0] = 0;
            result[1] = 0;
        }
    }
    return result;
}
