package Searching;

public class RecursiveBinarySearch {
    static int binarySearch(int [] arr,int key, int low, int high,int step){
        if(low>high){
            System.out.println("Step"+step+". Range invalid(low>high). Key not found");
            return -1;
        }
        int mid = (low+high)/2;
        System.out.println("Step "+step+". low = "+low+". high ="+high+". mid = "+mid);

        if(arr[mid]==key){
            System.out.println("Step "+step+": key found at index:"+mid);
            return mid;
        }
        else if(arr[mid]<key){
            return binarySearch(arr, key, mid+1, high, step+1);
        }
        else{
            return binarySearch(arr, key, low, mid-1, step+1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        int key = 10;
        int res = binarySearch(arr,key,0, arr.length-1,1 );
        if(res!=-1){
            System.out.println("Final result: key found at index:"+res);
        }
        else System.out.println("KEy not found");
    }
}
