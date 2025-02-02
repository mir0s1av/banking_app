

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankService bankService = new BankService(scanner);

        boolean isRunning = true;
        int choice;
        while (isRunning) {
            System.out.println("******************");
            System.out.println("BANKING APPLICATION");
            System.out.println("******************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("******************");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> bankService.showBalance();
                case 2 -> bankService.deposit();
                case 3 -> bankService.withdraw();
                case 4 -> {
                    System.out.println("Thank you for using our service");
                    isRunning = false;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
