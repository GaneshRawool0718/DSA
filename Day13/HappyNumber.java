package Day13;

public class HappyNumber {
// A happy number is defined by the following process:
// Starting with any positive integer, replace the number by the sum of the squares of its digits   
// and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle that does not include 1.
// Those numbers for which this process ends in 1 are happy numbers, while those that do
// not end in 1 are unhappy numbers.
    public boolean isHappy(int n) {
        int num = n;
        int sum ;

        // A happy number will eventually reach 1, while an unhappy number will enter a cycle.
        // The cycle for unhappy numbers includes the number 4.
        while(num != 1 && num != 4){
            sum = 0;
            while(num > 0){
                int digit = num % 10;
            sum += (digit * digit);
            num /= 10;
            }
            num = sum;
        }

        // If the number is 1, it is a happy number.
        if(num == 1){
            return true;
        }else{
            return false;
        }
    }
}

class Client {
    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        int n = 19; // Example input
        boolean result = happyNumber.isHappy(n);
        System.out.println("Is " + n + " a happy number ? " + result); 
    }
}
