package Day13;
import java.util.Arrays;

public class AnagramChecker {
    /**
     * This method checks if two strings are anagrams of each other.
     * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     * typically using all the original letters exactly once.
     *
     * str1 The first string to check.
     * str2 The second string to check.
     * return true if str1 and str2 are anagrams, false otherwise.
     */
    public boolean areAnagrams(String str1, String str2) {
        // If lengths are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}


