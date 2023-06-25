import java.util.*;
public class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        while (j < n) {
            nums[j] = 0;
            j++;
        }
    }
     
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        Solution solution = new Solution();
        solution.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));  // Output: [1, 3, 12, 0, 0]
    
        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));  // Output: [0]
    }

    
}
