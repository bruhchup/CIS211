import java.util.Arrays;
import java.util.Random;

/**
 * Class for organizing names and ages into arrays. Various methods for sorting names in different ways.
 * 
 * @author Hayden Banks
 * @version April 20, 2023
 */
public class NameList
{

    public Name[] names = new Name[10];
    private Random random = new Random();
    
    /**
     * Constructor method for NameList that determines array length and assigns names to the array
     */
    public NameList(){
        for(int i = 0; i < 10; i++){
            this.names[i] = new Name("NA", "NA", 0);
            this.names[i].random();
        }
    }
    
    /**
     * Method for sorting persons by age
     */
    public void ageSort(){
        for(int index = 0; index <= 9; index++){
            for(int i = 0 + index; i <= 9; i++){
                if(this.names[i].getAge() < this.names[index].getAge()){
                    Name tempIndex = this.names[index];
                    this.names[index] = this.names[i];
                    this.names[i] = tempIndex;
                }
            }
        }
    }
    
    /**
     * Method for sorting persons by last name
     */
    public void lastNameSort(){
        for(int index = 0; index <= 9; index++){
            for(int i = 0 + index; i <= 9; i++){
                String name1 = this.names[index].getLast();
                String name2 = this.names[i].getLast();
                int diff = name2.compareTo(name1);
                if(diff < 0){
                    Name tempIndex = this.names[index];
                    this.names[index] = this.names[i];
                    this.names[i] = tempIndex;
                }
            }
        }
    }
    
    /**
     * Method for sorting persons by first name
     */
    public void firstNameSort(){
        for(int index = 0; index <= 9; index++){
            for(int i = 0 + index; i <= 9; i++){
                String name1 = this.names[index].getFirst();
                String name2 = this.names[i].getFirst();
                int diff = name2.compareTo(name1);
                if(diff < 0){
                    Name tempIndex = this.names[index];
                    this.names[index] = this.names[i];
                    this.names[i] = tempIndex;
                }
            }
        }
    }
     
    /**
     * Method for shuffling names
     */
    public void shuffleNames(){
        int index = 0;
        for (Name name : names){
            int randIndex = random.nextInt(10);
            Name y = this.names[randIndex];
            this.names[randIndex] = this.names[index];
            this.names[index] = y;
            index++;
        }
    }
    
    public String toString(){
        return Arrays.deepToString(this.names);
    }
}

