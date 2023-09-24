//vampire boolean 

public class Vampire{
   
    public static void testVampire(boolean awake, double hour, boolean expected){
        boolean result = isVampire (awake, hour);
         System.out.print("awake: " + awake + " hour: " + hour + " expected: " + expected + " result: " + result);
         if (result == expected)
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Boohoo.");
        
    }
    
    public static boolean isVampire (boolean awake, double hour){
        
        //return true if vampire is awake during hours or vampire is asleep during hours
        return(awake && (hour < 6 || hour > 22)) || (!awake && (hour >= 6 && hour <= 22));
        
    }
      public static void main (String [] args)
    {
          testVampire(true, 6.5, false);
          testVampire(false, 6.5, true);
      }
}