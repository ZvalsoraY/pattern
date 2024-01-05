package factory_card.factory;

import factory_card.cards.Card;
import factory_card.cards.DebitCard;

public class DebitCardCreator extends CardCreator{
    @Override
    public Card createCard() {
        return new DebitCard();
    }
}
