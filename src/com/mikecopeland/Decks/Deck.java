package com.mikecopeland.Decks;


import com.mikecopeland.Cards.Card;
import com.mikecopeland.Cards.Ranks;
import com.mikecopeland.Cards.Suits;
import com.sun.istack.internal.Nullable;

import java.util.LinkedList;
import java.util.Random;

public class Deck implements Shuffleable, Dealable {
    private LinkedList<Card> cards = new LinkedList<>();
    private final int TOP_OF_DECK = 0;

    public Deck() {
        for (Ranks r : Ranks.values()) {
            for (Suits s : Suits.values()) {
                cards.add(new Card(r, s));
            }
        }
    }

    @Override
    public @Nullable
    Card dealOneCard(){
        if(!this.isEmpty()) {
            return dealOneCard(TOP_OF_DECK);
        }
        else{
            return null;
        }
    }

    @Override
    public @Nullable
    Card dealOneCard(int idx){
        if(!this.isEmpty() && this.cards.size()>idx) {
            Card returnedCard = cards.get(idx);
            cards.remove(idx);
            return returnedCard;
        }
        else{
            return null;
        }
    }

    public boolean isEmpty(){
        return this.cards.isEmpty();
    }

    @Override
    public void shuffle(){
        int count = 0;
        Random random = new Random();
        int sizeofDeck = cards.size();
        int range = sizeofDeck-count;
        while(range>0){
            //pick random card from deck, move it to end
            int randIdx = random.nextInt(range);
            Card shuffledCard = cards.get(randIdx);
            cards.remove(randIdx);
            cards.offer(shuffledCard);
            //decrease the range we select from by 1 (the amount of moved cards)
            range = sizeofDeck-(++count);
        }
    }
}