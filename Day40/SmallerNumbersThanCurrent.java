package Day40;

public class SmallerNumbersThanCurrent {
    class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101]; // Since nums[i] is between 0 and 100

        // Step 1: Count frequency of each number
        for (int num : nums) {
            count[num]++;
        }

        // Step 2: Convert to prefix sum to get "how many numbers are smaller than i"
        for (int i = 1; i < 101; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Build result using the count array
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            result[i] = num == 0 ? 0 : count[num - 1];
        }

        return result;
    }
}
}

