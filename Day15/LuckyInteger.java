package Day15;

import java.util.HashMap;

public class LuckyInteger {
    /**
     * Finds the lucky integer in the given array.
     * A lucky integer is defined as an integer that is equal to its frequency in the array.
     * If no lucky integer exists, returns -1.
     * */
    public int findLuckyInteger(int[] arr) {
        // Create a frequency map to count occurrences of each integer
        if (arr == null || arr.length == 0) {
            return -1; 
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for(int num : arr) {
            frequencyMap.put(num,frequencyMap.getOrDefault(num, 0) + 1);
        }

        int result = -1;   
        // Check each number in the frequency map
        for (int num : frequencyMap.keySet()) {
            // Check if the number is equal to its frequency
            // and update the result if it's greater than the current result
            int freq = frequencyMap.get(num);
            if (num == freq) {
            result = Math.max(result, num);
            }
        }
        return result;
    }
}

