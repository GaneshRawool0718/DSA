package Day02;

public class BinarySearch {
    // Method to perform binary search
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if x is present at mid
            if (arr[mid] == key) {
                return mid; // Element found
            }

            // If x is greater, ignore left half
            if (arr[mid] < key) {
                left = mid + 1;
            } else { // If x is smaller, ignore right half
                right = mid - 1;
            }
        }

        // Element not found
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 18, 40};
        int key = 18;

        // Perform binary search
        // Note: The array must be sorted for binary search to work correctly
        int result = binarySearch(arr, key); 
        // Output the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
