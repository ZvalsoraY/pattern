package factory_card.cards;

public class CreditCard implements Card{
    @Override
    public void get() {
        System.out.println("You get money from credit card.");
    }

    @Override
    public void put() {
        System.out.println("You have increased your credit card balance.");
    }
}