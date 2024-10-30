package main;

public class Card {

    private int rank;
    private int suit;

    public Card() {
        this(1, 1);
    }

    public Card(int rank, int suit) {
        this.setRank(rank);
        this.setSuit(suit);
    }

    public Card(Card guest) {
        this(guest.getRank(), guest.getSuit());
    }


    public int getRank() {
        return this.rank;
    }
    private void setRank(int rank) {
        this.rank = rank;
    }

    public int getSuit() {
        return this.suit;
    }
    private void setSuit(int suit) {
        this.suit = suit;
    }
}
