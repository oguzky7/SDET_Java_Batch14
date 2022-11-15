package HomeWorks.class26_HW2;
import java.util.ArrayList;
import java.util.LinkedList;
class CardTest {
    public static void main(String[] args) {
        LinkedList<Card> cardTypes = new LinkedList<>();
        cardTypes.add(new Card("Credit Card", 10, 2000));
        cardTypes.add(new Card("Debit Card", 15, 25000));
        cardTypes.add(new Card("Savings Card", 20, 100));
        System.out.println("With for loop:");System.out.println(" ");
        for (Card card:cardTypes) {
            card.printBalance();
        }
        System.out.println(" ");System.out.println("*****************************   *****************************   *****************************"); System.out.println("With Advanced for loop:");System.out.println(" ");

        for (int i = 0; i < cardTypes.size(); i++) {
            cardTypes.get(i).printBalance();
        }
        System.out.println(" ");System.out.println("*****************************   *****************************   *****************************"); System.out.println("With Iterator: ");System.out.println(" ");
        var iterator = cardTypes.iterator();
        while (iterator.hasNext()){
            var item=iterator.next();
            item.printBalance();
        }
    }//oguzky7
}
public class Card {
    double interestRate;
    String cardType;
    double balance;
    public Card(String cardType, double interestRate, double balance){
        this.cardType = cardType;
        this.balance = balance;
        this. interestRate = interestRate;
    }
    void printBalance(){
        System.out.println(balance);
    }
}