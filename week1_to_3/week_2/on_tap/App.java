package Week_1_to_3.week_2.on_tap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        // Card card = new Card(1, Suit.DIAMOND);
        // System.out.println(card);

        // Create the deck
        Card[] deck = new Card[52];
        for(int i = 0; i < 13;i++) {
            deck[i] = new Card(i + 1, Suit.SPACE);
            deck[i + 13] = new Card(i + 1, Suit.CLUB);
            deck[i + 26] = new Card(i + 1, Suit.DIAMOND);
            deck[i + 39] = new Card(i + 1, Suit.HEARD);
        }

        //Print the cards on the dislay
        // Cách 1:for(int i = 0; i < 52;i++) {
        //     System.out.print(deck[i] + " ");
        // }
        for (Card card : deck) {
            System.out.println(card);
        }

        List<Card> listDeck = Arrays.asList(deck);
        //shuffle the deck
        //The first way:
        Collections.shuffle(listDeck);

        //After shuffle
        System.out.println("AFTER SHUFLING: ");
        for (Card card : deck) {
            System.out.println(card);
        }

        // The second shuffling way: tự viết thuật toán
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int j = rand.nextInt(deck.length);
            if(deck[i] != deck[j]) {
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
            }
        }
        for (Card card : deck) {
            System.out.println(card);
        }

    }
}
