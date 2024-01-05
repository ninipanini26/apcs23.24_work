public class Person{
    
    public Person(String name, int numberOfPets){
        this.name = name;
        this.numberOfPets = numberOfPets;
    }
    
    public String name() {return name;}
    
    public int numberOfPets() {return numberOfPets;}
    
    
    private String name;
    private int numberOfPets;
}