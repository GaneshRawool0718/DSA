package Day04;

public class LongestPrefix {
// This program finds the longest common prefix string amongst an array of strings.
    public static String longestCommonPrefix(String[] strs) {
        // If the input array is null or empty, return an empty string
        // Initialize the prefix with the first string in the array
        // and iteratively reduce it until it matches the start of each string
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++){
            while (!strs[i].startsWith(prefix)){
                if (prefix.length() == 0) return "";
                // Reduce the prefix by one character from the end
                // until it matches the start of the current string
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}

class Client {
// This class contains the main method to test the LongestPrefix class
// It initializes an array of strings and calls the longestCommonPrefix method
    public static void main(String[] args) {
        
        String[] strs = {"Gita", "Green", "Grapes"};
        String result = LongestPrefix.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result); // Output: "G"
    }
}