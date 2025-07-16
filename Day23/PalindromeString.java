package Day23;

public class PalindromeString {
    /*
     * This method checks if a given string is a palindrome.
     * It ignores non-alphanumeric characters and is case-insensitive.
     */
    public boolean isPalindrome(String s) {
        // Step 1: Clean the string
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            // Check if the character is alphanumeric and convert to lowercase
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Step 2: Check if cleaned string is equal to its reverse
        String original = cleaned.toString();
        String reversed = cleaned.reverse().toString();

        return original.equals(reversed);
    }
}
