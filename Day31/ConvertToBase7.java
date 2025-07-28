package Day31;

public class ConvertToBase7 {
    /**
    * Converts an integer to its base 7 representation. 
    * If the number is negative, the result will start with a '-' sign.
    *
     */
    public String convertToBase7(int num) {
        // Handle the case for zero
        if (num == 0) return "0";

        boolean isNegative = num < 0;
        num = Math.abs(num);

        StringBuilder sb = new StringBuilder();

        // Convert the number to base 7
        while (num > 0) {
            sb.append(num % 7);
            num /= 7;
        }

        if (isNegative) sb.append('-');

        return sb.reverse().toString();
    }
}

// class Main {
//     public static void main(String[] args) {
//         ConvertToBase7 converter = new ConvertToBase7();
//         System.out.println(converter.convertToBase7(100)); // Output: "202"
//         System.out.println(converter.convertToBase7(-7));  // Output: "-10"
//         System.out.println(converter.convertToBase7(0));   // Output: "0"
//     }
// }
