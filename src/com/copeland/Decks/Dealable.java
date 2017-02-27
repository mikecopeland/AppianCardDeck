package com.copeland.Decks;

import com.copeland.Decks.Cards.Card;
import com.sun.istack.internal.Nullable;

interface Dealable {
    @Nullable
    Card dealOneCard();
}
