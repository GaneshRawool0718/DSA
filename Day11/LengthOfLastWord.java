package Day11;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // This method returns the length of the last word in a given string.
        // A word is defined as a maximal substring consisting of non-space characters.
        String[] words = s.trim().split(" ");
        if (words.length == 0) {
            return 0; // If there are no words, return 0
        }
        return words[words.length - 1].length(); // Return the length of the last word
    }
}

class Client {
    public static void main(String[] args) {
        LengthOfLastWord obj = new LengthOfLastWord();
        String s = "Hello World"; // Example input
        int result = obj.lengthOfLastWord(s);
        System.out.println("Length of the last word: " + result); // Output: 5
    }
}