
public class Time{
    public static void main(String[]args) {
        //Declares the variables for time
        int hour = 22;
        int minute = 30;
        //Number of seconds since midnight
        int second = (hour * 60 + minute)*60;
        
        //Prints the current time of day
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");
        
        //Prints the number of seconds since midnight
        System.out.print("Number of seconds since midnight: ");
        System.out.println(second);
        
        //Prints the number of seconds remaining in the day
        System.out.print("Number of seconds remaining in the day: ");
        System.out.println(86400 - second);
        
        //Declares a float variable to represent percentage of the day passed
        double passedFloat = ((second / 86400.0) * 100.0 + 0.5);
        //Integer value created to round passedFloat to a whole number
        int passed = (int) passedFloat;
        System.out.print("Percentage of the day passed: ");
        System.out.print(passed);
        System.out.println("%");
        
        //Redeclares variables to adjust to the finishing time
        hour = 23;
        minute = 15;
        //2nd Second variable created to compute total seconds passed since beginning
        int second2 = (hour * 60 + minute)*60;
        
        //Prints the current time of day.
        System.out.print("The current time after finishing is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");
        
        System.out.print("Seconds elapsed since starting the exercise: ");
        System.out.print(second2 - second);
        
    }
}
