package Day44;

public class ScoreOfString {
    public int scoreOfString(String s) {
        int score = 0;
        
        // Loop through the string and compute the sum of absolute differences
        for (int i = 0; i < s.length() - 1; i++) {
            // Calculate the absolute difference between adjacent characters
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        
        return score;
    }
}
