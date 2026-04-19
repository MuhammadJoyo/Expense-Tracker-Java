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
            System.out.println("4. Delete Expense");
            System.out.println("5. Edit Expense");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter expense name: ");
                String name = sc.nextLine();

                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter category: ");
                String category = sc.nextLine();

                System.out.print("Enter date (DD-MM-YYYY): ");
                String date = sc.nextLine();

                expenses.add(new Expense(name, amount, category, date));
                System.out.println(" Expense added!");

            } else if (choice == 2) {
                if (expenses.isEmpty()) {
                    System.out.println("No expenses found.");
                } else {
                    System.out.println("\n===== Your Expenses =====");
                    for (int i = 0; i < expenses.size(); i++) {
                        Expense e = expenses.get(i);
                        System.out.println(i + ". " + e.name + " | " + e.amount +
                                " | " + e.category + " | " + e.date);
                    }
                }

            } else if (choice == 3) {
                double total = 0;
                for (Expense e : expenses) {
                    total += e.amount;
                }
                System.out.println("Total Expense: " + total);

            } else if (choice == 4) {
                System.out.print("Enter index to delete: ");
                int index = sc.nextInt();
                sc.nextLine();

                if (index >= 0 && index < expenses.size()) {
                    expenses.remove(index);
                    System.out.println(" Expense deleted!");
                } else {
                    System.out.println(" Invalid index!");
                }

            } else if (choice == 5) {
                System.out.print("Enter index to edit: ");
                int index = sc.nextInt();
                sc.nextLine();

                if (index >= 0 && index < expenses.size()) {
                    Expense e = expenses.get(index);

                    System.out.print("Enter new name: ");
                    e.name = sc.nextLine();

                    System.out.print("Enter new amount: ");
                    e.amount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter new category: ");
                    e.category = sc.nextLine();

                    System.out.print("Enter new date: ");
                    e.date = sc.nextLine();

                    System.out.println("Expense updated!");
                } else {
                    System.out.println(" Invalid index!");
                }

            } else if (choice == 6) {
                System.out.println("Exiting... Thank you!");
                break;

            } else {
                System.out.println(" Invalid choice!");
            }
        }

        sc.close();
    }
}