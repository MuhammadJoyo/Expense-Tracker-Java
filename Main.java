import java.util.*;

class Expense {
    String name;
    double amount;

    Expense(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();

        System.out.println("Enter number of expenses:");
        int n = sc.nextInt();
        sc.nextLine();

        // Taking input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter expense name:");
            String name = sc.nextLine();

            System.out.println("Enter amount:");
            double amount = sc.nextDouble();
            sc.nextLine();

            expenses.add(new Expense(name, amount));
        }

        // Display expenses
        System.out.println("\n===== Your Expenses =====");
        double total = 0;

        for (Expense e : expenses) {
            System.out.println("Expense: " + e.name + " | Amount: " + e.amount);
            total += e.amount;
        }

        // Total
        System.out.println("----------------------------");
        System.out.println("Total Expense: " + total);
    }
}