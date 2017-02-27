package com.copeland.CardDeck;


/**
 * Created by CopelandM on 2/27/2017.
 */
public class Card {
    private final Ranks rank;
    private final Suits suit;

    protected Card(Ranks r, Suits s){
        this.rank = r;
        this.suit = s;
    }

    public Ranks getRank(){
        return this.rank;
    }

    public Suits getSuit(){
        return this.suit;
    }
}
