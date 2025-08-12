package Day42;

public class NumberOfWays {
    /**
     * This class computes the number of ways to express an integer n as a sum
     * of distinct powers of integers raised to the power x.
     * 
     * For example, if n = 10 and x = 2, the distinct powers are 1^2, 2^2, 3^2,
     * etc. The method counts how many combinations of these powers sum up to n.
     */
    static final int MOD = 1_000_000_007;

    public int numberOfWays(int n, int x) {
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; ; i++) {
            int power = (int) Math.pow(i, x);
            if (power > n) break;

            for (int j = n; j >= power; j--) {
                dp[j] = (dp[j] + dp[j - power]) % MOD;
            }
        }

        return dp[n];
    }
}
