package Day30;

public class RotateString {
     public boolean rotateString(String s, String goal) {
        // If lengths are different, return false
        if (s.length() != goal.length()) {
            return false;
        }
        
        // Check if goal is a substring of s + s
        return (s + s).contains(goal);
    }
}
