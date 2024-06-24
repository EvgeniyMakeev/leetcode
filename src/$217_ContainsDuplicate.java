import java.util.HashSet;
import java.util.Set;

public class $217_ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {2,14,18,22,22};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        boolean isContainsDuplicate = false;
        for (int i : nums) {
            if (integerSet.contains(i)) {
                isContainsDuplicate = true;
            } else {
                integerSet.add(i);
            }
        }
        return isContainsDuplicate;
    }

//    public static boolean containsDuplicate(int[] nums) {
//        if (nums.length > 1) {
//            Arrays.sort(nums);
//            for (int i = 0; i < nums.length - 1; i++) {
//                if (nums[i] == nums[i + 1]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
}
