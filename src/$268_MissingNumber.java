
public class $268_MissingNumber {
    public static void main(String[] args) {
        int[] nums1 = {3,0,1};
        System.out.println(missingNumber(nums1));
        int[] nums2 = {0,1};
        System.out.println(missingNumber(nums2));
        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums3));
    }
    public static int missingNumber(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return (nums.length * (nums.length + 1) / 2) - sum;
    }

}
