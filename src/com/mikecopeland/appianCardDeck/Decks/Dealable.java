package com.mikecopeland.appianCardDeck.Decks;

import com.mikecopeland.appianCardDeck.Cards.Card;
import com.sun.istack.internal.Nullable;

interface Dealable {
    @Nullable
    Card dealOneCard();

    @Nullable
    Card dealOneCard(int i);
}
