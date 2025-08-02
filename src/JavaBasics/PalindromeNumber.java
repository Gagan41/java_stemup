package JavaBasics;
import java.util.Scanner;

public class PalindromeNumber {
    static boolean isPalindrome(int n) {
        int rev = 0, ref = n;
        while (ref > 0) {
            int cur = ref % 10;
            rev = rev * 10 + cur;
            ref /= 10;
        }
        System.out.println(rev + "," + ref);
        return rev == n;
    }

    public static boolean isPalindromeNumber(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return (x == rev || x == rev / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println("Given Number is palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        System.out.println(isPalindromeNumber(num));
    }
}
