

import java.util.Scanner;

class BankService {
    double balance;
    Scanner scanner;

    BankService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void showBalance() {
        System.out.println("******************");
        System.out.printf("Your balance is: $%.2f\n", this.balance);
    }

    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = this.scanner.nextDouble();
        if (amount <= (double)0.0F) {
            System.out.println("Invalid amount");
        }

        this.balance += amount;
        System.out.printf("Your new balance is: $%.2f\n", this.balance);
    }

    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount2 = this.scanner.nextDouble();
        if (amount2 > this.balance) {
            System.out.println("Insufficient funds");
        } else if (amount2 <= (double)0.0F) {
            System.out.println("Invalid amount, you can't enter 0 or a negative number");
        } else {
            System.out.println("Process withdrawal....");
            this.balance -= amount2;
            System.out.printf("Your new balance is: $%.2f\n", this.balance);
        }

    }
}
