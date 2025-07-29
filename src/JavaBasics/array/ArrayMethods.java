package JavaBasics;
import java.util.Arrays;

public class ArrayMethods {

    static void arrayPrint(int[] num){
        for(int a : num){
            System.out.println( a +" ");
        }
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};

        System.out.println("Original array:"+ Arrays.toString(num));//convert array to string
        System.out.println(num.getClass().getSimpleName());

        Arrays.sort(num);//sort in ascending order
        System.out.println("Sorted array:"+ Arrays.toString(num));

        int index = Arrays.binarySearch( num,1);//binary search algorithm
        System.out.println("Index of the number is :"+ index);

        int[] copied = Arrays.copyOf(num, 7);// extra elements filled
        System.out.println("copied array is "+ Arrays.toString(copied));

        int[] rangeCopy = Arrays.copyOfRange(num,1,4); // index 1 to 3
        System.out.println("copied range array is :"+Arrays.toString(rangeCopy));

        int[] num2 = {1,2,3,4,6};// to ceheck equality between two array
        System.out.println("Checking Equality:"+Arrays.equals(num,num2));

        int[] fillArray = new int[5];//fill the whole array with the same given value
        Arrays.fill(fillArray,42);
        System.out.println("newly filled array: "+Arrays.toString(fillArray));

        Arrays.setAll(fillArray, i->i*i);// set value based on lambda
        System.out.println("After set all with square of index "+Arrays.toString(fillArray));

        int hash = Arrays.hashCode(num);
        System.out.println("Hash code of num array: "+hash);

        int mismatch = Arrays.mismatch(num,num2);//index where array differ
        System.out.println("Mismatch index in the two array are:"+ mismatch);

        int[] num3 = {10,9,6,5,7,8,2,5,12,6,8};
        Arrays.parallelSort(num3);
        System.out.println(Arrays.toString(num3));
    }
}
