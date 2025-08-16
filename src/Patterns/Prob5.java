package Patterns;
import java.util.Scanner;

public class Prob5 {

    //hollow rectangle
    static void pat1(int r,int c){
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                if(i==1 || i == r || j == 1 || j == c){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //pyramid
    static void pat2(int r){
        for(int i=1; i<=r; i++){ // over rows
            for(int j=1; j<=r-i; j++){ //spaces
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //number pattern
    static void pat3(int r){
        for(int i=1; i<=r; i++){ // over rows
            for(int j=i; j<=r; j++){ //first part
                System.out.print(j);
            }
            for(int k=1; k<=i-1; k++){ // second part
                System.out.print(k);
            }
            System.out.println();
        }
    }

    //number pattern
    static void pat4(int r,int c){
        for(int i = 1; i<=r ; i++){
            for(int j = 1; j<=c; j++){
                if((i+j)%2 == 0){ //checking if the even and odd of the matrix indices
                    System.out.print(1);
                } else{
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }

    //unique number pyramid
    static void pat5(int r){
        for(int i=1; i<=r; i++){ // over rows
            for(int j=1; j<=r-i; j++){ //spaces
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k);
            }
            for(int l=i-1; l>=1; l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }

    static void pat6(int r) {
        for (int i = 1; i <= r; i++) {
            // spaces before first number
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }

            if (i == 1) {
                // only single "1"
                System.out.print("1");
            } else if (i < r) {
                // print i, then spaces, then i again
                System.out.print(i);
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print(i);
            } else {
                // last row: print 2*r - 1 numbers of i
                for (int j = 1; j <= 2 * r - 1; j++) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Row:");
        int r = sc.nextInt(); // also the length upto which we can go
        System.out.println("Enter the Column number:");
        int c = sc.nextInt();
         pat1(r,c);
         pat2(r);
         pat3(r);
         pat4(r,c);
         pat5(r);
         pat6(r);
    }
}
