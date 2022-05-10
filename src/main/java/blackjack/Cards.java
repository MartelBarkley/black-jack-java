package blackjack;

public class Cards {

    private Suit suit;
    private Rank rank;

    public Cards(Suit suit,Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getValue() {
        return rank.rankValue;
    }

    public String toString() {
        return ("["+rank+" of "+ suit + "] ("+this.getValue()+")");
    }
}
