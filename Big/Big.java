import java.math.BigInteger;

public class Big
{
    //main method calls factTable method
    public static void main(){
        factTable(30);  
    }
    
    //method for generating the factorial of a number
    private static BigInteger factorial(int n){
        //takes the parameter argument and converts to BigInteger
        BigInteger param = BigInteger.valueOf(n);
        //if the parameter is equal to 0, return 1. Factorial of 0 is 1.
        if (n==0){
            return BigInteger.valueOf(1);
        }
        BigInteger numberDown = (factorial(n - 1));
        BigInteger result = param.multiply(numberDown);
        return result;
    }
    
    //method prints a factorial table with the number given in the parameter
    private static void factTable(int n){
         for (int s = 0;s <= n; s++){
            System.out.printf("%2d %d\n",s, (factorial(s)));
        }
    }
}