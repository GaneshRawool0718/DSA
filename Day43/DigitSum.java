package Day43;

public class DigitSum {
    /*
     * This class computes the digit sum of a string representation of a number.
     * The process continues until the length of the string is less than or equal to k.
     * In each iteration, it sums up every k digits and forms a new string from these sums.
     */
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder newString = new StringBuilder();
            for (int i = 0; i < s.length(); i += k) {
                int sum = 0;
                for (int j = i; j < Math.min(i + k, s.length()); j++) {
                    sum += s.charAt(j) - '0'; // Convert character to digit
                }
                newString.append(sum); // Append the sum as string
            }
            s = newString.toString(); // Update s for the next round
        }
        return s;
    }
}
