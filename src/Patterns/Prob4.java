package Patterns;
import java.util.*;

public class Prob4 {
    // *****
    // *****
    // *****
    // *****
    // *****
    public static void pat1(int n){
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //1
    //12
    //123
    //1234
    //12345
    public static void pat2(int n){
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //1
    //2 3
    //4 5 6
    //7 8 9 10
    public static void pat3(int n){
        int num = 1;
        for (int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    //12345
    //1234
    //123
    //12
    //1
    public static void pat4(int n){
        for (int i=n; i>=0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //A
    //AB
    //ABC
    //ABCD
    //ABCDE
    public static void pat5(char c){
       for(int i=0; i<=(int)c-'A'; i++){
           for(int j=0; j<i+1; j++){
               System.out.print((char)('A'+j)+" ");
           }
           System.out.println();
       }
    }

    //ABCDE
    //ABCD
    //ABC
    //AB
    //A

    public static void pat6(char c){
        int n = (int)c-'A';
        for(int i=n; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        pat1(n);
        pat2(n);
        pat3(n);
        pat4(n);
        System.out.println("Enter a character in UpperCase:");
        char c = sc.next().charAt(0);
        pat5(c);
        pat6(c);
    }
}

