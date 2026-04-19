import java.util.*;

class Expense {
    String name;
    double amount;
    String category;
    String date;

    Expense(String name, double amount, String category, String date) {
        this.name = name;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Show Total");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.print("Enter expense name: ");
                String name = sc.nextLine();

                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter category (Food/Travel/etc): ");
                String category = sc.nextLine();

                System.out.print("Enter date (DD-MM-YYYY): ");
                String date = sc.nextLine();

                expenses.add(new Expense(name, amount, category, date));
                System.out.println(" Expense added!");

            } else if (choice == 2) {
                System.out.println("\n===== Your Expenses =====");

                if (expenses.isEmpty()) {
                    System.out.println("No expenses found.");
                } else {
                    for (Expense e : expenses) {
                        System.out.println("Name: " + e.name +" | Amount: " + e.amount +
                            " | Category: " + e.category +" | Date: " + e.date
                        );
                    }
                }

            } else if (choice == 3) {
                double total = 0;
                for (Expense e : expenses) {
                    total += e.amount;
                }
                System.out.println("Total Expense: " + total);

            } else if (choice == 4) {
                System.out.println("Exiting... Thank you!");
                break;

            } else {
                System.out.println("❌ Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}