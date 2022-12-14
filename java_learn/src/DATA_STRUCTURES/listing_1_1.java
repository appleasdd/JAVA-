package DATA_STRUCTURES;

public class listing_1_1 {
    public interface ATM{
        boolean verifyPIN(String pin);
        String selectAccount();
        boolean withdraw(String account, double amount);
        void display(String account,double amount, double success);
        void display(String pin, boolean success);
        void showBalance(String account);
    }
}
