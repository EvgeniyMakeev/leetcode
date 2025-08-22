public class $744_FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'b', 'c', 'f'};
        var target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        var left = 0;
        var right = letters.length - 1;
        while (left <= right) {
            var middle = left + (right - left) / 2;
            if (target < letters[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return letters[left % letters.length];

    }
}