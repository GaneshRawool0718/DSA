package Day24;

public class PlusOne {
    /*
     * This method takes an array of digits representing a large integer,
     * adds one to the number, and returns the resulting array of digits.
     */
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit and work backwards
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, just increment it and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry needed, so return the result
            }

            // If the digit is 9, it becomes 0 (carry over to the next digit)
            digits[i] = 0;
        }

        // If all digits were 9, we have carried all the way through
        // Example: 999 + 1 = 1000, so we need a new array
        int[] result = new int[n + 1];
        result[0] = 1; // Set the first digit to 1, all others are 0 by default
        return result;
    }
}
