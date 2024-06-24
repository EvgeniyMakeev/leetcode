public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target) {
        if (nums[nums.length - 1] < target) {
            return nums.length;
        } else {
            int l = 0;
            int r = nums.length - 1;
            while (l < r) {
                int m = (l + r) / 2;
                if (nums[m] >= target) {
                    r = m;
                } else {
                    l = m + 1;
                }
            }
            return l;
        }
    }
}
