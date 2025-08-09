
package Day40;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencySort {
    public int[] frequencySort(int[] nums) {
        // Convert int[] to Integer[] to use Comparator
        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(arr, (a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);
            if (freqA != freqB) {
                return freqA - freqB;  // Increasing frequency
            } else {
                return b - a;          // Decreasing value
            }
        });

        // Convert Integer[] back to int[]
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }
}


class Main {
    public static void main(String[] args) {
        FrequencySort fs = new FrequencySort();
        int[] nums = {1, 1, 2, 2, 2, 3};
        int[] sorted = fs.frequencySort(nums);
        
        System.out.println(Arrays.toString(sorted)); // Output: [3, 1, 1, 2, 2, 2]
    }
}