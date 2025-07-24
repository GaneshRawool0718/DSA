package Day28;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int insertPos = 0;
        // Move non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        // Fill remaining positions with zeroes
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}


