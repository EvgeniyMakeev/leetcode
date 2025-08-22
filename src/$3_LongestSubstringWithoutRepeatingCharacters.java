import java.util.HashMap;
import java.util.Map;

public class $3_LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(new $3_LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new $3_LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb"));
        System.out.println(new $3_LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        Map<Character, Integer> charMap = new HashMap<>();
        int leftIndex = 0;
        charMap.put(s.charAt(0), 0);
        int maxLength = 1;

        for (int rightIndex = 1; rightIndex < s.length(); rightIndex++) {
            char currentChar = s.charAt(rightIndex);
            if (charMap.containsKey(currentChar)) {
                leftIndex = Math.max(leftIndex, charMap.get(currentChar) + 1);
            }
            charMap.put(currentChar, rightIndex);
            maxLength = Math.max(maxLength, rightIndex - leftIndex + 1);
        }

        return maxLength;
    }
}
