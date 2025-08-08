package JavaBasics;
import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int count = 0;
        int num = n;
        while (num > 0) {
            num /= 10;
            count++;
        }
        num = n;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, count);
            num /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println("Given Number is Armstrong");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
