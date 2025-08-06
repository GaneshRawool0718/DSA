package Day38;

public class IsBalanced {
    /**
     * This method checks if a number represented as a string is balanced.
     * A number is considered balanced if the sum of digits at even indices
     * equals the sum of digits at odd indices.
     */

    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;
        
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';  // Convert char to int
            
            if (i % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }
        
        return evenSum == oddSum;
    }
}
