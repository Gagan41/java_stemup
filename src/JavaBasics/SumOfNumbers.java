package JavaBasics;
import java.util.Scanner;

public class SumOfNumbers {

    public static int sumOfN(int num){
        return (num*(num+1))/2;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = sumOfN(num);
        System.out.println("Sum of"+num+"is :"+sum);
    }
}
