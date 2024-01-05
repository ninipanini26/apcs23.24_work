import java.util.*;

public class testPerson{
    
     private static ArrayList<Person> people; 
    
    public static double averagePets(ArrayList <Person> people){
        double sum = 0;
        for(Person a: people){
            sum+=a.numberOfPets();
        }return sum/people.size();
    }
    
    public static void testAverage(double expected){
        double result = averagePets(people);
           if (Math.abs(result - expected) < 0.01)
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Boohoo.");
    }
    
    public static String most(ArrayList <Person> people){
        Person biggest = people.get(0);
        for(Person a: people){
            if(a.numberOfPets() > biggest.numberOfPets()){
                a = biggest;
            }
        } 
        System.out.println(biggest.name());
        return biggest.name();
        
    }

    public static ArrayList <String> atLeast(ArrayList<Person> people){
        ArrayList <String> peopleWith2 = new ArrayList <String>();
        for(Person a: people){
            if(a.numberOfPets() >= 2){
                peopleWith2.add(a.name());
            }
        
        } System.out.println(peopleWith2);
        return peopleWith2;
    }
    
    
    
    public static void main(String[] args){
        
        people = new ArrayList<Person>();
        
        
        Person Bob = new Person("Bob", 4);
        Person Charlie = new Person("Charlie", 2);
        Person Samantha = new Person("Samantha", 0);
        
        people.add(Bob);
        people.add(Charlie);
        people.add(Samantha);
        
        testAverage(2);
        most(people);
        
        atLeast(people);
        
        
    }
}