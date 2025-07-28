package JavaBasics;
import java.util.Scanner;

public class GreatestOfThreeNumber {
    public static int greatest(int a, int b, int c){
        return Math.max(Math.max(a,b),c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        System.out.println("Enter value of c:");
        int c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("a is the greatest number");
        }
        if(b>=a && b>=c){
            System.out.println("b is the greatest number");
        }
        else{
            System.out.println("c is the greatest number");
        }

        int res = greatest(a,b,c);
        System.out.println("gratest number is :"+res);
    }
}
