package Assignments.A2;
import java.util.*;


public class LLNewFactorial {
    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> l = new LinkedList<>();

        System.out.println("Enter the length of the linked list:");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print("enter the "+(i+1)+" element:");
            int num = sc.nextInt();
            l.add(num);
        }

        LinkedList<Long> fact = new LinkedList<>();
        for(int i:l){
            fact.add(factorial(i));
        }

        System.out.println("Original lined list:"+l);
        System.out.println("Factorials linked list:"+fact);
    }
}
