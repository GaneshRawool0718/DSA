package Day16;

public class MaxConsecutiveOnes {
// This class contains a method to find the maximum number of consecutive 1's in a binary array.
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxCount = 0 ;
        int currentCount = 0;
        
        // Iterate through the array to count consecutive 1's
        for(int val : nums){
            if(1 == val){
                    currentCount++;
                    maxCount = Math.max(maxCount,currentCount);
                }else{
                   
                    currentCount = 0;
                }
        }
    
        return maxCount;
    }
}

