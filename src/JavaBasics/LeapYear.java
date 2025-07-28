package JavaBasics;
import java.util.Scanner;

public class LeapYear {
    static boolean leap(int y){
       return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        if(leap(year)){
            System.out.println("Given year is leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}

