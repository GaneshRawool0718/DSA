package Day05;

public class JumpGame {
    /*
     * Jump Game
     * This class implements a solution to the Jump Game problem.
     * The problem is to determine if you can reach the last index of an array
     * where each element represents the maximum jump length from that position.
     */
    public static boolean canJump(int[] nums) {
        /*
         * This method checks if you can jump to the last index of the array.
         * It uses a greedy approach to keep track of the maximum reachable index.
         * If at any point the current index exceeds the maximum reachable index,
         * it returns false, indicating that the last index cannot be reached.
         */
        int maxReachable = 0;
        for(int i =0; i< nums.length;i++){
            if(i > maxReachable) {
                return false;
            }
            maxReachable = Math.max(maxReachable, i + nums[i]);
        }
        return true;
    }
}

class Client {
    // This class contains the main method to test the JumpGame class.
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        boolean result = JumpGame.canJump(nums);
        System.out.println("Can jump to the last index: " + result); 
    }
}