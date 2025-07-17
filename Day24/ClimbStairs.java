package Day24;

public class ClimbStairs {
     public int climbStairs(int n) {
        // Base cases
        if (n == 1) return 1; // Only 1 way to climb 1 step
        if (n == 2) return 2; // Two ways: (1+1) or (2)

        // Initialize variables to store ways for previous steps
        int oneStepBefore = 2; // Ways to reach (n - 1)
        int twoStepsBefore = 1; // Ways to reach (n - 2)
        int allWays = 0;

        // Loop from step 3 to n
        for (int i = 3; i <= n; i++) {
            // Total ways = previous step + two steps back
            allWays = oneStepBefore + twoStepsBefore;

            // Move the window
            twoStepsBefore = oneStepBefore;
            oneStepBefore = allWays;
        }

        return allWays;
    }
}
