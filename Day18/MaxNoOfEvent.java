package Day18;

import java.util.Arrays;
import java.util.Comparator;

public class MaxNoOfEvent {
// This class contains a method to calculate the maximum value of events that can be attended
// given a list of events with start time, end time, and value, and a limit on the number of events (k) that can be attended.
    public int maxValue(int[][] events, int k) {
        // Sort events by end time
        Arrays.sort(events, Comparator.comparingInt(a -> a[1]));

        int n = events.length;
        // dp[i][j] = max value by considering first i events and attending at most j events
        int[][] dp = new int[n + 1][k + 1];

        // Create an array of end times for binary search
        int[] endTimes = new int[n];
        for (int i = 0; i < n; i++) {
            endTimes[i] = events[i][1];
        }

        for (int i = 1; i <= n; i++) {
            int[] curr = events[i - 1];
            int start = curr[0], end = curr[1], value = curr[2];

            // Find index of the last event that ends before the current event starts
            int index = binarySearch(endTimes, start, i - 1);

            for (int j = 1; j <= k; j++) {
                // Two choices: skip current or take current
                dp[i][j] = Math.max(dp[i - 1][j], dp[index + 1][j - 1] + value);
            }
        }

        return dp[n][k];
    }

    // Find the last index where event ends before startTime
    private int binarySearch(int[] endTimes, int startTime, int right) {
        int left = 0;
        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (endTimes[mid] < startTime) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
}

class Client {
    public static void main(String[] args) {
        MaxNoOfEvent mne = new MaxNoOfEvent();
        int[][] events = {{1, 2, 3}, {3, 4, 5}, {0, 6, 8}, {5, 7, 6}, {8, 9, 4}};
        int k = 2;

        int result = mne.maxValue(events, k);
        System.out.println("Maximum value of events: " + result); // Expected output: Maximum value of events: 11
    }
}
