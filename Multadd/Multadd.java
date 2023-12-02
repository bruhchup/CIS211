public class Multadd{
   
        //method for multiplying two values and then adding a third value
        private static double multadd(double a,double b,double c){           
            return a*b+c;
    }  
    
        //main method to produce method results after variable input
        public static void main(){
        
        double answer = multadd(1.0,2.0,3.0);
        System.out.println("1 * 2 + 3:\n" + answer + "\n");
        
        //multiplying cos pi/4 by 0.5 divides it by 2. adds sin pi/4
        double a = 0.5;
        double b = Math.cos(Math.PI/4);
        double c = Math.sin(Math.PI/4);
        
        answer = multadd(a,b,c);
        System.out.println("sin pi/4 + cos(pi/4) / 2:\n" + answer + "\n");
        
        //multiplies 1.0 by log10 base 10 to yield log10 base 10. Multiplies by log20 base 20
        a = 1.0;
        b = Math.log10(10.0);
        c = Math.log10(20.0);
        
        answer = multadd(a,b,c);
        System.out.println("log10 + log20:\n" + answer +"\n");
        
        //Argument given to method is the x value of the equation
        answer = expSum(10.0);
        System.out.println("expSum with an x value of 10:\n" + answer);
    }
    
        //Method to calculate xe^-x + sqrt(1-e^(-x))
        private static double expSum(double a){
          
        double b = Math.exp(-(a));
        double c = Math.sqrt(1-b);
    
        return multadd(a,b,c);
    }
}
