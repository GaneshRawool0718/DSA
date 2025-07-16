package Day22;

public class RemoveElement {
    /*
     * This class implements a method to remove all instances of a specific value from an array.
     * The method returns the new length of the array after removal.
     * The original array is modified in place, and the order of elements is preserved. 
     */
    public static int removeElement(int[] nums, int val) {
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) { // Check if the current element is not equal to the value to be removed
                // If it's not equal, copy it to the next position in the array
                nums[i] = nums[j]; // Copy the current element to the next position
                i++;
            }
        }
        return i;
    }
}
