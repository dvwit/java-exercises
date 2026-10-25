public class BankAccount {
    public String owner;
    private double balance;

    public BankAccount(String owner, double startingBalance) {
        this.owner = owner;
        if (startingBalance >= 0) {
            this.balance = startingBalance;
        } else {
            this.balance = 0;
            System.out.println("Invalid starting balance. Set to 0.");
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than 0.");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 1000.0);

        account.deposit(500);
        account.withdraw(200);

        System.out.println("Remaining balance: " + account.getBalance());
    }
}
