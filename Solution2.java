import java.util.*;
public class Solution2 {
    public int firstUniqChar(String s) {
        int[] charCounts = new int[26];

        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++;
        }

        // Find the index of the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charCounts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // No non-repeating character found
    }
    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        String s1 = "leetcode";
        int index1 = solution.firstUniqChar(s1);
        System.out.println(index1);  // Output: 0

        String s2 = "loveleetcode";
        int index2 = solution.firstUniqChar(s2);
        System.out.println(index2);  // Output: 2

        String s3 = "aabb";
        int index3 = solution.firstUniqChar(s3);
        System.out.println(index3);  // Output: -1
    }
}
