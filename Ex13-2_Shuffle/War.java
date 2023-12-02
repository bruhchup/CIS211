/**
 * Compares cards by the rules of War
 *
 * @author Hayden Banks
 * @version April 14, 2023
 */
public class War extends Deck
{
    
/**
 * Method that uses compareTo method to compare two specified cards
 * 
 * @param i specifies the place of the card in the deck
 * @return an int between -1,1
 */    
    public int playWar(int i){
        return this.cards[i].compareTo(this.cards[i + 1]);
    }
    
/**
 * Compares two cards, but Ace has a rank of 1
 * 
 * @param i specifies which card is used for comparison in the deck
 * @return a string that states if the card of choice is greater than the card being compared to
 */
    public String warLow(int i){
            int point = playWar(i);
            if (point == 1){
                return String.format("%s is greater than %s", this.cards[i], this.cards[i + 1]);           
            }if (point == -1){
                return String.format("%s is less than %s", this.cards[i], this.cards[i + 1]);
            }else
                return String.format("%s is equal to %s", this.cards[i], this.cards[i + 1]);
    }

/**
 * Compares two cards, but Ace has a rank of 11
 * 
 * @param i specifies which card is used for comparison in the deck
 * @return a string that states if the card of choice is greater than the card being compared to
 */
    public String warHigh(int i){
        this.cards[i].aceHigh();
        if(this.cards[i].aceLow = false){
            if (this.cards[i].equals("Ace")){
                return String.format("%s is greater than %s", this.cards[i], this.cards[i + 1]);
            }if (this.cards[i + 1].equals("Ace")){
                return String.format("%s is less than %s", this.cards[i], this.cards[i + 1]);
            }
        }  
        return warLow(i);
    }

/**
 * Generates 20 pairs of randomized cards and compares them with Ace Low in consideration. Then, compares another 20 pairs, with Ace High in consideration
 */    
    public void playGame(){
        randomize();
        System.out.printf("\nAce is Low!\n\n");
        for (int i = 0; i < 40; i += 2){
            System.out.println(warLow(i));
        }
        System.out.printf("\nAce is High!\n\n");
        randomize();
        for (int i = 0; i < 40; i += 2){
            System.out.println(warHigh(i));
        }
    }
    
}
