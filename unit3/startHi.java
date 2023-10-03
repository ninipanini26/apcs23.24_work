public class startHi{
    
    //test function
    
    public static void teststartHi(String str, boolean expected){
        
        boolean result = startHi(str);
        
        System.out.print(" string: " +str+ " expected: " +expected+ " result: " + result);
        
         
         if (result == expected)
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Boohoo.");
    }
    
    public static boolean startHi(String str){
        
        if(str.length()<2){
            return false;
        }
        
        String a = str.substring(0,2);
        return(a.equals("hi"));
        
    }
    
    public static void main (String [] args){
        teststartHi ("hi nina!", true);
        teststartHi("H", false);
        teststartHi("Hi!", true);
        teststartHi("hi dr kessner!", true);
    }
}