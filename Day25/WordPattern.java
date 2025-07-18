package Day25;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        // If the lengths do not match, return false immediately
        if (pattern.length() != words.length) {
            return false;
        }

        // Maps to store pattern-to-word and word-to-pattern mapping
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            // If current pattern character is already mapped
            if (charToWord.containsKey(ch)) {
                // But it doesn't match the current word => return false
                if (!charToWord.get(ch).equals(word)) {
                    return false;
                }
            } else {
                // If this word is already mapped to another character => return false
                if (wordToChar.containsKey(word)) {
                    return false;
                }

                // Otherwise, establish new mappings
                charToWord.put(ch, word);
                wordToChar.put(word, ch);
            }
        }

        // All checks passed
        return true;
    }
}
