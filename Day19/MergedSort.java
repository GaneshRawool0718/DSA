package Day19;

public class MergedSort {
// This class implements a method to merge two sorted arrays into one sorted array. 
// The first array is modified in place to contain the merged result.
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mIndex = m - 1;
        int nIndex = n - 1;
        int midStart = m + n - 1 ;

        // This method merges two sorted arrays nums1 and nums2 into nums1.
        // It assumes nums1 has enough space to hold the elements of nums2.
        // The merging is done in reverse order to avoid overwriting elements in nums1.
        // It starts from the end of both arrays and compares the elements,
        while(mIndex >= 0 &&  nIndex >= 0){
            if(nums1[mIndex] > nums2[nIndex]){
                nums1[midStart] = nums1[mIndex];
                mIndex--;
            }else{
                nums1[midStart] = nums2[nIndex];
                nIndex--;
            }
            midStart--;
        }

        while(nIndex >= 0){
            nums1[midStart] = nums2[nIndex];
            nIndex--;
            midStart--;
            
        }
    }
}

