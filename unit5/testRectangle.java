public class testRectangle{
    
    public static void testRectangleArea(Rectangle r, double expected){
        
        double result = r.area();
        
        System.out.println("rectangle width: " + r.getWidth() + "rectangle height: " + r.getHeight() + "result area: " + result + "expected: " + expected);
        
         if (Math.abs(result - expected) < .001) // do fuzzy comparison
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Bummer");
    }
    
    public static void testRectanglePerimeter(Rectangle r, double expected){
        
        double result = r.perimeter();
        
        System.out.println("rectangle width: " + r.getWidth() + "rectangle height: " +  r.getHeight() + "result perimeter: " + result + "expected: " + expected);
        
         if (Math.abs(result - expected) < .001) // do fuzzy comparison
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Bummer");
    }
    
        
    public static void testDiagonal(Rectangle r, double expected){
        
        double result = r.diagonal();
        
        System.out.println("rectangle width: " + r.getWidth() + "rectangle height: " + r.getHeight() + "result diagonal: " + result + "expected: " + expected);
        
         if (Math.abs(result - expected) < .001) // do fuzzy comparison
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Bummer");
    }
    
    public static void main (String args[]){
        Rectangle r1 = new Rectangle (3, 4);
        
        testRectangleArea(r1, 12.0);
        testRectanglePerimeter(r1, 14.0);
        testDiagonal(r1, 5.0);
    }
}