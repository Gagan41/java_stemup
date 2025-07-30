package JavaBasics.string;
import java.util.Scanner;

public class StrPg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name :");
        String name = sc.nextLine();

        String s = "apple";
        char[] chars = s.toCharArray();
        chars[0] = '$';
        chars[2] = '@';
        String result = new String(chars).toUpperCase();
        System.out.println(result);
        System.out.println(s.replace(s.charAt(0),'$').replace(s.charAt(2),'@').toUpperCase());

        if(!name.isEmpty()){
            System.out.println("Good morning "+name);
            if(name.length()<10){
                System.out.println("length is less than 10");
            }
            else{
                System.out.println("Length is grater than 10");
            }
        }
        else{
            System.out.println("invalid input");
        }
    }

}
