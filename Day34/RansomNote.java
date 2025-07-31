package Day34;

public class RansomNote {

    // This method checks if the ransom note can be constructed from the magazine
    // by counting the occurrences of each letter in both strings.

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26]; // for letters 'a' to 'z'
        
        for (char c : magazine.toCharArray()) {
            // Increment the count for each character in the magazine
            count[c - 'a']++;
        }
        
        for (char c : ransomNote.toCharArray()) {
            // Decrement the count for each character in the ransom note
            // If the count goes negative, it means the magazine doesn't have enough letters
            if (--count[c - 'a'] < 0) {
                return false;
            }
        }
        
        return true;
    }
}