package BankingApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

    private Client client;
    private Account account;
        private final List<Client> clients = new ArrayList<>();

    public void Bankrun(){
        
        Scanner scanner = new Scanner(System.in);

        String continueInput = "y";
        while (continueInput.equalsIgnoreCase("y")) {
        this.client = new Client();
        client.Welcome();

        System.out.print("Enter your name: ");
        client.setName(scanner.nextLine());

        System.out.print("Enter your driver's license: ");
        client.setDL(scanner.nextInt());

        scanner.nextLine();

        System.out.print("Enter your address: ");
        client.setAddress(scanner.nextLine());

        System.out.println();
        System.out.println("1. Checking");
        System.out.println("2. Savings");
        this.account = null;
        while(this.account==null) {
            System.out.println("Choose an account:");
            int choice = scanner.nextInt();
            if (choice==1){
                    System.out.println("Enter Starting balance:");
                    double balance = scanner.nextDouble();
                    this.account = new CheckingAccount(balance);
             }
            else if (choice==2){
                    System.out.println("Enter Starting balance:");
                    double balance = scanner.nextDouble();
                    this.account = new SavingsAccount(balance);
            }
            else {
                System.out.println("Not a valid input!");
                continue;
            }        
        }
       
       client.setAccount(account);
        clients.add(client);
        System.out.println();
        System.out.println("===== CLIENT INFORMATION =====");
        System.out.println("Name: " + client.getName());
        System.out.println("Driver's License: " + client.getDL());
        System.out.println("Address: " + client.getAddress());

        System.out.println();
        System.out.println("===== ACCOUNT INFORMATION =====");
        System.out.println(
                "Account Number: "
                + client.getAccount().getAccountNumber()
        );

        System.out.println(
                "Account Type: "
                + client.getAccount().getAccountType()
        );

        System.out.println(
                "Balance: $"
                + client.getAccount().getBalance()
        );

        System.out.print("Create another account? (y/n): ");
        scanner.nextLine(); // Consume the leftover newline after nextDouble()
        continueInput = scanner.nextLine();
        }

        scanner.close();
    }

}
