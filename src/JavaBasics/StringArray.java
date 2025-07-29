package JavaBasics;
import java.util.Scanner;
import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of fruits:");
        int n = sc.nextInt();

        String[] fruits = new String[n];
        // {"apple","banana","mango","pineapple","orange"};

        System.out.println("Enter the array elements:");
        for(int i=0; i<n ; i++){
            fruits[i] = sc.next();
        }

        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

        System.out.println("Enter the fruit to be searched:");
        String s = sc.next();

       int index = Arrays.binarySearch(fruits,s);
        System.out.println("found at index:"+index);
    }
}
