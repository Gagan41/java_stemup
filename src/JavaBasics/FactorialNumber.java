package JavaBasics;
import java.util.Scanner;

public class FactorialNumber {
    static int fact(int n){
      if(n==0 || n==1){
          return 1;
      }
      else {
          return n*fact(n-1);
      }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int res = fact(num);
        System.out.println("The Factorial of given number is:"+res);
    }
}
