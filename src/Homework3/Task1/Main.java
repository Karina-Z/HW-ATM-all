package Homework3.Task1;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                Card card = deck.getCard(suit, rank);
                System.out.println(Card.rankToString(card.getRank()) + " " + Card.suitToString(card.getSuit()));
            }
        }
    }
}
