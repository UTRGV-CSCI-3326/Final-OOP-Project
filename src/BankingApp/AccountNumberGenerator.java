package BankingApp;
//lets us make the create a new account number for everyone//
public class AccountNumberGenerator {
    private static int nextAccountNumber = 10000;
    public static int generateAccountNumber() {
        return nextAccountNumber++;
    }
}

