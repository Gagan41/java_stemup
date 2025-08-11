package Sorting;

public class InsertionSort {
    public static void iSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            System.out.println("-i="+i);
            int key = arr[i];
            System.out.println("-key="+key);
            // Element to be inserted at correct position
            int j = i - 1;
            System.out.println("-j="+j);
            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                printArray(arr);
                // Shift element to the right
                j--;
            }
            arr[j + 1] = key;
            printArray(arr);
            // Insert the key at the correct position
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Optional: main method to test the iSort method
    public static void main(String[] args) {
        int[] arr = {12,11,13,5,6};
        iSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
