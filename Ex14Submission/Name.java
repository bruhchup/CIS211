import java.util.Random;

/**
 * Base class for Names. generates a first name, last name, and age between 65 and 105
 * 
 * @author Hayden Banks
 * @version April 20, 2023
 */

public class Name
{

    private static String[] firstNames = {"Carol", "Oliver", "Noah", "Thomas", "Austin", "James", "Sarah", "Lucy", "Sam", "Frodo"};
    private static String[] lastNames = {"Banks", "Smith", "Graham", "West", "Baggins","Lee","Wayne","Ng","Bellion","Morris"};

    private static Random random = new Random();

    private String first;
    private String last;
    private int age;

    /**
     * Constructor method
     * @param first first name
     * @param last last name
     * @param age
     */
    public Name(String first, String last, int age){
        this.first = first;
        this.last = last;
        this.age = age;
    }
    
    /**
     * Creates random name with random age
     */
    public void random(){
        this.first = this.firstNames[random.nextInt(this.firstNames.length)];
        this.last = this.lastNames[random.nextInt(this.lastNames.length)];
        this.age = random.nextInt(106);
        while(age < 65){
            this.age = random.nextInt(106);
        }
    }
    
    public String getFullName(){
        return this.first + this.last; 
    }

    public String getFirst(){
        return this.first;
    }
    
    public String getLast(){
        return this.last;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setFirst(String first){
        this.first = first;
    }
    
    public void setLast(String last){
        this.last = last;   
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public boolean equals(Name that){
        if(this.age == that.age){
            return true;
        }
        return false;
    }
    
    public String toString(){
        return String.format("(%s %s, %d)", this.first, this.last, this.age);
    }
}
