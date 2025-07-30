package JavaBasics.string;
import java.util.Scanner;

public class ReverseString {

    public static void revStr(String str){
       String rev = "";
       for(int i = str.length()-1; i>=0; i--){
           rev += str.charAt(i);
       }
        System.out.println("Reversed String is :"+rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String :");
        String str = sc.nextLine();
        revStr(str);
    }
}
