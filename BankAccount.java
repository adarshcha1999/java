class Account {
    String accountHolderName;
    int accountNumber;
    double accountBalance;
    public void ShowBalance(){
        System.out.println("AccountBalance"+accountBalance);
    }
    void deposit(int account)
    {
        this.accountBalance+=account;
    }
}
public class BankAccount{
        public static void main(String[] args) {
            Account a1=new Account();
            a1.accountBalance=2400.00;
            a1.ShowBalance();
        }
    }

