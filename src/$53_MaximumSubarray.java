public class $53_MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,-1};
        System.out.println(maxSubArray(nums));
    }
    
    public static int maxSubArray(int[] nums) {
        if (nums.length > 0) {
            int result = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                int sum = nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    sum += nums[j];
                    result = Math.max(result, Math.max(sum, nums[i]));
                }
            }
            return Math.max(result, nums[nums.length - 1]);
        }
        return nums[0];
    }
}