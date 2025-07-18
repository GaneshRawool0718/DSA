package Day25;

public class TitleToNumber {
    /*
     * This method converts an Excel-style column title (like "A", "AB", "ZY")
     * into its corresponding column number.
     * It's like converting a base-26 number to base-10.
     */
    public int titleToNumber(String columnTitle) {
        int result = 0;

        // Traverse each character in the string from left to right
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i); 
            
            // Convert character to its corresponding number
            // 'A' -> 1, 'B' -> 2, ..., 'Z' -> 26
            int value = ch - 'A' + 1;

            // Multiply result by 26 and add current value (base-26 conversion)
            result = result * 26 + value;
        }

        // Final result is the column number
        return result;
    }
}
