import java.util.HashSet;
import java.util.Set;

public class $41_FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1,100,1};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        int result = 1;
        int min = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.contains(i)) {
                if (i > 0) {
                    set.add(i);
                    if (i < min) {
                        min = i;
                    }
                }
                if ((result == i || i < min) && i > 0) {
                    do {
                        result++;
                    } while (set.contains(result));
                }
            }
        }
        if (!set.contains(1)) {
            return 1;
        }
        return result;
    }
}
