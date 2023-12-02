import java.util.Random;
import java.util.Arrays;

/**
 * Represents a deck of cards
 *
 * @author Hayden Banks
 * @version April 14, 2023
 */
public class Deck
{
    public Card[] cards;
    private Random random = new Random();

/**
 * Constructor that Generates a new deck of playing cards
 */    
    public Deck(){
        this.cards = new Card[52];
         int index = 0;
        for(int suit = 0; suit <= 3; suit++){
            for(int rank = 0; rank <= 12; rank++){
                this.cards[index] = new Card(rank,suit);
                index++;
            }
        }
    }

/**
 * Creates a deck of randomized cards
 */
    public void randomize(){
        int index = 0;
        for(Card card : cards){
            this.cards[index] = this.cards[random.nextInt(52)];
            index++;
        }
    }

/**
 * Shuffles a deck of cards
 */
    public void shuffle(){
        int index = 0;
        for (Card card : cards){
           int randIndex = random.nextInt(52);
           Card y = this.cards[randIndex];
           this.cards[randIndex] = this.cards[index];
           this.cards[index] = y;
           index++;
        }
    }
    
    public String toString(){
        return Arrays.deepToString(this.cards);
    }
    
}
