package com.copeland;

import com.copeland.Decks.Cards.Card;
import com.copeland.Decks.Deck;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        do{
            Card card = deck.dealOneCard();
            System.out.println(card.getRank() + " of " + card.getSuit());
        }
        while(!deck.isEmpty());
    }
}
