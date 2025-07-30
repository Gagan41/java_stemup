package JavaBasics.string;

import java.util.Scanner;

public class ToggleCase {
    public static void caseUL(String s){
        String res = "";
        for (int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                res += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                res += Character.toUpperCase(ch);
            } else{
                res += ch;
            }
        }
        System.out.println("Toggled case is :"+res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        caseUL(str);
    }
}
