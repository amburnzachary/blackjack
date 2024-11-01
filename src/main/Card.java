package main;

public class Card {

    private Rank rank;
    private Suit suit;

    public Card() {
        this(Rank.ACE, Suit.CLUBS);
    }

    public Card(Rank rank, Suit suit) {
        this.setRank(rank);
        this.setSuit(suit);
    }

    public Card(Card guest) {
        this(guest.getRank(), guest.getSuit());
    }


    public Rank getRank() {
        return this.rank;
    }
    private void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return this.suit;
    }
    private void setSuit(Suit suit) {
        this.suit = suit;


    }
    public void addRank(Rank rank) {
        this.setRank(rank);
    }

    public void addSuit(Suit suit) {
        this.setSuit(suit);
    }

    public boolean equals(Card guest) {
        return this.getRank() == guest.getRank() && this.getSuit() == guest.getSuit();
    }

    public String toString() {
        return this.rank.toString() + " OF " + this.suit.toString();
    }
}
