package Day11;

public class FirstIndexOccurence {
    // This class contains a method to find the first index of occurrence of a substring in a string.
    public int strStr(String haystack, String needle) {
        // This method returns the first index of occurrence of the substring 'needle' in the string 'haystack'.
        return haystack.indexOf(needle);
    }
}

// class Client {
//     public static void main(String[] args) {
//         FirstIndexOccurence obj = new FirstIndexOccurence();
//         String haystack = "hello";
//         String needle = "ll";
        
//         int result = obj.strStr(haystack, needle);
//         System.out.println("First index of occurrence : " + result);
//     }
// }