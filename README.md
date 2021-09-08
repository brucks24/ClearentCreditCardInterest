# ClearentCreditCardInterest
Make sure to add org.junit.jupiter:junit-jupiter:5.4.2 to your class path.
As long as you get this dependency you will be able to run the tests.
I recommend using the IntelliJ ide for this as it seems to be the fastest when installing dependencies. After cloning the repo
go into the tests package and then into the InterestTest.java file. Go down to the error and right click on it. Then click show context actions.
After that just click add JUnit5 to classpath and follow the steps. After adding the dependency IntelliJ lets you run the entire
class this will allow all the tests to run, the outcome will be 11/11 tests passed.
Write a java program that calculates Credit Card interest for a Person.  
 
Card Types and interest charged

Visa gets 10% interest
MC (Mastercard) gets 5% interest
Discover gets 1% interest
 
Each Card Type can have multiple cards and there can be multiple Wallets for a Person. 
 
NOTE:  SIMPLE INTEREST for this test case (means 1 month of interest, if the interest rate is 10% and the amount is 100.00 – interest in this case would be 10.00) 

Here are the test Cases - 
 
1 person has 1 wallet and 3 cards (1 Visa, 1 MC, 1 Discover) – Each Card has a balance of $100 – calculate the total interest (simple interest) for this person and per card. 
1 person has 2 wallets  Wallet 1 has a Visa and Discover , wallet 2 a MC -  each card has $100 balance - calculate the total interest(simple interest) for this person and interest per wallet
2 people have 1 wallet each,  person 1 has 1 wallet , with 2 cards MC and visa person 2 has 1 wallet – 1 visa and 1 MC -  each card has $100 balance - calculate the total interest(simple interest) for each person and interest per wallet

At least this is what the “business” has come up with at this point. They did mention the interest rates could change and the card balances will definitely fluctuate. We asked them if they had planned on introducing any variation of the “SIMPLE INTEREST” calculation and they said no. We also asked how many cards a Person usually has in their wallet and they said they weren’t really sure, maybe 4, or 5. Lastly, they mentioned they were working to get approval to support American Express and JCB cards but didn’t have any other details to share.

Write as many unit tests you feel are necessary to give us the confidence everything works. 
