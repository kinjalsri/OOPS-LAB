package PackageExp7;

class DigitalWallet implements Wallet {
    private double balance; // Private balance variable (Encapsulation)

    // Constructor to initialize the wallet with zero balance
    public DigitalWallet() {
        this.balance = 0.0;
    }

    // Implement addFunds() method
    @Override
    public void addFunds(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added $" + amount + " to wallet. New Balance: $" + balance);
        } else {
            System.out.println("Invalid amount. Cannot add negative funds.");
        }
    }

    // Implement spendFunds() method
    @Override
    public void spendFunds(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Spent $" + amount + " from wallet. Remaining Balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Transaction declined.");
        } else {
            System.out.println("Invalid amount. Cannot spend negative funds.");
        }
    }

    // Method to check the balance
    public double getBalance() {
        return balance;
    }
}
