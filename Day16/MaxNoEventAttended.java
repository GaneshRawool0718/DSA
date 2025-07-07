
package Day16;

import java.util.Arrays;
import java.util.TreeSet;

public class MaxNoEventAttended {
    // This class contains a method to find the maximum number of events that can be attended
    // given a list of events with their start and end days.
    public static int maxEvents(int[][] events) {
        // Sort events by their end time
        Arrays.sort(events, (a, b) -> Integer.compare(a[1], b[1])); // sort by end day

        // Create a TreeSet of all available days (1 to 100000)
        TreeSet<Integer> availableDays = new TreeSet<>();
        for (int i = 1; i <= 100000; i++) {
            availableDays.add(i);
        }

        int count = 0;

        for (int[] event : events) {
            int start = event[0];
            int end = event[1];

            // Find the earliest available day >= start
            Integer day = availableDays.ceiling(start);
            if (day != null && day <= end) {
                count++;
                availableDays.remove(day);  // Mark that day as used
            }
        }

        return count;
    }
}

