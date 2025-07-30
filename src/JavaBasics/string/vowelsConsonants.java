package JavaBasics.string;
import java.util.Scanner;

public class vowelsConsonants {

    public static void vowelCon(String str){
        int v=0,c=0;
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
               if("aeiou".indexOf(ch)!=-1){ //if aeiou is in the string by checking each index of the string
                   v++;
               }
               else{
                   c++;
               }
            }
        }
        System.out.println("Vowels count is :"+v);
        System.out.println("Consonants count is :"+c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String :");
        String name = sc.nextLine().toLowerCase();
        vowelCon(name);
    }
}
