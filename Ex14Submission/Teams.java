import java.util.Arrays;

/**
 * Organizes list of names into n number of teams
 * 
 * @author Hayden Banks
 * @version April 19, 2023
 */
public class Teams extends NameList{

    private int teamAmount;
    private int teamLength;
    public Name[][] teams;
    public Name[] origList;
 
    /**
     * Constructor method for teams. decides amount of teams and  
     * 
     * @param n number of teams desired from list
     */
    public Teams(int n){
        this.teamAmount = n;
        this.teamLength = this.names.length / n;
        this.teams = new Name[this.teamAmount][this.teamLength];
        this.origList = this.names;
        sortTeams();
    }
    
    /**
     * Method compatible with Merger class. Allows a merged name list
     * to be passed to the Teams class to create teams.
     * 
     * @param n represents n number of teams
     * @param that represents the merged list of names from the Merger class.
     */
    public Name[][] mergerTeams(int n,Name[] that){
        ageSort();
        this.teamAmount = n;
        this.teamLength = that.length / n;
        this.teams = new Name[this.teamAmount][this.teamLength];
        this.origList = this.names;
        int index = 0;
        for(int i = 0; i < this.teamAmount; i++){
            for (int j = 0; j < this.teamLength; j++){
                this.teams[i][j] = that[index];
                index++;
            }
        }
        ageSort();
        return this.teams;
    }
    
    /**
     * Standard method for sorting teams
     */
    public void sortTeams(){
        int index = 0;
        for(int i = 0; i < this.teamAmount; i++){
            for (int j = 0; j < this.teamLength; j++){
                this.teams[i][j] = this.names[index];
                index++;
            }
        }
    }
    
    
    /**
     * A method for sorting n number of teams by age. Imperfect, but helps in
     * preventing age disparities
     */
    public void sortTeamByAge(){
        ageSort();
        for (int i = 0; i < this.teamAmount; i++){
            int index = 0;
            for (int j = 0; j < this.teamLength; j++){
               if (index + i > this.names.length){
                   break;
               }
               this.teams[i][j] = this.names[index + i];
               index += this.teamLength;
            }
        }
    }
    
    /**
     * Sorts teams alphabetically by first name
     */
    public void sortTeamByFirst(){
        firstNameSort();
        sortTeams();
    }
    
    /**
     * Sorts teams alphabetically by last name
     */
    public void sortTeamByLast(){
        lastNameSort();
        sortTeams();
    }
    
    public String toString(){
        return Arrays.deepToString(this.teams);
    }
}
