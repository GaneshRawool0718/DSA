package Day35;

import java.util.ArrayList;
import java.util.List;

public class TargetArray {
    // This method creates a target array based on the given nums and index arrays.
    // The target array is built by inserting each element from nums at the specified index.
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // Insert the element from nums at the specified index in the targetList
            targetList.add(index[i], nums[i]);
        }

        // Convert list to array
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = targetList.get(i);
        }

        return target;
    }
}


