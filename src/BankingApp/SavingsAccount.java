package BankingApp;

public class SavingsAccount extends Account {

    public SavingsAccount(
            int accountNumber,
            double balance) {

        super(accountNumber, balance);
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }
}