import com.mikecopeland.Decks.Deck;
import org.junit.Assert;
import org.junit.Test;

import java.security.SecureRandom;

public class DeckTest {
    private final int NUMBER_OF_CARDS = 52;
    @Test
    public void testDeckCreation(){
        Deck testDeck;
        testDeck = new Deck();
        int countOfCards = 0;
        for (int i = 1; i<=NUMBER_OF_CARDS; i++){
            if(testDeck.dealOneCard()!=null)
                countOfCards++;
        }
        Assert.assertEquals("Deck does not contain " + NUMBER_OF_CARDS + " cards", countOfCards, NUMBER_OF_CARDS);
    }

    @Test
    public void testShuffle() {
        final int ACCEPTABLE_NUM_UNSHUFFLED_CARDS = 26; //half of the deck
        int numUnshuffledCards = 0;
        Deck unshuffledDeck = new Deck();
        Deck shuffledDeck = new Deck();
        shuffledDeck.shuffle();
        for(int i=0; i<NUMBER_OF_CARDS; i++){
            SecureRandom random = new SecureRandom();
            int randomIndex = random.nextInt(NUMBER_OF_CARDS);
            if(unshuffledDeck.dealOneCard(randomIndex) == shuffledDeck.dealOneCard(randomIndex)){
                numUnshuffledCards++;
            }
        }
        Assert.assertTrue("There are " + numUnshuffledCards + " unshuffled cards! The acceptable number is " + ACCEPTABLE_NUM_UNSHUFFLED_CARDS + "." , numUnshuffledCards<=ACCEPTABLE_NUM_UNSHUFFLED_CARDS);
    }

}
