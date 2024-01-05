import java.util.*;

public class itemsCalculator{
    
   private static ArrayList<itemsClass> items; 
    
    //function that prints the items in the array list
    public static void print(ArrayList<itemsClass> items)
    {
        for(itemsClass a: items)
            System.out.println(a.name() + " " + a.price());
    }
    
    public static double average(ArrayList<itemsClass> items)
    {
        double sum = 0;
        for(itemsClass a: items){
            sum+=a.price();
        }return sum/items.size();
    }
    
                
     public static void testAverage(double expected){
          double result = average(items);
         System.out.println("expected: " +expected+ " result: " + result);
           if (Math.abs(result - expected) < 0.01)
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Boohoo.");
    }
    
public static String priceTester(ArrayList<itemsClass> items){
      
 itemsClass mostExpensive = items.get(0);

        for (itemsClass item : items) {
            if (item.price() > mostExpensive.price()) {
                mostExpensive = item;
            }
        }    
    System.out.println(mostExpensive.name());  
    return mostExpensive.name();
    
}
    
public static void testPrice(String expected){
    String result =   priceTester(items);
    if(result.equals(expected))
        System.out.println("YAYYY");
    else 
        System.out.println("boohoo.");
    
}

    
    public static void main(String[] args)
    {
        itemsClass hairbrush = new itemsClass("hairbrush", 10.0);
        itemsClass bracelet = new itemsClass("bracelet", 7.0);
        itemsClass milk = new itemsClass("milk", 4.50);
    
         items = new ArrayList<itemsClass>(); 
        
        items.add(hairbrush);
        items.add(bracelet);
        items.add(milk);
        
        print(items);
        testAverage(7.166);
        testPrice("hairbrush");

    }
    

    
}
    
