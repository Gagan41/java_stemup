package JavaBasics.array;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the length of the array:");
       int n = sc.nextInt();
       int[] ogarr = new int[n];
       int[] carr = new int[n];

        System.out.println("Enter the og array elements");
        for (int i =0 ; i<n; i++){
            ogarr[i] = sc.nextInt();
            carr[i] = ogarr[i];
        }

        System.out.println("Copied array is:");
        for(int i=0;i<n;i++){
            System.out.print(carr[i]+" ");
        }
    }
}
