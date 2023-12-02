
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Doubloons{

    public static void main(){

    //List of names
      runATest("Otto");
      runATest("Maria");
      runATest("Mario");
      runATest("Anna");
      runATest("Hayden");
      runATest("Billy");
      runATest("Jojo");
      runATest("Emmett");
      runATest("aa");
    }
    //Loop for evaluating the strings using isDoubloon method
    public static void runATest(String names){

        String lowerNames = names.toLowerCase();
        boolean evalWord = isDoubloon(lowerNames);
        if (isDoubloon(lowerNames)){
            System.out.printf("%s is a doubloon!\n", names);
        }
        else {
            System.out.printf("%s is not a doubloon!\n", names);
        }
    }

    //Method for evaluating strings to detect doubloons
    private static boolean isDoubloon(String str){

        int wordLength = str.length();
        char currentChar = str.charAt(0);

        str.toLowerCase();

        //variable used to count how many letters are matched
        int match = 0;

        //loop to check for matching letters
        if (wordLength > 1){
            for (int i = 0; i < wordLength; i++) {
                for (int check = i + 1; check < wordLength; check++) {
                    if (  str.charAt(i) == str.charAt(check) ){
                        match++;
                    }
                }
            }
        }

        //if value is half the word length, it is a doubloon
        int doubloonTrue = wordLength / 2;

        if (match == doubloonTrue){
            return true;
        }
        else{
            return false;
        }
    }
}    
