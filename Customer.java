class Customer {
    private double balance;

    public Customer() {
        this.balance = 0.0;
    }

    public void addBalance(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added: $" + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void addBalance(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added: $" + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    protected void deductBalance(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Deducted: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        
        customer.addBalance(100.50);
        customer.addBalance(50);
        customer.showBalance();
        
        customer.deductBalance(30.25);
        customer.showBalance();
    }
}

