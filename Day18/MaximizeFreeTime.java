package Day18;

public class MaximizeFreeTime {
// This class contains a method to calculate the maximum free time available
// after scheduling meetings, allowing for a limited number of reschedules.
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
    int n = startTime.length;
    int[] duration = new int[n];
    for (int i = 0; i < n; i++) {
        duration[i] = endTime[i] - startTime[i];
    }

    // Simulate moving meetings forward as early as possible, allowing at most k reschedules
    int reschedules = 0;
    int prevEnd = 0; // current time
    int maxFreeTime = 0;

    for (int i = 0; i < n; i++) {
        int originalStart = startTime[i];
        int originalEnd = endTime[i];

        int newStart = prevEnd;
        int newEnd = newStart + duration[i];

        // Check if we can reschedule this meeting
        if (newStart != originalStart && reschedules < k) {
            reschedules++; // we are moving this meeting
        } else if (newStart != originalStart) {
            // Can't move this one — fall back to original time
            newStart = originalStart;
            newEnd = originalEnd;
        }

        // Update max free time (gap between previous end and current start)
        maxFreeTime = Math.max(maxFreeTime, newStart - prevEnd);

        prevEnd = newEnd; // update pointer to end of this meeting
    }

    // Check final gap to event end
    maxFreeTime = Math.max(maxFreeTime, eventTime - prevEnd);

    return maxFreeTime;
}


}

class Main {
    public static void main(String[] args) {
        MaximizeFreeTime mft = new MaximizeFreeTime();
        int eventTime = 10;
        int k = 2;
        int[] startTime = {1, 3, 5};
        int[] endTime = {2, 4, 6};

        int result = mft.maxFreeTime(eventTime, k, startTime, endTime);
        System.out.println("Maximum free time: " + result); // Expected output: 4
    }
}