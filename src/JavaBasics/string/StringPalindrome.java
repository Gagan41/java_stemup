package JavaBasics.string;
import java.util.Scanner;

public class StringPalindrome {

    public static void palindromeCheck(String str){
        String rev = "";
         for (int i=str.length()-1; i>=0 ; i--){
             rev += str.charAt(i);
         }

         if(str.equals(rev)){
             System.out.println("Given String is Palindrome");
         }
         else{
             System.out.println("Not Palindrome");
         }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String :");
        String str = sc.nextLine();
        palindromeCheck(str);
    }
}
