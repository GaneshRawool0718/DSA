package Day04;

public class MaxElement {
    public static int findMax(int[] arr){
        // This method finds the maximum element in an array of integers.
        // It initializes the maximum with the first element and iterates through the array
        // to find the largest value.
        if (arr == null || arr.length == 0) {
            // This is a defensive programming practice to avoid runtime errors.
            throw new IllegalArgumentException("Array must not be empty");
        }
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // Compare each element with the current maximum
            // and update the maximum if a larger element is found.
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

class Client {
    // This class contains the main method to test the MaxElement class.
    // It initializes an array of integers and calls the findMax method to get the maximum value
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23, 56};

        int max = MaxElement.findMax(arr);
        System.out.println("The maximum element in the array is: " + max);
    }
}