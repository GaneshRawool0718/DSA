import java.util.Scanner;

class PalindromeManual{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter a String : ");
        String originalString = sc.nextLine();

        String reverseString = "";

        // Manually reverse the String using charAt()
        for(int i=originalString.length() - 1;i>=0;i--){
            reverseString += originalString.charAt(i);
        }

        // Compare original String  and reversed string with ignoring case
        if(originalString.equalsIgnoreCase(reverseString)){
            System.out.println(originalString + " is a palindrome string.");
        }else{
            System.out.println(originalString + " is not a palindrome string.");
        }

        sc.close();
    }
}