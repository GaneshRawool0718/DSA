package Day44;

public class LargestGoodInteger {
    /*
     * This class finds the largest "good integer" in a given string representation of a number.
     * A "good integer" is defined as a substring of three identical digits.
     * The method iterates through the string and checks each substring of length 3.
     * It keeps track of the largest good integer found.
     */
    public String largestGoodInteger(String num) {
      String maxGoodInteger = "";
        
        for (int i = 0; i < num.length() - 2; i++) {
            String substring = num.substring(i, i + 3);
            if (substring.charAt(0) == substring.charAt(1) && substring.charAt(1) == substring.charAt(2)) {
                // If it's a good integer, check if it's the largest
                if (substring.compareTo(maxGoodInteger) > 0) {
                    maxGoodInteger = substring;
                }
            }
        }
        
        return maxGoodInteger;
    }
}
