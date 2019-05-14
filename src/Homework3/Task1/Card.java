package Homework3.Task1;

public class Card {

    private final int rank;
    private final int suit;

    public final static int DIAMONDS = 1;
    public final static int CLUBS = 2;
    public final static int HEARTS = 3;
    public final static int SPADES = 4;

    public final static int ACE = 1;
    public final static int DEUCE = 2;
    public final static int THREE = 3;
    public final static int FOUR = 4;
    public final static int FIVE = 5;
    public final static int SIX = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE = 9;
    public final static int TEN = 10;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
        if (DIAMONDS < suit && suit > SPADES) {
            throw new IllegalArgumentException("Illegal playing card suit");
        }
        if (ACE < rank && rank > KING) {
            throw new IllegalArgumentException("Illegal playing card value");
        }
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public static String rankToString(int rank) {
        switch (rank) {
            case ACE:
                return "Ace";
            case DEUCE:
                return "Deuce";
            case THREE:
                return "Three";
            case FOUR:
                return "Four";
            case FIVE:
                return "Five";
            case SIX:
                return "Six";
            case SEVEN:
                return "Seven";
            case EIGHT:
                return "Eight";
            case NINE:
                return "Nine";
            case TEN:
                return "Ten";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            default:
                return "King";


        }
    }

    public static String suitToString(int suit) {
        switch (suit) {
            case DIAMONDS:
                return "Diamonds";
            case CLUBS:
                return "Clubs";
            case HEARTS:
                return "Hearts";
            default:
                return "Spades";

        }
    }

}

