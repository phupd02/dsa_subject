package Week_1_to_3.week_2.on_tap;

// enum chua cac constant value
enum Suit {
    SPACE,
    CLUB,
    DIAMOND,
    HEARD
}

public class Card {
    int rank;// 1,2,.. 13
    Suit suit;// SPACE, CLUB, DIAMOND,HEARD

     //constructor
    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    //getter and setter
    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    //toString
    @Override
    public String toString() {
        return  "(" + this.rank + ", " + this.suit + ")";
    }
    
}
