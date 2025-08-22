public class $303_RangeSumQuery {
    class NumArray {
        int[] summs;

        public NumArray(int[] nums) {
            summs = new int[nums.length];
            summs[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                summs[i] = nums[i] + summs[i - 1];
            }
        }

        public int sumRange(int left, int right) {
            if (left == 0) {
                return summs[right];
            } else {
                return summs[right] - summs[left - 1];
            }
        }
    }

    public void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-2,0,3,-5,2,-1});
        System.out.println(numArray.sumRange(0, 2));
    }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
}
