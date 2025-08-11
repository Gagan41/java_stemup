package Sorting;
public class BubbleSort {
    public static void bSort(int[] arr){
        int n = arr.length;
        boolean swapped;
        for ( int i=0; i<n-1; i++){
            swapped = true;
            for (int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            printArray(arr);
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
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
