package Assignments.A2;
import java.util.*;

public class LLleapyear {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> years = new LinkedList<>();

        System.out.print("Enter how many years you want to check: ");
        int count = scanner.nextInt();
        for (int i=0; i<count; i++) {
            System.out.print("Enter year " + (i + 1) + ": ");
            int year = scanner.nextInt();
            years.add(year);
        }
        for (int year : years) {
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is NOT a Leap Year");
            }
        }
    }
}

