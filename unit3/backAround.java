public class backAround{
    
    //test function
    
    public static void testbackAround (String str, String expected){
      
        String result = backAround(str);
        
         System.out.print(" string: " +str+ " expected: " +expected+ " result: " + result);
        
         
         if (result.equals(expected))
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Boohoo.");
    } 
    
    public static String backAround(String str){
        
        String a = str.substring(str.length()-1, str.length());
        return a + str + a;
        
    }public static void main (String [] args){
        
        testbackAround("cat", "tcatt");
        testbackAround("nina", "aninaa");
    }
}