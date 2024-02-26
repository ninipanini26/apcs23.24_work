import java.util.*;

public class ShapeCollection{
    private static ArrayList<Shape> shapes;
    public ShapeCollection(){
        shapes = new ArrayList<Shape>();
    }
    public void addShape(String name, int numberOfSides){
        Shape shape = new Shape(name, numberOfSides);
        shapes.add(shape);
    }
    
    public int numberOfSides(String name){
        for(Shape shape: shapes){
            if(shape.getName().equals(name)){  //if the shape we are getting matches a name of an existing shape
                return shape.getNumberOfSides();
            }
    } return -1; //no shape found
    }
    
    public double averageNumberOfSides() {
        if (shapes.size() == 0) {
            return -1; // Return -1 if no shapes in collection
        }

        int totalSides = 0;
        for (Shape shape : shapes) {
            totalSides += shape.getNumberOfSides();
        }

        return (double) totalSides / shapes.size();
    }
    

    public ArrayList<String> evenSides() {
    ArrayList<String> evenSidedShapes = new ArrayList<>();
    for (Shape shape : shapes) {
        if (shape.getNumberOfSides() % 2 == 0) {
            evenSidedShapes.add(shape.getName()); //so i dont get that weird error and instead i jsut get the shape name
        }
    }
    return evenSidedShapes;
}
    
    
    public static void main(String[] args){
        ShapeCollection shapes = new ShapeCollection();
        shapes.addShape("rectangle", 4);
        shapes.addShape("circle", 0);
        shapes.addShape("triangle", 3);
        
  System.out.println("Number of sides of rectangle: " + shapes.numberOfSides("rectangle"));
 System.out.println("Number of sides of square: " + shapes.numberOfSides("square"));
System.out.println("Average number of sides: " + shapes.averageNumberOfSides());
System.out.println("Shapes with even:" + shapes.evenSides());
    }
}