package Day45;

public class Leetcode674 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // Handle edge case for empty array
        }

        int maxLength = 1; // At least one element is a valid increasing subsequence
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1; // Reset for the next potential subsequence
            }
        }

        // Final check to update maxLength in case the longest subsequence ends at the last element
        maxLength = Math.max(maxLength, currentLength);

        return maxLength;
    }
}
