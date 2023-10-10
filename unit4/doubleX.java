public class doubleX{
    
    //test function
    public static void testDoubleX(String str, boolean expected){
        
        boolean result = doubleX(str);
        
         System.out.print("string: " + str + " expected: " + expected + " result: " + result);

        if (result == expected)
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Boohoo.");
    }
    public static boolean doubleX(String str){
        int i = str.indexOf("x");
        if (i == -1)
            return false; //there is no x at all
        if(i + 1>= str.length())
            return false;
        
        return str.substring(i+1, i+2).equals("x");
    }
    
    public static void main (String args[]){
        testDoubleX ("axxbb", true);
        testDoubleX ("xaxxx", false);
        testDoubleX ("xx", true);
        testDoubleX ("xax", false);
    }
}