package Day07;

public class RemoveDuplicates {
    // This method removes duplicates from a sorted array and returns the new length of the array.
    public static int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0; // Return 0 if the array is empty or null
        }

        int uniqueIndex = 0; // Pointer for the position of unique elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i]; // Move the unique element to the next position
            }
        }
        return uniqueIndex + 1; // Return the count of unique elements
    }
}

class Client {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        
        int newLength = RemoveDuplicates.removeDuplicates(arr);
        
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
