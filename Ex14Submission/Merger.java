import java.util.Arrays;

/**
 * Merges arrays of names
 *
 * @author Hayden Banks
 * @version April 20, 2023
 */
public class Merger extends NameList
{

    public Name[] mergeList;
    
    /**
     * Takes another array of names and merges it with the current
     * 
     * @param that the array to be merged with the current array
     */
    public Merger(Name[] that){
        int length = that.length + this.names.length;
        mergeList = new Name[length];
            int index = 0;
            for(Name name:this.names){
                mergeList[index] = this.names[index];
                index++;
            }
            int indexTwo = index;
            index = 0;
            for(Name name:that){
                mergeList[indexTwo] = that[index];
                indexTwo++;
                index++;
            }
    }
    
    public String toString(){
        return (Arrays.deepToString(mergeList));
    }
    
}
