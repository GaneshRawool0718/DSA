package Day36;

import java.util.HashMap;
import java.util.Map;

public class TotalFruit {
    // This method calculates the maximum number of fruits that can be collected
    // from a sequence of fruits, where only two types of fruits can be collected at a time.
    // It uses a sliding window approach to maintain the count of fruits.
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0, maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {
            int fruit = fruits[right];
            basket.put(fruit, basket.getOrDefault(fruit, 0) + 1);

            // If we have more than 2 types of fruits, shrink the window from the left
            while (basket.size() > 2) {
                int leftFruit = fruits[left];
                basket.put(leftFruit, basket.get(leftFruit) - 1);
                if (basket.get(leftFruit) == 0) {
                    basket.remove(leftFruit);
                }
                left++;
            }

            // Update the maximum number of fruits
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
}
