public class ParrotTrouble{
    
    //test for ParrotTrouble
    public static void testParrotTrouble(boolean talking, int hour,  boolean expected){
        
        boolean result = parrotTrouble(talking, hour);
        System.out.print("talking: " + talking + " hour:" + hour + " expected: " + expected + " result: " + result);
          if (result == expected)
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Boohoo.");
    }
    
    public static boolean parrotTrouble(boolean talking, int hour){
         return (talking) && (hour < 7 || hour > 20);
    }    
    
    public static void main (String [] args)
    {
        
        testParrotTrouble (true, 9, false); //parrot is talking hour is after 7 expected false
        testParrotTrouble (false, 21, false); //parrot isnt talking hour is after 20 expected false
        testParrotTrouble (true, 6, true); //parrot is talking hour is before 7 expected true
        testParrotTrouble (true, 22, true); //parrot is talking hour is after 20 expected true 
        
    }
    
}