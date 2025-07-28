package JavaBasics;
import java.util.Scanner;

public class FactorOfNumber {
    static void isFactor(int n){
       int i = 1;
        System.out.println("The factors of "+ n +" are:");
       while(i<=n){
           if(n % i == 0){
               System.out.print(i+" ");
           }
           i++;
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        isFactor(num);
    }
}
