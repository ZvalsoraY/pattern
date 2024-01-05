package factory_card.factory;

import factory_card.cards.Card;

public abstract class CardCreator {

    public abstract Card createCard();
    public void addBalance(){
        Card c = createCard();
        c.put();
    }
}
