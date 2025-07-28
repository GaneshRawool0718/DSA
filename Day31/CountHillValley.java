package Day31;

import java.util.ArrayList;
import java.util.List;

public class CountHillValley {
    public int countHillValley(int[] nums) {
    // Step 1: Remove consecutive duplicates
    List<Integer> list = new ArrayList<>();
    list.add(nums[0]); // Add the first number to the list

    // Loop through the array and add non-duplicate numbers
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i - 1]) {
            list.add(nums[i]);
        }
    }

    // Step 2: Count hills and valleys
    int count = 0; // Initialize counter for hills and valleys

    // Loop through the list and check for hills and valleys
    for (int i = 1; i < list.size() - 1; i++) {
        int prev = list.get(i - 1);
        int curr = list.get(i);
        int next = list.get(i + 1);

        // Check if current element is a hill or a valley
        if ((curr > prev && curr > next) || (curr < prev && curr < next)) {
            count++; // Increment if it's a hill or valley
        }
    }

    return count; // Return the final count
}

}

// class Main {
//     public static void main(String[] args) {
//         CountHillValley chv = new CountHillValley();
//         int[] nums = {2, 4, 1, 1, 6, 5};
//         System.out.println("Number of hills and valleys: " + chv.countHillValley(nums)); // Output: 3
//     }
// }