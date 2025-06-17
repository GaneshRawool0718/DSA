import java.util.Scanner;

class PalindromeBuiltin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user 
        System.out.print("Enter a string : ");
        String originalString = sc.nextLine();

        // Use StringBuffer to reverse the string
        StringBuffer sb = new StringBuffer(originalString);
        String reverseString = sb.reverse().toString();

        // Compare original and reversed string with ignoring case 
        
        if(originalString.equalsIgnoreCase(reverseString)){
            System.out.println(originalString + " is a palindrome string.");
        }else{
            System.out.println(originalString + " is not a palindrome string.");
        }

        sc.close(); 
    }
}
