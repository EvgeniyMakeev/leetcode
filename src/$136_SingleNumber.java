
public static void main(String[] args) {
    int[] nums1 = {2,2,1};
    System.out.println(singleNumber(nums1));
    int[] nums2 = {4,1,2,1,2};
    System.out.println(singleNumber(nums2));
    int[] nums3 = {1};
    System.out.println(singleNumber(nums3));
    int[] nums4 = {1,0,1};
    System.out.println(singleNumber(nums4));
}

public static int singleNumber(int[] nums) {
    int answer = nums[0];
    for (int i = 1; i < nums.length; i++) {
        answer ^= nums[i];
    }
    return answer;
}
