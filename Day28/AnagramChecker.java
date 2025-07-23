package Day28;

public class AnagramChecker {
    public boolean isAnagram(String s, String t) {
        // If lengths don't match, cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Frequency array for 26 lowercase letters
        int[] count = new int[26];

        // Count characters in s and t
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // If all counts are zero, then it's an anagram
        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }

    // public static void main(String[] args) {
    //     AnagramChecker checker = new AnagramChecker();

    //     System.out.println(checker.isAnagram("anagram", "nagaram")); // true
    //     System.out.println(checker.isAnagram("rat", "car"));         // false
    // }
}


