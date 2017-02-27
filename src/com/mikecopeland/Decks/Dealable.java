package com.mikecopeland.Decks;

import com.mikecopeland.Cards.Card;
import com.sun.istack.internal.Nullable;

interface Dealable {
    @Nullable
    Card dealOneCard();

    @Nullable
    Card dealOneCard(int i);
}
