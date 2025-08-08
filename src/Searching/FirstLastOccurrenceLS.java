package Searching;

public class FirstLastOccurrenceLS {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 10, 30, 40, 50, 10, 60};
        int key = 10;
        int f = -1, l = -1;
        System.out.println("Finding first and last occurrence:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (f == -1) {
                    f = i;
                }
                l = i;
            }
        }

        if (f != -1) {
            System.out.println("First occurrence at index: " + f);
            System.out.println("Last occurrence at index: " + l);
        } else {
            System.out.println("Element not found.");
        }
    }
}
