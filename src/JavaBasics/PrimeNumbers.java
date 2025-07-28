package JavaBasics;
import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int num){
      if (num <=1 ){
          return false;
      }
      int limit = (int)Math.sqrt(num);
      for ( int i = 2; i<=limit ; i++){
          if((num % i) == 0){
              return false;
          }
        }
      return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println("the Given number is prime Number:");
        }
        else{
            System.out.println("not a prime number:");
        }
    }
}
