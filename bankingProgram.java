//Banking Program

import java.util.Scanner;

public class bankingProgram {
    public static int balance = 0;
    public static int choice;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu(scanner); 
            if (choice == 1) {
                System.out.println("Current Balance : " + balance);
            }
            else if (choice == 2) {
                System.out.print("Enter an amount to deposit : ");
                int deposit = scanner.nextInt();
                if (deposit > 0) {
                    balance += deposit;
                }
                else System.out.println("Deposit amount must be greater than 0.");
            }
            else if (choice == 3) {
                System.out.print("Enter an amount to withdrawl : ");
                int withdrawl = scanner.nextInt();
                if (withdrawl > 0 && withdrawl <= balance) {
                    balance -= withdrawl;
                }
                else System.out.println("Withdrawl amount must be smaller or equal than current balance.");
            }
            else if (choice == 4) {
                System.out.println("Thanks for using this program!");
                break;
            }
            else System.out.println("Invalid input!");
        }
        scanner.close();
    }
    public static void showMenu(Scanner scanner) {
        System.out.println("===============");
        System.out.println("Banking Program");
        System.out.println("1. Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdrawl");
        System.out.println("4. Exit");
        System.out.println("===============");
        System.out.println("Enter a number : ");
        choice = scanner.nextInt();
    }
}
