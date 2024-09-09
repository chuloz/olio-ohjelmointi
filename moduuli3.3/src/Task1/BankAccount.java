package Task1;

public class BankAccount {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        //Talletetaan 500 tilille 1 ja nostetaan 5000 tililtä 2.
        account1.deposit(500);
        account2.withdraw(5000);

        //Tulostetaan tilien saldot

        System.out.println("Account " + account1.getAccountnumber() + " balance: " + account1.getAccountbalance());
        System.out.println("Account " + account2.getAccountnumber() + " balance: " + account2.getAccountbalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalaccounts());
    }


    private int accountnumber; // Pankkitilin numero
    private int accountbalance; // Pankkitilin saldo
    private static int totalaccounts = 0; // Kokonaistilien määrä

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