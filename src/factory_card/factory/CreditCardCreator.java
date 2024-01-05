package factory_card.factory;

import factory_card.cards.Card;
import factory_card.cards.CreditCard;

public class CreditCardCreator extends CardCreator{
    @Override
    public Card createCard() {
        return new CreditCard();
    }
}
