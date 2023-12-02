
import java.util.Scanner;
import java.util.Random;

public class GuessNum{
    public static void main(){

        while(true){

            //creates variable for a random integer
            Random rand = new Random();
            int numRand = rand.nextInt(100);

            System.out.println("Guess a number between 1 and 100\nYou have 3 attempts!");

            //creates variable for number of guesses made
            int attempt = 0;

            while(true){

                //if the number of guesses made is greater than 2. User loses
                if (attempt > 2){
                    System.out.printf("You lost! The number was %d.", numRand);
                    break;
                }

                //creates variable for user guess input
                Scanner guess = new Scanner(System.in);
                int numGuess = guess.nextInt();
                
                //variable for how many numbers off the guess is
                int numAway = Math.abs(numRand - numGuess);

                //loop for conditions of guess (correct, too high, too low)
                while(true){

                    if (numGuess == numRand){
                        System.out.printf("You win!\nThe number was %d.", numRand);
                        System.exit(0);
                    }else if(numGuess > numRand){
                        //Prevents grammatical error
                        if(attempt < 2){
                            System.out.println("You are wrong! Guess lower.");
                        }
                        attempt++;
                        break;
                    }else if(numGuess < numRand){
                        if(attempt < 2){
                            System.out.println("You are wrong! Guess higher.");
                        }
                        attempt++;
                        break;
                    }

                }
            }
            continue;
        }

    }
}