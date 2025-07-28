package JavaBasics;
import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int n){
        int count=0,num=n;
        while(num>0){
           int cur = num % 10;
           count += (cur*cur*cur);
           num /= 10;
        }
        System.out.println(count);
        return count == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(isArmstrong(num)){
            System.out.println("Given Number is Armstrong");
        }
        else{
            System.out.println("not an Armstrong Number");
        }
    }
}
