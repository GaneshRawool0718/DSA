package Day18;

public class MaximizeFreeTime {
// This class contains a method to calculate the maximum free time available
// after scheduling meetings, allowing for a limited number of reschedules.
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int[] gaps = new int[n + 1];

        // Calculate gaps before, between, and after meetings
        gaps[0] = startTime[0];
        for (int i = 1; i < n; i++) {
            gaps[i] = startTime[i] - endTime[i - 1];
        }
        gaps[n] = eventTime - endTime[n - 1];

        // Sliding window to find maximum free time
        int maxFreeTime = 0;
        int currentWindowSum = 0;
        int left = 0;
        // Iterate through the gaps array to find the maximum sum of k+1 gaps
        // using a sliding window approach
        for (int right = 0; right < gaps.length; right++) {
            currentWindowSum += gaps[right];
            // If the window size exceeds k + 1, shrink from the left
            // until it is at most k + 1
            if (right - left + 1 > k + 1) {
                currentWindowSum -= gaps[left];
                left++;
            }
            if (right - left + 1 == k + 1) {
                maxFreeTime = Math.max(maxFreeTime, currentWindowSum);
            }
        }
        return maxFreeTime;
    }
    
}
