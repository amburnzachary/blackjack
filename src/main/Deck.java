package main;

public class Deck {

    private Card[] deck;

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


    public void initDeck() {
        Card[] deck = new Card[52];
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

    public void printDeck() {
        for (int i = 0; i < 52; ++i) {
            System.out.println(this.getCard(i).toString());
        }
    }
}
