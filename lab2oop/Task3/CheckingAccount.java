package Task3;

public class CheckingAccount extends Account{
    private int transactionCount;
    private final int FREE_TRANSACTIONS = 3;

    public CheckingAccount(int a){
        super(a);
        transactionCount = 0;
    }

    @Override
    public void deposit(double sum){
        super.deposit(sum);
        transactionCount++;
    }

    @Override
    public void withdraw(double sum){
        super.withdraw(sum);
        transactionCount++;
    }

    public void deductFee(){
        if(transactionCount > FREE_TRANSACTIONS){
            int extraTransactions = transactionCount - FREE_TRANSACTIONS;
            double fee = extraTransactions * 0.02;
            super.withdraw(fee);
        }
        transactionCount = 0;
    }

    @Override
    public String toString(){
        return "Checking Account Number: " + getAccountNumber() + " Balance" + getBalance() + " Transactions: " + transactionCount;
    }
}
