import java.util.*;

public class findMax
{
    
        
    public static void testFindMax(double [] values, double expected){
          double result = findMax (values);
         System.out.println("expected: " +expected+ " result: " + result);
           if (Math.abs(result - expected) < 1e-6)
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Boohoo.");
    }
    
    public static double findMax(double[] values){
        
        double biggest = values[0];
        
        for (double bob : values){
            if(bob>biggest)
                biggest = bob;
        }return biggest;
        
    }
    
    public static void main (String [] args){
        double[] values = {10.1 , 20.1, 50.1, 5.3, 70.1};
        
        double biggest = findMax(values);
        System.out.println("biggest: " + biggest);
        testFindMax(values, 70.1);
    }
}