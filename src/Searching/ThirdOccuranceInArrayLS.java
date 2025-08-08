package Searching;

public class ThirdOccuranceInArrayLS {
    public static void main(String[] args) {
        int[] arr = {10,20,30,10,50,10,60};
        int key = 10,count = 0;
        System.out.println("Finding the third occurrence of the element in Array");
        for(int i=0; i< arr.length; i++){
            if(arr[i] == key){
                count++;
                if(count==3){
                    System.out.println("the Third occurrence index is :"+i);
                    break;
                }
            }
        }
    }
}
