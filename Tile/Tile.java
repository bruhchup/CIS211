
/**
 * Creates a Scrabble tile object. Also includes other accompanying methods.
 *
 * @author Hayden Banks
 */
public class Tile{
    
    private char letter;
    private int value;
    
    public Tile(){
        this.letter = 'a';
        this.value = 0;
    }
        
    //Tile can accept any letter and integer value
    public Tile(char letter, int value){
        this.letter = letter;
        this.value = value;
    }
    
    //sets the letter of the Scrabble character. Used in main method.
    public void setLetter(char letter){    
        this.letter = letter;
    }
    
    //returns the assigned Scrabble character
    public char getLetter(){
        return this.letter;
    }
    
    //sets the integer value of the Scrabble character. Used in main method.
    public void setValue(int value){
        this.value = value;
    }
    
    public int getValue(){
        return this.value;
    }
    
    //Returns a string that presents the value of the tile.
    public String printTile(){
        return String.format("letter: %c\nnumber: %d", letter, value);    
    }
}
