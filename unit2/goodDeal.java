public class goodDeal{
   
    //test function 
    public static void testgoodDeal (double originalPrice, double salePrice, boolean expected){
        
        boolean result = goodDeal (originalPrice, salePrice);
        System.out.print("og price: " +originalPrice+ "sale price: " +salePrice+ "expected: " +expected+ "result: " +result);
        
         if (result == expected)
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Boohoo.");
    }
    
    public static boolean goodDeal (double originalPrice, double salePrice){
        
        double discount = 0.75 * originalPrice; //float for discount
        return salePrice < discount; //sale price should be less than discount price
        
        
    }
    public static void main(String[] args) {
        testgoodDeal(100.0, 70.0, true); //should print true
        testgoodDeal(50.0, 40.0, false); //should print false
    }
    
}