package tests;

import creditcard.CreditCard;
import creditcard.Discover;
import creditcard.MasterCard;
import creditcard.Visa;
import org.junit.jupiter.api.Test;
import person.Person;
import wallet.Wallet;

import static org.junit.jupiter.api.Assertions.*;

class InterestTest {
    //****************************************************************************************************************
    // 1 person has 1 wallet and 3 cards (1 Visa, 1 MC, 1 Discover) – Each Card has a balance of $100 – calculate the total interest (simple interest) for this person and per card.
    //****************************************************************************************************************
    private CreditCard [] creditCards = {new MasterCard(100), new Discover(100), new Visa(100)};
    private Wallet [] wallet = {new Wallet(creditCards)};
    private Person p = new Person(wallet);
    @Test
    void mastercardInterestCase1() {
         assertEquals(5.00, creditCards[0].getCreditCardInterest());
    }

    @Test
    void discoverInterestCase1() {
        assertEquals(1.00, creditCards[1].getCreditCardInterest());
    }
    @Test
    void visaInterestCase1() {
        assertEquals(10.00, creditCards[2].getCreditCardInterest());
    }

    @Test
    void personInterestCase1() {
        assertEquals(16.00, p.getInterest());
    }
    //****************************************************************************************************************
    //1 person has 2 wallets  Wallet 1 has a Visa and Discover , wallet 2 a MC -  each card has $100 balance - calculate the total interest(simple interest) for this person and interest per wallet
    //****************************************************************************************************************
    private CreditCard [] creditCards1 = {new Visa(100), new Discover(100)};
    private CreditCard [] creditCards2 = {new MasterCard(100)};
    private Wallet [] wallet1 = {new Wallet(creditCards1), new Wallet(creditCards2)};
    private Person p1 = new Person(wallet1);

    @Test
    void wallet1InterestCase2() {
        assertEquals(11.00, wallet1[0].getInterest());
    }
    @Test
    void wallet2InterestCase2() {
        assertEquals(5.00, wallet1[1].getInterest());
    }
    @Test
    void personInterestCase2() {
        assertEquals(16.00, p1.getInterest());
    }
    //****************************************************************************************************************
    //2 people have 1 wallet each,  person 1 has 1 wallet , with 2 cards MC and visa person 2 has 1 wallet – 1 visa and 1 MC -  each card has $100 balance - calculate the total interest(simple interest) for each person and interest per wallet
    //****************************************************************************************************************
    private CreditCard [] creditCardsPerson1 = {new MasterCard(100), new Visa(100), new MasterCard(100), new Visa(100)}; //I was confused if this one meant that there were two total cards in the wallet one visa and one mc or if this was supposed to be 4 total cards 2 visa and 2 mc.
                                                                                                                                                    //So I went with 4 cards total because the test cases would have been the same as person 2.
    private CreditCard [] creditCardsPerson2 = {new MasterCard(100), new Visa(100)};
    private Wallet [] walletPerson1 = {new Wallet(creditCardsPerson1)};
    private Wallet [] walletPerson2 = {new Wallet(creditCardsPerson2)};
    private Person p2 = new Person(walletPerson1);
    private Person p3 = new Person(walletPerson2);

    @Test
    void wallet1InterestCase3() {
        assertEquals(30.00, walletPerson1[0].getInterest());
    }
    @Test
    void wallet2InterestCase3() {
        assertEquals(15.00, walletPerson2[0].getInterest());
    }
    @Test
    void person1InterestCase3() {
        assertEquals(30.00, p2.getInterest());
    }
    @Test
    void person2InterestCase3() {
        assertEquals(15.00, p3.getInterest());
    }
    //****************************************************************************************************************
}