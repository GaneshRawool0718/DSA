package Day22;

public class ValidWord {
    //  This class implements a method to check if a word is valid based on specific criteria:
    // 1. The word must be at least 3 characters long.
    public boolean isValid(String word) {
    // Word must be at least 3 characters long
    if (word.length() < 3) return false;

    // List of vowels (both lowercase and uppercase)
    String vowels = "aeiouAEIOU";
    
    // Flags to track if the word has a vowel and a consonant
    boolean hasVowel = false;
    boolean hasConsonant = false;

    // Go through each character in the word
    for (char c : word.toCharArray()) {
        // If character is not a letter or digit, return false
        if (!Character.isLetterOrDigit(c)) return false;

        // If it's a letter, check if it's a vowel or consonant
        if (Character.isLetter(c)) {
            if (vowels.indexOf(c) != -1) {
                hasVowel = true;       // It's a vowel
            } else {
                hasConsonant = true;   // It's a consonant
            }
        }
    }

    // Return true only if both a vowel and a consonant are present
    return hasVowel && hasConsonant;
}

}

// class Client {
//     public static void main(String[] args) {
//         // Example usage
//         ValidWord solution = new ValidWord();
        
//         String word1 = "hello";
//         System.out.println("Is '" + word1 + "' valid? " + solution.isValid(word1)); // Output: true
        
//         String word2 = "aei";
//         System.out.println("Is '" + word2 + "' valid? " + solution.isValid(word2)); // Output: false
        
//         String word3 = "123";
//         System.out.println("Is '" + word3 + "' valid? " + solution.isValid(word3)); // Output: false
        
//         String word4 = "a1b2";
//         System.out.println("Is '" + word4 + "' valid? " + solution.isValid(word4)); // Output: true
//     }
// }