package creditcard;

public class Visa extends CreditCard{
    private double interestRate = .1;
    private double balance;
    private double interest;


    public Visa (double balance) {
        setCreditCardBalance(balance);
        this.interest = Math.round((balance * interestRate) * 100) / 100.0;

    }

    public void setCreditCardBalance(double balance) {
        this.balance = balance;
    }
    public void setCreditCardInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public double getCreditCardInterest() {
        return this.interest;
    }

}
