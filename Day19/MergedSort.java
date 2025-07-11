package Day19;

public class MergedSort {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mIndex = m - 1;
        int nIndex = n - 1;
        int midStart = m + n - 1 ;

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

class Client {
    public static void main(String[] args) {
        MergedSort mergedSort = new MergedSort();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        mergedSort.merge(nums1, 3, nums2, 3);
        
        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
