import java.util.*;

public class AnimalCalc{
       private static ArrayList<Animal> animals; 
    public static void print(ArrayList <Animal> animals){
        for(Animal a: animals){
           System.out.println(a.getName() + " " + a.getLegCount() + " " + a.getIsFurry());
        
        }
    }
    
    public static int average(ArrayList <Animal> animals){
        int sum = 0;
        for(Animal a: animals){
            sum+=a.getLegCount();
        }System.out.println(sum/animals.size());
        return sum/animals.size();
    }
    
    public static String fewest(ArrayList <Animal> animals){
        Animal fewestLegs = animals.get(0);
        
        for (Animal a : animals) {
            if (a.getLegCount() < fewestLegs.getLegCount()) {
               fewestLegs = a;
            }
    } 
    System.out.println(fewestLegs.getName());
    return fewestLegs.getName();
        
    
    
}
    
    public static void main(String[] args)
    {
    Dog coco = new Dog ("coco", 4, true);
    Flamingo pepper = new Flamingo("pepper", 2, false);
    Goldfish goldie = new Goldfish("goldie", 0, false);
    Cat kitty = new Cat("kitty", 4, true);
        
    animals = new ArrayList<Animal>(); 
    animals.add(coco);
    animals.add(pepper);
    animals.add(goldie);
    animals.add(kitty);
    
    print(animals);
    average(animals);
    fewest(animals);
    }
    
} 