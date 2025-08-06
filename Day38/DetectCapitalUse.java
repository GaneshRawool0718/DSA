package Day38;

public class DetectCapitalUse {
    public boolean detectCapitalUse(String word) {
        int capitalCount = 0;

        // Count how many capital letters are in the word
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                capitalCount++;
            }
        }
        // Case 1: All letters are capital
        // Case 2: No letters are capital
        // Case 3: Only first letter is capital
        return capitalCount == word.length() || 
               capitalCount == 0 || 
               (capitalCount == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
