package Task3;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Account acc1 = new Account(1001);
        SavingsAccount acc2 = new SavingsAccount(1002, 5.0);
        CheckingAccount acc3 = new CheckingAccount(1003);

        bank.openAccount(acc1);
        bank.openAccount(acc2);
        bank.openAccount(acc3);

        acc1.deposit(500);

        acc2.deposit(1000);

        acc3.deposit(200);
        acc3.withdraw(50);
        acc3.deposit(100);
        acc3.withdraw(20);
        acc3.deposit(30);

        System.out.println("Before update:");
        bank.printAccounts();

        bank.update();

        System.out.println();
        System.out.println("After update:");
        bank.printAccounts();

        bank.closeAccount(1001);

        System.out.println();
        System.out.println("After closing account 1001:");
        bank.printAccounts();
    }
} 


    

