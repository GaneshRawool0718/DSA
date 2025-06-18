package Day03;

public class BubbleSort {
    //method for bubble sorting
    public static void bubbleSort(int[] arr ,int size){
        for(int i = 0; i <= size - 1 ; i++){
            for(int j = 0;j <= (size - i) - 1; j++){
                //swap arr[j] and arr[j+1]
                if(arr[j] >  arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    //method for printing array
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }
        System.err.println();
    }
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int size = arr.length;

        bubbleSort(arr,size - 1);
        printArray(arr);
    }
}
