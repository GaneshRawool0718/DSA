package Day06;

import java.util.Scanner;

public class PowerOfTwo {
    /* This class contains a method to check if a given number is a power of two.
     * A number is a power of two if it can be expressed as 2^n for some integer n >= 0.
     */
    public static  boolean isPowerOfTwo(int number){
// This method checks if the given number is a power of two.
// It returns true if the number is a power of two, otherwise false.
    if(number < 1){
        return false;
    }else if(number == 1) {
        return true;
    }else {
        while(number % 2 == 0){
            number /= 2;
        }
        if(number == 1){
            return true;
        }else {
            return false;
        }
    }
}
}

class Client {
    public static void main(String [] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = obj.nextInt();
        boolean result = PowerOfTwo.isPowerOfTwo(number);

        if(result){
            System.out.println(number + " is power of two");
        }else{
            System.out.println(number + " is not power of two");
        }

        obj.close();
    }
}