/**
 * Represents a playing card
 *
 * @author Hayden Banks
 * @version April 14, 2023
 */
public class Card
{
    public final String[] ranks = {
        "Ace","2","3","4","5","6","7","8","9","10",
        "Jack","Queen","King"
    };
    
    public final String[] suits = {
        "Spades","Hearts","Clubs","Diamonds"
    };
    
    private int rank;
    private int suit;
    public static boolean aceLow = true;

/**
 * Constructor method for Card. Used to set the rank and suit of the card
 * 
 * @param rank card rank
 * @param suit card suit
 */    
    public Card(int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }
    
/**
 * Compares a playing card to a different playing card by rank
 * 
 * @param x the card being compared to
 * @return an int between -1,1
 */        
    public int compareTo(Card x){
        if(this.rank > x.rank){
            return 1;
        }
        if(this.aceLow == false && (this.rank == 0 || x.rank == 0) ){
            return 1;
        }
        if(this.rank < x.rank){
            return -1;
        }
        return 0;
    }

/**
 * A method used to represent the status of the Ace card. This method sets aceLow to false, allowing Ace a rank of 11
 */
    public void aceHigh(){
      this.aceLow = false;  
    }
    
    public String toString(){
        return String.format("%s of %s", ranks[this.rank], suits[this.suit]);
    }

/**
 * Checks to see if two cards are equal
 * @param x the comparing card
 * @return true or false
 */    
    public boolean equals(Card x){
        return (this.rank == x.rank && this.suit == x.suit);
    }
        
    public String getRank(){
        return String.format("%s", ranks[this.rank]);
    }
    
    public String getSuit(){
        return String.format("%s", suits[this.suit]);
    }
}
