package Week_1_to_3.week_2.card_project;

enum Suit { // enum: tập hằng số
    SPACE,
    CLUB,
    DIAMOND,
    HEART
}

public class Card implements Comparable<Card> {
    private int rank; //1, 2, 3....13
    private Suit suit;// Spade, club, diamond,heard

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // getRank
    public int getRank() {
        return rank;
    }
    
    //getSuit
    public Suit getSuit() {
        return suit;
    }

    //cài inteface comparable
    @Override
    public int compareTo(Card other) {
        if(this.rank > other.rank) {
            return 1; // return 1 so lon hon 0 tuc là lon hon
        }

        if(this.rank < other.rank) {
            return - 1; // return 1 so lon hon 0 tuc là lon hon
        }

        if(this.suit.ordinal() > this.suit.ordinal()) {
            return 1;
        }

        if(this.suit.ordinal() < this.suit.ordinal()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "(" + rank + ", " + suit + ")";
    }

}

