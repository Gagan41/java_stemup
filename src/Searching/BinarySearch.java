package Searching;

public class BinarySearch {
    static int binary(int[] arr, int key){
        int l = 0, h = arr.length-1;
        while(l<=h){
            int mid = (l+h)/2;
            System.out.println("Mid index is:"+mid+",  value: "+arr[mid]);
            if(arr[mid]==key) return mid;
            if(arr[mid]<key) l = mid+1;
            else h = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int key = 40;
        int res = binary(arr,key);
        System.out.println(res);
    }
}
