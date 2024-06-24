import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class $1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5};
        int target = -8;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        if (nums.length > 2) {
            for (int i = 0; i < nums.length - 1; i++) {
                Map<Integer, Integer> map = new HashMap<>();
                map.put(nums[i], 0);
                 for (int j = i + 1; j < nums.length; j++) {
                     if (map.containsKey(target - nums[j])) {
                        int[] result = {map.get(target - nums[j]), j};
                        return result;
                     } else {
                        map.put(nums[j], j);
                    }
                }
            }
        }
        int[] result = {0, 1};
        return result;
    }
}