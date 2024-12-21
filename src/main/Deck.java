package main;

public class Deck {

    private Card[] deck;
    private int cardsDealt;

    public Deck() {
        this.initDeck();
    }


    public Card[] getDeck() {
        return this.deck;
    }

    private void setDeck(Card[] deck) {
        if (deck.length == 52)
            this.deck = deck;
    }

    public int getCardsDealt() {
        return this.cardsDealt;
    }

    private void setCardsDealt(int val) {
        this.cardsDealt = val;
    }


    public void initDeck() {
        Card[] deck = new Card[52];
        this.setCardsDealt(0);
        int i = 0;

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck[i] = new Card(rank, suit);
                ++i;
            }
        }
        this.setDeck(deck);
    }

    public Card getCard(int i) {
        return this.getDeck()[i];
    }

    public void shuffleDeck() {
        for (int i = 0; i < 100; ++i) {
            int i1 = (int) (Math.random() * 52);
            int i2 = (int) (Math.random() * 52);
            Card tmp = this.getCard(i1).copy();
            this.getDeck()[i1] = this.getCard(i2);
            this.getDeck()[i2] = tmp;
        }
    }

    public Card drawCard() {
        Card drawnCard = this.getCard(this.getCardsDealt());
        this.setCardsDealt(this.getCardsDealt() + 1);
        return drawnCard;
    }

    public void printDeck() {
        for (int i = 0; i < 52; ++i) {
            System.out.println(this.getCard(i).toString());
        }
    }
}
