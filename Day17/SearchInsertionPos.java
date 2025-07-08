package Day17;

public class SearchInsertionPos {
// This class contains a method to find the index at which a target value should be inserted
// in a sorted array to maintain the order. If the target is found, it returns the
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // If not found, 'left' is the correct insert position
        return left;
    }
}

