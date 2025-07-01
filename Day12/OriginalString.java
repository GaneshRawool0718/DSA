package Day12;

public class OriginalString {
    public static int countPossibleOriginals(String word) {
        int n = word.length();
        int i = 0;
        int extraOptions = 0;

        while (i < n) {
            int j = i;
            // Move j forward to find the end of the current group of identical characters
            while (j < n && word.charAt(j) == word.charAt(i)) {
                j++;
            }

            int groupLength = j - i; // Length of the current group of identical characters
            // If the group length is 1, it cannot contribute to extra options
            if (groupLength >= 2) {
                extraOptions += (groupLength - 1); // This group can give (length - 1) more options
            }

            i = j;
        }
        return Math.min(extraOptions, 100) + 1; // add 1 for original word
    }
}

class Client {
    public static void main(String[] args) {
        String word = "abcd"; // Example input
        int result = OriginalString.countPossibleOriginals(word);
        System.out.println("Number of possible original strings: " + result); 
    }
}