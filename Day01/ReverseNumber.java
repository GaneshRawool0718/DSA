import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int reverse = 0; // This will store the reverse number

        // Loop to reverse digits
        while( number != 0){
            int digit = number % 10; // Get the last digit
            reverse = reverse * 10 + digit; // Add the digit to the reversed number
            number /= 10; // Remove last digit from number
        }

        System.out.println("Reverse number : " + reverse); // Print reversed number
        sc.close();
    }
}