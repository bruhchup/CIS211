
//imports Scanner to allow user to input seconds
import java.util.Scanner;

public class SecondConverter
{
    public static void main(){
        while (true){
            //variable for total seconds
            int time;
            Scanner in = new Scanner(System.in);

            System.out.println("Enter number of seconds to convert to hours, minutes, and seconds");
            time = in.nextInt();
            //variables and equations to obtain appropriate time values
            int hours = time / 3600;
            int minutes = (time % 3600) / 60;
            int seconds = (time % 3600) % 60;

            //prints seconds when converted to hours,minutes,seconds
            System.out.printf("%d:%d:%d\n", hours, minutes, seconds);

            //new Scanner for another input variable
            Scanner repeat = new Scanner(System.in);

            //loop that asks if user wants to perform another conversion
            while (true){
                System.out.println("Perform another conversion? y/n");
                String choose = repeat.nextLine();
                if(choose.equals("y")){
                    break;
                }else if(choose.equals("n")){
                    System.exit(0);
                }else{
                    System.out.println("invalid input");
                    continue;
                }
            }
            continue;
        }
    }
}