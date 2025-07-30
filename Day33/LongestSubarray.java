package Day33;

public class LongestSubarray {
    public int longestSubarray(int[] nums) {
        int max = 0;
        
        // Step 1: Find the maximum value in the array
        for (int num : nums) {
            max = Math.max(max, num);
        }
        
        int longest = 0, currentLength = 0;
        
        // Step 2: Traverse and count longest contiguous sequence of max elements
        for (int num : nums) {
            if (num == max) {
                currentLength++;
                longest = Math.max(longest, currentLength);
            } else {
                currentLength = 0;
            }
        }
        
        return longest;
    }
}


