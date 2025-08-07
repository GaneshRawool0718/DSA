package Day39;

public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        // Split the sentence into words by spaces
        String[] words = s.split(" ");
        
        // Take the first k words and join them with a space
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            result.append(words[i]);
            if (i != k - 1) {
                result.append(" "); // Add space between words
            }
        }
        
        // Return the result as a string
        return result.toString();
    }
}

