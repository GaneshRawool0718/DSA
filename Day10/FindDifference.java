package Day10;

import java.util.Scanner;
public class FindDifference {
    // This class contains a method to find the difference between two strings.
    public static String findDifference(String str1, String str2){
        // This method finds the characters that are present in str1 but not in str2.
        StringBuilder result = new StringBuilder();
        for (char c : str1.toCharArray()) {
            // Check if the character is not present in str2
            // If not present, append it to the result
            if (str2.indexOf(c) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }
}

class Client {
    // This class contains the main method to test the findDifference method.
    public static void main(String [] args) {
        Scanner obj =  new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = obj.nextLine();
        System.out.println("Enter second string: ");    
        String str2 = obj.nextLine();


        String  findDifference = FindDifference.findDifference(str1, str2);

        System.out.println("Difference: " + findDifference);
        obj.close();
    }
}