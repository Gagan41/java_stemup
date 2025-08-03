package Assignments.A3;
import java.util.*;

public class CurrencyConvertor {
    static final double USD = 83.10;
    static final double EURO = 91.85;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nCurrency Calculator Menu:");
            System.out.println("1. Rupees to USD");
            System.out.println("2. USD to Rupees");
            System.out.println("3. Rupees to Euro");
            System.out.println("4. Euro to Rupees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount in Rupees: ");
                    double inr1 = sc.nextDouble();
                    double usd1 = inr1 / USD;
                    System.out.printf("USD: %.2f\n", usd1);
                    break;

                case 2:
                    System.out.print("Enter amount in USD: ");
                    double usd2 = sc.nextDouble();
                    double inr2= usd2 * USD;
                    System.out.printf("INR: %.2f\n", inr2);
                    break;

                case 3:
                    System.out.print("Enter amount in Rupees: ");
                    double inr3 = sc.nextDouble();
                    double euro3 = inr3 / EURO;
                    System.out.printf("Euro: %.2f\n", euro3);
                    break;

                case 4:
                    System.out.print("Enter amount in Euro: ");
                    double euro4 = sc.nextDouble();
                    double inr4 = euro4 * EURO;
                    System.out.printf("INR: %.2f\n", inr4);
                    break;

                case 5:
                    System.out.println("Exiting Currency Calculator. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
