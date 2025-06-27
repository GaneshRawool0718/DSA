package Day10;

import java.util.Scanner;
public class LongestUncommonSeq {
    public static int longestUncommonSubsequence(String str1, String str2) {
        // This method returns the length of the longest uncommon subsequence between two strings.
        // If both strings are equal, it returns -1.
        if (str1.equals(str2)) {
            return -1;
        }
        // If the strings are not equal, return the length of the longer string.
        return Math.max(str1.length(), str2.length());
    }
    
}

class Client {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = Scanner.nextLine();
        System.out.println("Enter second string: ");
        String str2 = Scanner.nextLine();

        int result = LongestUncommonSeq.longestUncommonSubsequence(str1, str2);
        System.out.println("Length of Longest Uncommon Subsequence: " + result);

        Scanner.close();
    }
}
