package factory_card.cards;

public class DebitCard implements Card{
    @Override
    public void get() {
        System.out.println("You get money from debit card.");
    }

    @Override
    public void put() {
        System.out.println("You have increased your debit card balance.");
    }
}
