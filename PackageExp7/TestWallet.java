package PackageExp7;

public class TestWallet {

    public static void main(String[] args) {
        // Creating a DigitalWallet object
        DigitalWallet myWallet = new DigitalWallet();

        // Adding funds
        myWallet.addFunds(100.0);
        myWallet.addFunds(50.0);

        // Spending funds
        myWallet.spendFunds(30.0);
        myWallet.spendFunds(150.0); // Should display insufficient funds message

        // Trying to access balance directly (will cause an error if uncommented)
        // System.out.println(myWallet.balance); // ERROR: balance is private

        // Using the public method to check balance
        System.out.println("Final Balance: $" + myWallet.getBalance());
    }
}
