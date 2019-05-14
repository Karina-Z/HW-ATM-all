package Homework3.Task1;

public class Deck {

    private static final int NUM_SUITS = 4;
    private static final int NUM_RANKS = 13;

    private Card[][] cards;

    public Deck() {
        cards = new Card[NUM_SUITS][NUM_RANKS];
        for (int suit = 1; suit <= NUM_SUITS; suit++) {
            for (int value = 1; value <= NUM_RANKS; value++) {
                cards[suit - 1][value - 1] = new Card(value, suit);
            }
        }
    }


    public Card getCard(int suit, int value) {
        return cards[suit - 1][value - 1];
    }
}
