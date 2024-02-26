//shape class

public class Shape{

    //constructor 
    public Shape (String name, int numberOfSides){
        this.name = name;
        this.numberOfSides = numberOfSides;
    }
    
    //public accesor functions 
    public String getName(){return name;}
    public int getNumberOfSides(){return numberOfSides;}
    
    private String name;
    private int numberOfSides;
}