package Day35;

public class IdenticalPairs {
    // This method counts the number of good pairs in the array.
    // A good pair is defined as a pair of indices (i, j) such that
    // nums[i] == nums[j] and i < j.
    // The method uses a frequency array to count occurrences of each number.
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];  // Since 1 <= nums[i] <= 100
        int count = 0;

        for (int num : nums) {
            count += freq[num]; 
            freq[num]++;
        }

        return count;
    }
}
