package Day34;

import java.util.HashSet;
import java.util.Set;

public class SubarrayBitwiseOR {
    // This method calculates the number of distinct bitwise OR results
    // from all possible subarrays of the given array.
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> result = new HashSet<>();
        Set<Integer> prev = new HashSet<>();
        
        for (int num : arr) {
            // For each number, calculate the new OR results
            // by combining it with all previous results.
            Set<Integer> cur = new HashSet<>();
            cur.add(num);
            for (int x : prev) {
                cur.add(x | num);
            }
            result.addAll(cur);
            prev = cur;
        }
        
        return result.size();
    }
}