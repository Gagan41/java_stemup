package JavaBasics;
import java.util.Scanner;

public class PowerOfNumber {
    static int power(double n,double p){
        return (int)Math.pow((double)n,(double)p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        double num = sc.nextDouble();
        System.out.println("Enter the Power:");
        double pow = sc.nextDouble();
        int res = power(num,pow);
        System.out.println("Result is:"+res);
    }
}
