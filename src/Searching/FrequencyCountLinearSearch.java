package Searching;

public class FrequencyCountLinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,20,10,10,30,40,50,60,10};
        int key = 10,count = 0;

        System.out.println("counting frequency of count is:");
        for(int i=0;i<arr.length;i++){
            System.out.println("Checking index "+i);
            if(arr[i] == key) count++;
        }

        System.out.println("Frequency of the key is :"+count);
    }
}
