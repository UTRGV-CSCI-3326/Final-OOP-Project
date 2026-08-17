/******************************************************************************
Final Project OOP
Team 5
Members: Brenda Moreno, Michael Garza

*******************************************************************************/
package BankingApp;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Client client = new Client();

        client.Welcome();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        client.setName(name);

        System.out.println("Enter your account number: ");
        int acctnum = scanner.nextInt();
        client.setAcctNum(acctnum);

        System.out.println("Enter your driver's license: ");
        int driversLicense = scanner.nextInt();
        client.setDL(driversLicense);

        scanner.nextLine(); // clears the leftover Enter key

        System.out.println("Enter your address: ");
        String address = scanner.nextLine();
        client.setAddress(address);

        System.out.println();
        System.out.println("===== CLIENT INFORMATION =====");
        System.out.println("Name: " + client.getName());
        System.out.println("Account Number: " + client.getAcctNum());
        System.out.println("Driver's License: " + client.getDL());
        System.out.println("Address: " + client.getAddress());

        scanner.close();
    }
}