package java_class;
import java.util.HashMap;
import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {
        HashMap<String, BankingSystem> hm = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome");
            System.out.println("1. Create new Account");
            System.out.println("2. Banking");
            System.out.println("3. Exit");
            System.out.println("Enter the number");
            int option = scan.nextInt();
            scan.nextLine();

            if (option == 1) {
                System.out.println("Enter the Name:");
                String name = scan.nextLine();
                System.out.println("Enter the Mobile:");
                String aNum = scan.nextLine();

                BankingSystem bs = new BankingSystem(aNum, name);
                hm.put(aNum, bs);

            } else if (option == 2) {
                System.out.println("Enter the Account Number:");
                String aNum = scan.nextLine();

                BankingSystem bs = hm.get(aNum);
                if (bs == null) {
                    System.out.println("Account not found!");
                    continue;
                }

                System.out.println("1. Balance Check");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("Enter the Number:");
                int bOption = scan.nextInt();
                if (bOption == 1) {
                    System.out.println("Your Account Balance: " + bs.getBalance());
                } else if (bOption == 2) {
                    System.out.println("Enter amount to withdraw:");
                    double amount = scan.nextDouble();
                    bs.withdraw(amount);
                } else if (bOption == 3) {
                    System.out.println("Enter amount to deposit:");
                    double amount = scan.nextDouble();
                    bs.deposit(amount);
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            } else if (option == 3) {
                System.out.println("Exiting the application.");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
        scan.close();
    }
}
