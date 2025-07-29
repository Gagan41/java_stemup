package JavaBasics.array;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {1,2,4,7,9,5,3};
        for(int i=0 ;i < arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Sorted array is :");
        for(int i=0; i< arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
