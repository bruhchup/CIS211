/**
 * Program that simulates a list of names from a group of seniors. Could be used in
 * a retirement home facility or nursing home setting. Features a class 'NameList' that
 * generates an array of names and their associated ages. Features a class 'Teams' that organizes
 * a group into teams for games or any team based activity. Features a merger class for merging
 * different arrays of persons. This is the runner method which displays numerous classes/methods
 * in use.
 *
 * @author Hayden Banks
 * @version April 20, 2023
 */
public class Runner
{
    public static void main(){
        NameList list = new NameList();
        System.out.printf("Normal list\n%s\n\n",list);
        list.ageSort();
        System.out.printf("Age sorted list\n%s\n\n",list);
        list.lastNameSort();
        System.out.printf("Last name sorted list\n%s\n\n",list);
        
        Teams teams = new Teams(3);
        teams.sortTeamByAge();
        System.out.printf("List of teams sorted using sortTeamByAge to lessen age disparity\n%s\n\n",teams);
        
        Merger merger = new Merger(list.names);
        System.out.printf("Merged List\n%s\n\n",merger);
        teams.mergerTeams(4, merger.mergeList);
        System.out.printf("Merged List separated into teams using Teams class. Creates 4 teams of 5.\n%s",teams);
        
    }
}
