public class BankingApplication {
    public static void main(String[] args) {

    }
}

class BankAccount
{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
        }
    }
}
