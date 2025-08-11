package Day41;

import java.util.ArrayList;
import java.util.List;

public class ProductQueries {
    /*
     * Given an integer n, this class computes the product of powers of two
     * corresponding to the set bits in n for given ranges specified in queries.
     * Each query consists of two indices, and the product is computed for the
     * powers of two from the left index to the right index (inclusive).
     */
    static final int MOD = 1_000_000_007;

    public int[] productQueries(int n, int[][] queries) {
        // Extract powers of two from n
        List<Long> powers = new ArrayList<>();
        for (int i = 0; i < 31; i++) {
            if (((n >> i) & 1) == 1) {
                powers.add(1L << i);
            }
        }
        
        int[] result = new int[queries.length];
        
        for (int q = 0; q < queries.length; q++) {
            int left = queries[q][0];
            int right = queries[q][1];
            
            long product = 1;
            for (int i = left; i <= right; i++) {
                product = (product * powers.get(i)) % MOD;
            }
            
            result[q] = (int) product;
        }
        
        return result;
    }
}


