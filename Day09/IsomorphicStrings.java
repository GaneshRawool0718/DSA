package Day09;

import java.util.HashMap;

public class IsomorphicStrings {
    // Given two strings s and t, determine if they are isomorphic.
    // Two strings s and t are isomorphic if the characters in s can be replaced to
   public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        // to get t.
        // All occurrences of a character must be replaced with another character while preserving the order of characters.
        // No two characters may map to the same character, but a character may map to itself
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Check mapping from s to t
            if (mapST.containsKey(c1)) {
                if (mapST.get(c1) != c2)
                    return false;
            } else {
                mapST.put(c1, c2);
            }

            // Check reverse mapping from t to s
            // This ensures that no two characters in s map to the same character in t
            if (mapTS.containsKey(c2)) {
                if (mapTS.get(c2) != c1)
                    return false;
            } else {
                mapTS.put(c2, c1);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));     
        System.out.println(isIsomorphic("foo", "bar"));     
        System.out.println(isIsomorphic("paper", "title")); 
    } 
}
