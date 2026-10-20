
class BankAccount {
    // Private data members
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    BankAccount(String accountHolder, String accountNumber,
                double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method with validation
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
        } else {
            balance += amount;
            System.out.println("Deposit successful: Rs. " + amount);
        }
    }

    // Withdrawal method with validation
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: Rs. " + amount);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account =
            new BankAccount("Parul", "123456789", 5000);

        System.out.println("Account Holder: "
                           + account.getAccountHolder());
        System.out.println("Account Number: "
                           + account.getAccountNumber());
        System.out.println("Initial Balance: Rs. "
                           + account.getBalance());

        // Valid transactions
        account.deposit(2000);
        account.withdraw(1000);

        // Invalid transactions
        account.deposit(-500);
        account.withdraw(0);
        account.withdraw(-200);
        account.withdraw(10000);

        // Updated balance
        System.out.println("Final Balance: Rs. "
                           + account.getBalance());
    }
}

