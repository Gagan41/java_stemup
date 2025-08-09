package JavaBasics.array;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length");
        int n = sc.nextInt();

        String[] fruits = new String[n];
        System.out.println("Enter the array elements");
        for(int i=0; i<n; i++){
            fruits[i]=sc.next();
        }

        System.out.println("ordered String are :");
        for(int i=0; i<n; i++){
            System.out.println(fruits[i]+" ");
        }

        System.out.println("Reversed String are :");
        for(int i=n-1; i>=0; i--){
            System.out.print(fruits[i]+" ");
        }

    }
}
