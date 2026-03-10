package Task3;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int a, double interestRate){
        super(a);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        double interest = getBalance() * interestRate / 100.0;
        deposit(interest);
    }

    @Override
    public String toString(){
        return "SavingsAccount number: " + getAccountNumber() + " Balance: " + getBalance() + " Interest rate: " + interestRate + "%";
    }
    
}
