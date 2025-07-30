package JavaBasics.string;
import java.util.Scanner;

// For better performance use ajjax

public class RemoveSpaceInString {
    public static void remSpace(String str){
        String res = str.replace(" ","");
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String :");
        String str = sc.nextLine();
        remSpace(str);
    }
}
