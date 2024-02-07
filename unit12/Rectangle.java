public class Rectangle{
    private String name;
    private double width;
    private double height;

    public Rectangle(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }
    
    public String getName(){
        return name;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}