package Day14;

public class PowerOfThree {
    // Checks if a given integer n is a power of three.
    // A number is a power of three if it can be expressed as 3^k
    //where k is a non-negative integer.
    public boolean isPowerOfThree(int n) {
        // Handle edge cases for negative numbers and zero
        // since powers of three are always positive.
        if(n < 1){
            return false;
        }else if(n == 1){
            return true;
        }else{
            while(n % 3 == 0){
                n /= 3;
            }
            if(n == 1){
                return true;
            }else{
                return false;
            }
        }
    }
}

// class Client {
//     public static void main(String[] args) {
//         PowerOfThree pot = new PowerOfThree();
//         int n = 27; // Example input
//         boolean result = pot.isPowerOfThree(n);
//         System.out.println(n + " is a power of three: " + result);
//     }   
// }
