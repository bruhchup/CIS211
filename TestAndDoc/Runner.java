
/**
 * Runner class that uses Fraction class
 *
 * @author Hayden Banks
 * @version March 23, 2023
 */
public class Runner
{
    /**
     * Main method that creates two fractions, displays their values, tests whether the fractions are equal to each other, and then prints out the product of the two fractions
     */
    public static void main(){
        
        //declares and assigns parameter values to new fraction objects
        Fraction frac = new Fraction(1,2);
        Fraction frac2 = new Fraction(3,4);                 
        
        //converts the fractions to a string
        System.out.printf("Fraction 1 = %d/%d\nFraction 2 = %d/%d\n", frac.getNumerator(), frac.getDenominator(), frac2.getNumerator(), frac2.getDenominator());
        
        //converts the fractions to decimal form
        System.out.printf("Fraction 1 in decimal form is: %f\nFraction 2 in decimal form is: %f\n",frac.getDecimal(), frac2.getDecimal());
        
        //uses isEqual method to evaluate the two fractions
        if(isEqual(frac.getDecimal(), frac2.getDecimal())){
            System.out.printf("The fractions, %d/%d and %d/%d are equal\n", frac.getNumerator(),frac.getDenominator(), frac2.getNumerator(),frac2.getDenominator());
        }else{
            System.out.printf("The fractions, %d/%d and %d/%d are not equal\n", frac.getNumerator(),frac.getDenominator(), frac2.getNumerator(),frac2.getDenominator());
        }
        
        //prints the product of the two fractions
        System.out.printf("%d/%d * %d/%d = %s",frac.getNumerator(),frac.getDenominator(), frac2.getNumerator(),frac2.getDenominator(),frac.multFrac(frac2.getNumerator(),frac2.getDenominator()));      
    }
    
    /**
     * Method for testing whether two values are equal
     * @param x any number
     * @param y any number
     */
    public static boolean isEqual(double x, double y){
        if(x == y){
            return true;
        }else{
            return false;
        }
    }
    
    
}
