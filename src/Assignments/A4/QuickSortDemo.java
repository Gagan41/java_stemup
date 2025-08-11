package Assignments.A4;

public class QuickSortDemo {
    static int partition(int[] arr,int l,int h){
        int pivot = arr[h];
        int i = l-1;
        for(int j=l; j<=h-1; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return i+1;
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int [] arr,int l,int h){
        if(l<h){
            int p = partition(arr,l,h);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,h);
        }
    }

    public static void main(String[] args) {
        int [] arr = {45,12 ,78 ,34 ,23 ,56 ,89 ,90 ,11 ,67 ,43 ,99 ,5 ,18 ,72};
        int n =arr.length;
        quickSort(arr,0,n-1);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
