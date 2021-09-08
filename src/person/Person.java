package person;
import wallet.Wallet;

public class Person {
    private Wallet[] wallet;
    private double interest;

    public Person(Wallet [] wallet) {
        this.wallet = wallet;
        calculateTotalInterest();
    }

    private void calculateTotalInterest() {
        int n = wallet.length;
        for (int i = 0; i < n; i++) {
            this.interest = this.interest + wallet[i].getInterest();
        }
    }
    public double getInterest() {
        return interest;
    }
}
