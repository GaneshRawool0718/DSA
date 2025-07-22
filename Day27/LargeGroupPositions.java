package Day27;

import java.util.ArrayList;
import java.util.List;

public class LargeGroupPositions {
     public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        int start = 0; // start index of a group

        for (int i = 1; i <= s.length(); i++) {
            // Check if we are at the end of a group
            if (i == s.length() || s.charAt(i) != s.charAt(start)) {
                if (i - start >= 3) {
                    List<Integer> group = new ArrayList<>();
                    group.add(start);
                    group.add(i - 1);
                    result.add(group);
                }
                start = i; // update start for the next group
            }
        }

        return result;
    }
}
