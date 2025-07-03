package Day14;

public class KthCharacterFinder {
    public static char findKthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");

        while (word.length() < k) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                // next character, wrap around if 'z'
                char nextChar = (char)((c == 'z') ? 'a' : c + 1);
                next.append(nextChar);
            }
            word.append(next); // append new string to original
        }

        return word.charAt(k - 1);
    }
}


class Client {
    public static void main(String[] args) {
        int k = 10; // Example input
        char result = KthCharacterFinder.findKthCharacter(k);
        System.out.println("The " + k + "th character is: " + result);
    }
}
