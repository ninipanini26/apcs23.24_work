public class testRectangle{
    
    public static double averagePerimeter(Rectangle[][] rectangles){
        double average = 0;
        for(Rectangle[] r: rectangles){
            for(Rectangle r2: r){
                average+=r2.getPerimeter();
            }
        }return average/rectangles.length;    
    } 
    
    public static Rectangle greatestArea(Rectangle[][] rectangles){
        double greatest = rectangles[0][0].getArea();
        Rectangle rectangle = rectangles[0][0];
        for(Rectangle [] r1: rectangles){
            for(Rectangle r2: r1){
                if(r2.getArea() > greatest){
                    greatest = r2.getArea();
                    rectangle = r2;
                }
            }
        }
        
        return rectangle;
    }
    
 public static void main(String[] args){
        
        Rectangle[][] rectangles = new Rectangle[][] {{new Rectangle(10, 10, "hi")}, {new Rectangle(20, 10, "bye")}};
       System.out.println(averagePerimeter(rectangles));
        System.out.println(greatestArea(rectangles).getName());
 
 }
     
}

