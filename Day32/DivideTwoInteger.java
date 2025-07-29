package Day32;

public class DivideTwoInteger {
         public int divide(int dividend, int divisor) {
        // Handle overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Convert both to long to avoid overflow and take absolute value
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int result = 0;

        // Bit shift from 31 down to 0
        for (int i = 31; i >= 0; i--) {
            // Check if (divisor << i) fits into the current dividend
            if ((a >> i) >= b) {
                a -= b << i;
                result += 1 << i;
            }
        }

        // Apply sign
        return ((dividend > 0) == (divisor > 0)) ? result : -result;
    }
}
