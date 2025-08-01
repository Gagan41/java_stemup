package Assignments.A2;
import java.util.*;

public class LLAmstrongNumber {

    public static boolean isArmstrong(int n) {
        int ref = n;
        int count = 0;

        while (ref != 0) {
            int cur = ref%10;
            count += (cur*cur*cur);
            ref /= 10;
        }

        return count==n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("How many numbers do u want to check:");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print("Enter "+(i+1)+" Number:");
            int num = sc.nextInt();
            list.add(num);
        }

        for (int num : list) {
            if (isArmstrong(num)) {
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is NOT an Armstrong number.");
            }
        }
    }
}
