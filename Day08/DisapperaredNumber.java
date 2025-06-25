package Day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DisapperaredNumber {
    // Function to find all disappeared numbers in an array
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        /*
         * This function finds all the numbers that are missing from the array.
         * It uses a Set to track unique numbers and then checks for numbers
         * from 1 to n that are not present in the Set.
         */
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        Set<Integer> uniqueNumbers = new HashSet<>();
        
        for (int num : nums) {
            uniqueNumbers.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!uniqueNumbers.contains(i)) {
                list.add(i);
            }
        }

        return list;  
    }
}

class Client {
    // Main method to test the findDisappearedNumbers function
    // It initializes an array and prints the disappeared numbers
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> result = DisapperaredNumber.findDisappearedNumbers(arr);
        System.out.println("Disapperared nums are : " );
        for(int nums : result){
            System.out.print(nums + " ");
        }
        System.out.println();
    }
}