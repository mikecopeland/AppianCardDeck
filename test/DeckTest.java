import com.mikecopeland.appianCardDeck.Cards.Ranks;
import com.mikecopeland.appianCardDeck.Cards.Suits;
import com.mikecopeland.appianCardDeck.Decks.Deck;
import org.junit.Assert;
import org.junit.Test;


public class DeckTest {
    private final int NUMBER_OF_CARDS = Ranks.values().length * Suits.values().length;
    @Test
    public void testDeckCreation(){
        Deck testDeck;
        testDeck = new Deck();
        int countOfCards = 0;
        for (int i = 1; i<=NUMBER_OF_CARDS; i++){
            if(testDeck.dealOneCard()!=null)
                countOfCards++;
        }
        Assert.assertEquals("Deck does not contain " + NUMBER_OF_CARDS + " cards!", countOfCards, NUMBER_OF_CARDS);
        Assert.assertNull("Attempt to deal card from empty deck does not yield null." , testDeck.dealOneCard());
    }

    @Test
    public void testShuffle() {
        final int ACCEPTABLE_NUM_UNSHUFFLED_CARDS = 10;
        int numUnshuffledCards = 0;
        Deck unshuffledDeck = new Deck();
        Deck shuffledDeck = new Deck();
        shuffledDeck.shuffle();
        for(int i=0; i<NUMBER_OF_CARDS; i++){
            if(unshuffledDeck.dealOneCard() == shuffledDeck.dealOneCard()){
                numUnshuffledCards++;
            }
        }
        Assert.assertTrue("There are " + numUnshuffledCards + " unshuffled cards! The acceptable number is " + ACCEPTABLE_NUM_UNSHUFFLED_CARDS + "." , numUnshuffledCards<=ACCEPTABLE_NUM_UNSHUFFLED_CARDS);
    }

}
