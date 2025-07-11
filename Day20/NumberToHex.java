package Day20;

public class NumberToHex {
// This class implements a method to convert an integer to its hexadecimal string representation.
// The conversion handles negative numbers using 32-bit unsigned representation.
// It returns the hexadecimal string without leading zeros.
// If the input is zero, it returns "0".
    public String toHex(int num) {
        if (num == 0) return "0";

        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();

        // Use 32-bit unsigned representation
        while (num != 0 && result.length() < 8) {
            int hexDigit = num & 0xF; // Get last 4 bits
            result.insert(0, hexChars[hexDigit]); // Map to hex character
            num >>>= 4; // Unsigned right shift by 4 bits
        }

        return result.toString();
    }
}
