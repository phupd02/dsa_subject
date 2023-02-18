package Week_1_to_3.week_1.shuffle_card;

public class Card implements Comparable<Card> {
    private int rank; // mo ta so
    private int suite;// mo ta chat

    //Constructor
    public Card(int rank, int suite) {
        this.rank = rank;
        this.suite = suite;
    }

    //getRankString
    public String getRankString() {
        if(rank == 1) 
            return "A";
        if(rank == 11)
            return "J";
        if(rank == 12)
            return "Q";
        if(rank == 13)
            return "K";
    return rank + "";

    }

    //getSuiteString
    public String getSuiteString() {
        if(suite == 1) 
        return String.format("%c",3);

        if(suite == 2)
        return String.format("%c",4);

        if(suite == 3)
        return String.format("%c",5);

    return String.format("%c",6);
    }

    //toString
    public String toString() {
        return "[" + getRankString() + getSuiteString() + "]";
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSuite(int suite) {
        this.suite = suite;
    }

    @Override
    public int compareTo(Card o) {
        if(this.rank % 2 == 0 && o.rank % 2 == 0) {
            return this.rank - o.rank;
        }
        if(this.rank % 2 != 0 && o.rank % 2 != 0) {
            return this.rank - o.rank;
        }
        return this.rank % 2 - o.rank % 2;
    }

    // Tham khảo các icon tương ứng với các số từ 0 đến 255
    // public static void main(String[] args) {
    //     for(int i = 0;i < 255;i++) {
    //         System.out.print(String.format("%d : %c",i,i) + "  |  ");
    //     }
    // }
}
