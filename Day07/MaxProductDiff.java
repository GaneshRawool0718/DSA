package Day07;
import java.util.Arrays;

public class MaxProductDiff {
    /*
     * Max Product Difference
     * This class implements a method to find the maximum product difference between two pairs of numbers in an array.
     * The method sorts the array and calculates the product of the two largest and two smallest numbers,
     * returning the difference between these two products.
     */
    public int maxProductDifference(int[] nums) {
        // Sort the array to easily find the two largest and two smallest numbers
        if (nums == null || nums.length < 4) {
            throw new IllegalArgumentException("Array must contain at least four elements.");
        }
        Arrays.sort(nums);
        int n = nums.length;
        int maxProduct = nums[n - 1] * nums[n - 2];
        int minProduct = nums[0] * nums[1];
        return maxProduct - minProduct;
    }
}

class Client {
    // This class contains the main method to test the MaxProductDiff class.
    // It initializes an array of integers and calls the maxProductDifference method to get the maximum
    public static void main(String[] args) {
        MaxProductDiff mpd = new MaxProductDiff();
        int[] nums = {5, 6, 2, 7, 4};
        
        int result = mpd.maxProductDifference(nums);
        System.out.println("The maximum product difference is: " + result);
    }
}