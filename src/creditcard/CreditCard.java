package creditcard;

public abstract class CreditCard {
    //I only put methods that were absolutely necessary to accomplish the task as well as anything that was hinted like adjusting interest rates. So methods like getCreditCardBalance was left out because I wanted it to to be as simple as possible
    abstract public void setCreditCardBalance(double balance);

    //Added this because it mentioned that interest rates could change
    abstract public void setCreditCardInterestRate(double interestRate);

    abstract public double getCreditCardInterest();
}
