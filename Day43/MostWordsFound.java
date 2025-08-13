package Day43;

public class MostWordsFound {
    /*
     * This class finds the maximum number of words in a given array of sentences.
     * Each sentence is a string, and words are separated by spaces.
     */
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for (String sentence : sentences) {
            // Split the sentence by spaces to count the words
            String[] words = sentence.split(" ");
            maxWords = Math.max(maxWords, words.length);
        }
        
        return maxWords;
    }
}
