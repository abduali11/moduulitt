package moduuli3_3;


public class BankAccount {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(5000);

        System.out.println("Account " + account1.getAccountnumber() + " balance: " + account1.getAccountbalance());
        System.out.println("Account " + account2.getAccountnumber() + " balance: " + account2.getAccountbalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalaccounts());
    }


    private int accountnumber;
    private int accountbalance;
    private static int totalaccounts = 0;

    public BankAccount(int accountnumber) {
        this.accountbalance = accountnumber;
        this.accountnumber = ++totalaccounts;

    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountbalance += amount;
            System.out.println("The money has been deposited successfully " + amount);
        } else {
            System.out.println("the deposit is not possible");
        }

    }

    public void withdraw(double amount) {
        if (amount <= accountbalance && amount > 0) {
            accountbalance -=  amount;
            System.out.println("withdraw was succesfull " + amount);
        } else {
            System.out.println("withdrawing the money was not possible " + amount);
        }
    }

    public int getAccountbalance() {
        return accountbalance;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public static int getTotalaccounts() {
        return totalaccounts;
    }
}

