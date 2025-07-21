package Day26;

public class MakeFancyString {
    // Method to remove characters so that no three consecutive characters are the same
    public String makeFancyString(String s) {
        // Use StringBuilder to efficiently build the final result
        StringBuilder result = new StringBuilder();

        // Counter to track consecutive character repetitions
        int count = 1;

        // Iterate through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            // If the current character is the same as the previous one, increment the count
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                // Reset the count for a new character
                count = 1;
            }

            // Append the character only if it doesn't form three consecutive duplicates
            if (count <= 2) {
                result.append(s.charAt(i));
            }
        }

        // Return the resulting fancy string
        return result.toString();
    }
}


// class Client{
//     public static void main(String[] args){
//         MakeFancyString obj = new MakeFancyString();

//         String s = "aaabaaaa";
//         String data = obj.makeFancyString(s);

//         System.err.println(data);
//     }
// }
