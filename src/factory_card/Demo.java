package factory_card;

import factory_card.factory.CardCreator;
import factory_card.factory.CreditCardCreator;
import factory_card.factory.DebitCardCreator;

public class Demo {
    private static CardCreator cardCreator;

    public static void main(String[] args){
        cardCreator = new DebitCardCreator();
        configure("debit");
        runBusinessLogic();
    }

    static void configure(String x) {
        if (x.equals("debit")) {
            cardCreator = new DebitCardCreator();
        } else {
            cardCreator = new CreditCardCreator();
        }
    }

    static void runBusinessLogic() {
        cardCreator.addBalance();
    }
}
