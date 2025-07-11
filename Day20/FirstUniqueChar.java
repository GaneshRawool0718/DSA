package Day20;

public class FirstUniqueChar {
// This class implements a method to find the index of the first unique character in a string.
// If no unique character exists, it returns -1.
    public int firstUniqChar(String s) {
        int[] freq = new int[26]; // To store frequency of each character

        // First pass: count the frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Second pass: find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // If no unique character found
    }
}
