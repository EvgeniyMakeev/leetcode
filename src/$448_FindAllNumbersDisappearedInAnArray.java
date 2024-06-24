import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public static void main(String[] args) {
    int[] nums1 = {4,3,2,7,8,2,3,1};
    System.out.println(findDisappearedNumbers(nums1));
    int[] nums2 = {1,1};
    System.out.println(findDisappearedNumbers(nums2));
}

public static List<Integer> findDisappearedNumbers(int[] nums) {
    int n = nums.length;
    int[] sortedAdd = new int[n];
    for (int i : nums) {
        sortedAdd[i - 1]++;
    }

    List<Integer> answer = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        if (sortedAdd[i] == 0) {
            answer.add(i + 1);
        }
    }
    return answer;
}
