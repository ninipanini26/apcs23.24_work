public class Person
{ 
    public Person (String nameIn, int numberOfPetsIn){
        name = nameIn;
        numberOfPets = numberOfPetsIn;
    }public void hello(){
        System.out.println(" Hello my name is " + name + " and I have " + numberOfPets + " pets.");
    }
    
    private String name;
    
    private int numberOfPets;
}