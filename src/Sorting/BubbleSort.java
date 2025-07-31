package Sorting;
public class BubbleSort {
    public static void bSort(int[] arr){
        int n = arr.length;
        for ( int i=0; i<n-1; i++){
            for (int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            printArray(arr);
        }
    }
    public static void printArray(int [] arr){
        System.out.println("Printing each Iteration:");
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,7,3,5,2};
        bSort(arr);
    }
}
