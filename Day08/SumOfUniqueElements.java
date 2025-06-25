package Day08;

import java.util.HashSet;
import java.util.Set;

public class SumOfUniqueElements {
    /*
     * This method calculates the sum of unique elements in an array.
     * It uses a HashSet to keep track of unique elements and their sum.
     * If an element is encountered for the first time, it is added to the set
     * and its value is added to the sum.
     */
    public int sumOfUnique(int[] nums) {
        // This method calculates the sum of unique elements in an array of integers.
        Set<Integer> unique = new HashSet<>();

        int sum = 0;

        for (int num : nums) {
            // Check if the number is not already in the set
            // If it's not, add it to the set and add its value to the sum
            if (!unique.contains(num)) {
                unique.add(num);
                sum += num;
            } 
        }

        return sum;
    }
    
}

class Client {
    // This class contains the main method to test the SumOfUniqueElements class.
    // It initializes an array of integers and calls the sumOfUnique method to get the sum
    public static void main(String[] args) {
        SumOfUniqueElements solution = new SumOfUniqueElements();
        int[] nums = {1, 2, 3, 2, 1, 4};
        
        int result = solution.sumOfUnique(nums);
        System.out.println("The sum of unique elements is: " + result); 
    }
}