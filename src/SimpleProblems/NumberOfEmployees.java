package SimpleProblems;
import java.util.Scanner;

public class NumberOfEmployees {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
      int count = 0;
        for(int i:hours){
            if(i>=target){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array elements:");
        int[] hours = new int[5];
        for(int i = 0; i<hours.length; i++){
            hours[i] = sc.nextInt();
        }
        System.out.println("Enter the target:");
        int tar = sc.nextInt();
        int res = numberOfEmployeesWhoMetTarget(hours,tar);
        System.out.println(res);
    }
}
