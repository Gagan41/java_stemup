package Assignments.A2;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;

public class LLEvenOddCount {
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

        int evenCount = 0;
        int oddCount = 0;

        // Iterate and count
        for (int num : list) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Display results
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);

    }
}
