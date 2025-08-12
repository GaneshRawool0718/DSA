package Day42;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContaining {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();

        // Loop through each word
        for (int i = 0; i < words.length; i++) {
            // Check if the word contains the character x
            if (words[i].indexOf(x) != -1) {
                result.add(i); // Add the index to the result
            }
        }

        return result;
    }
}
