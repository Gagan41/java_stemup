package Sorting;

public class InsertionSort {
    public static void iSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Element to be inserted at correct position
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift element to the right
                j--;
            }
            arr[j + 1] = key; // Insert the key at the correct position
        }
    }

    // Optional: main method to test the iSort method
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
        iSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
