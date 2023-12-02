
/**
 * Class for creating a fraction, includes methods for viewing data and performing certain operations.
 *
 * @author Hayden Banks
 * @version March 23, 2023
 */
public class Fraction
{
    private int numerator;
    private int denominator;

    /**
     * Constructor for instance variables
     */
    public Fraction(int x,int y){
        numerator = x;
        denominator = y;
    }

    
    /**
     * Returns the numerator of the fraction
     * @return numerator
     */
    public int getNumerator(){
        return this.numerator;
    }
    
    /**
     * Returns the denominator of the fraction
     * @return denominator
     */
    public int getDenominator(){
        return this.denominator;
    }
    
    /**
     * Returns the fraction in decimal form
     * @return decimal number
     */
    public double getDecimal(){ 
        double x = this.numerator;
        double y = this.denominator; 
        return x/y;
    }
    
    /**
     * Returns the multiplication of two fractions
     * @param x numerator of multiplying fraction
     * @param y denominator of mulitplying fraction
     * @return String of multiplied fractions
     */
    public String multFrac(int x, int y){
        int numerator = this.numerator * x;
        int denominator = this.denominator * y;
        
        return String.format("%d/%d",numerator, denominator);
    }
}
