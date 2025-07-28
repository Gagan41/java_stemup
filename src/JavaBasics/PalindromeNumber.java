package JavaBasics;
import java.util.Scanner;

public class PalindromeNumber {
    static boolean isPalindrome(int n) {
        int rev = 0, ref = n;
        while (ref > 0) {
            int cur = ref % 10;
            rev = rev * 10 + cur;
            ref /= 10;
            if (rev == ref) {
                System.out.println(rev + "," + ref);
                return true;
            }
        }
        System.out.println(rev + "," + ref);
        return rev == n;
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
    }
}
