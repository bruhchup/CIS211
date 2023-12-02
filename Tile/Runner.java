
/**
 * Runs the Tile class. Presents data for a Scrabble tile.
 *
 * @author Hayden Banks
 */
public class Runner{
    
    //initializes new Tile. Assigns the character and integer values. Returns the tile data.
    public static void main(){
    Tile scrabble = new Tile();
    
    scrabble.setLetter('Z');
    scrabble.setValue(10);
    
    System.out.println(scrabble.printTile());
    }
    
}
