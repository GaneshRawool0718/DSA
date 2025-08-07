package Day39;

import java.util.HashSet;
import java.util.Set;

public class RepeatedCharacter {
    public char repeatedCharacter(String s) {
        // Create a set to store characters we have already seen
        Set<Character> seen = new HashSet<>();
        
        // Loop through each character in the string
        for (char c : s.toCharArray()) {
            // If the character is already in the set, return it
            if (seen.contains(c)) {
                return c;
            }
            // Otherwise, add the character to the set
            seen.add(c);
        }
        
        // Return a default value if no repetition is found (though the problem guarantees repetition)
        return ' ';
    }
}

