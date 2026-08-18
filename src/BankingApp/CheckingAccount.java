
package BankingApp;
public class CheckingAccount extends Account {

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public String getAccountType() {
        return "Checking Account";
    }
}