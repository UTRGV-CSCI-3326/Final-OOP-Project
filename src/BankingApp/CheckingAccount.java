
package BankingApp;
public class CheckingAccount extends Account {

    public CheckingAccount(
            int accountNumber,
            double balance) {

        super(accountNumber, balance);
    }

    @Override
    public String getAccountType() {
        return "Checking Account";
    }
}