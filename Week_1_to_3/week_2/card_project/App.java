package Week_1_to_3.week_2.card_project;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Card[] deck = new Card[52];

        for(int i = 0;i < 13;i++) {
            deck[i] = new Card(i+1, Suit.SPACE);
            deck[i + 13] = new Card(i+1, Suit.CLUB);
            deck[i + 26] = new Card(i+1, Suit.DIAMOND);
            deck[i + 39] = new Card(i+1, Suit.HEART);
        }

        List<Card> list = Arrays.asList(deck);

        //Shuffle
        Collections.shuffle(list);
        for(Card card: list) {
            System.out.println(card);
        }

        //Sort colections
        System.out.println("\n AFTER SORTING: ");
        Collections.sort(list);
        for(Card card: list) {
            System.out.println(card);
        }

        // //todo: BUBLE sort (not use Collections Framwork)
        // for(int i = deck.length - 1;i > 0;i--) {
        //     for(int j = 1; j < deck.length - 1 ;j++) {
        //         if(deck[j].compareTo(deck[j + 1]) > 0) {
        //             Card temp = deck[j];
        //             deck[j] = deck[j + 1];
        //             deck[j + 1] = temp;
        //         }
        //     }
        // }

        //Giả su ta muon sap xep nguoc

        // su dung anonymous class to define a customer camparator


    }
}
