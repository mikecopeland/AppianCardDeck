package com.mikecopeland;

import com.mikecopeland.Cards.Card;
import com.mikecopeland.Decks.Deck;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        do{
            System.out.println(deck.dealOneCard());
        }
        while(!deck.isEmpty());
    }
}
