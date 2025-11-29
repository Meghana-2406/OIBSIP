import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Predefined user credentials
        String correctUserId = "user123";
        String correctPin = "1234";

        double balance = 5000.0;
        String transactions = "";

        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        if (userId.equals(correctUserId) && pin.equals(correctPin)) {
            System.out.println("\nLogin successful!");
            boolean running = true;

            while (running) {
                System.out.println("\n=== ATM Menu ===");
                System.out.println("1. Transaction History");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Quit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        if (transactions.isEmpty()) {
                            System.out.println("No transactions yet.");
                        } else {
                            System.out.println("Transactions History:\n" + transactions);
                        }
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdraw = sc.nextDouble();
                        if (withdraw <= balance) {
                            balance -= withdraw;
                            transactions += "Withdraw: -" + withdraw + "\n";
                            System.out.println("Withdrawal successful! Current balance: " + balance);
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                        break;

                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double deposit = sc.nextDouble();
                        balance += deposit;
                        transactions += "Deposit: +" + deposit + "\n";
                        System.out.println("Deposit successful! Current balance: " + balance);
                        break;

                    case 4:
                        sc.nextLine(); // consume newline
                        System.out.print("Enter recipient account number: ");
                        String recipient = sc.nextLine();
                        System.out.print("Enter amount to transfer: ");
                        double transfer = sc.nextDouble();
                        if (transfer <= balance) {
                            balance -= transfer;
                            transactions += "Transfer to " + recipient + ": -" + transfer + "\n";
                            System.out.println("Transfer successful! Current balance: " + balance);
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                        break;

                    case 5:
                        running = false;
                        System.out.println("Thank you for using ATM. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid option. Try again.");
                }
            }

        } else {
            System.out.println("Invalid User ID or PIN.");
        }

        sc.close();
    }
}
