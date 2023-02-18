package Week_1_to_3.week_1.shuffle_card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Week_1_to_3.week_1.SortGenericData;

public class Desk {

//Shuffle
public static void shuffle(Card[] card) {
    int n = card.length;
    Random rand = new Random();

    for(int i = 0; i < n; i++) {
        int j = rand.nextInt(n);
        Card temp = card[i];
        card[i] = card[j];
        card[j] = temp;
    }
}

// print các quân bài
public static void printCard(Card[] card) {
    // In ra 13 quân / lần
    for(int i = 0;i <= 12;i++) {
        System.out.print(card[i] + " ");
    }
    System.out.println();
    for(int i = 13;i <= 25;i++) {
        System.out.print(card[i] + " ");
    }
    System.out.println();
    for(int i = 26;i <= 38;i++) {
        System.out.print(card[i] + " ");
    }
    System.out.println();
    for(int i = 39;i <= 51;i++) {
        System.out.print(card[i] + " ");
    }
}

// tạo ra các quân bài
public static Card[] createCard(Card[] card) {
    int count = 0;
    for(int suite = 1; suite <= 4; suite++) {
        for(int rank = 1; rank <= 13;rank++) {
            Card outCard = new Card(rank, suite);
            card[count] = outCard;
            count++;
        }
    }
    return card;
}

    // printList
    public static <T> void printList(List<T> list) {
        for (T card : list) {
            System.out.println(card);
        }

    }

    // Xoa quan bai JQK
    public static void removeJQK(List<Card> deckList) {
        for (int i = 0; i < deckList.size(); i++) {
            if(deckList.get(i).getRankString().equals("J")|| deckList.get(i).getRankString().equals("Q")|| deckList.get(i).getRankString().equals("J")) {
                deckList.remove(deckList.get(i));
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Card card[] = new Card[52];//chua 52 quan bài
        card = createCard(card);
        //Tạo ra bộ bài
        printCard(card);
        System.out.println("\n");
        System.out.print("           ==============Shuffle Card==============");
        //Trộn bài
        System.out.println("\n");
        shuffle(card);
        printCard(card);

        //List - là một
        List<Card> deckList = new ArrayList<Card>();
        // List<Card> cardList = new List<Card>();  - SAI
        // do List là một interface nên không thể tạo được dối tượng
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= 4; j++) {
                deckList.add(new Card(i, j));
            }
        }

        // chuyển list thanh array
        Card[] deckArray = deckList.toArray(new Card[deckList.size()]);
        System.out.println("ARRAY: deckArray");
        SortGenericData.printArray(deckArray);

        System.out.println("LIST: deckList");
        printList(deckList);

        Card temp = deckList.get(0);
        deckList.set(0,deckList.get(51));
        deckList.set(51, temp);

        System.out.println("LIST : deckList");
        printList(deckList);

        //Tao mot bo bai luu trong list
        List<Card> newList = new ArrayList<Card>();
        for (int i = 1; i <=13; i++) {
            for (int j = 1; j <= 4; j++) {
                newList.add(new Card(i,j));
            }
        }

        

    }



}
