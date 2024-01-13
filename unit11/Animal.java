public class Animal{
    
    public Animal(String name, int legCount, boolean isFurry){
        this.name = name;
        this.legCount = legCount;
        this.isFurry = isFurry;
    }
    
       public String getName()
    {
        return name;
    }
    
    public int getLegCount(){
        return legCount;
    }
    
    public boolean getIsFurry(){
        return isFurry;
    }
    
    public void hello()
    {
        System.out.println("Hello, my name is " + getName() + " i have " +getLegCount()+ " legs and my furry-ness is " +getIsFurry());;
    }
    
    private String name;
    private int legCount;
    private boolean isFurry;
}