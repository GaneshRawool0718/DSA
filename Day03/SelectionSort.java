package Day03;

public class SelectionSort {
    //method for selection sort
    public static void selectionSort(int[] arr,int size){
        for(int i = 0;i < size ; i++){
            int minIndex = i;
            for(int j = i+1;j < size;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    
    //printing array after sorting
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int[] arr = {8,16,45,75,18};
        int size = arr.length;

        selectionSort(arr,size);
        printArray(arr);
    }
}
