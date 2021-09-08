package wallet;

import creditcard.CreditCard;

public class Wallet {
    private CreditCard [] creditCards;
    private double interest = 0;

    public Wallet(CreditCard [] creditCards) {
        this.creditCards = creditCards;
        calculateTotalInterest();
    }
    private void calculateTotalInterest () {
        int n = creditCards.length;
        for (int i = 0; i < n; i++) {
            this.interest = this.interest + creditCards[i].getCreditCardInterest();
        }
    }
    public double getInterest() {
        return this.interest;
    }

}
