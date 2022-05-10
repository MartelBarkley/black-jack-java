package blackjack;

public enum Suit {
    CLUB("Clubs"),
    DIAMOND("Diamond"),
    HEART("Hearts"),
    SPADE("Spades");

    String suitName;

    Suit(String suitName) {
        this.suitName = suitName;
    }

    public String toString() {
        return suitName;
    }
}
