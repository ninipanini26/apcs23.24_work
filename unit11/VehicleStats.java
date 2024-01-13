import java.util.*;

public class VehicleStats{
  
     private static ArrayList <Vehicle> vehicles;
    
    public static int wheelCountTest(ArrayList<Vehicle> vehicle){
        int sum = 0;
        for(Vehicle v: vehicles){
            sum+=v.wheelCount();
        } 
        System.out.println("total wheel count: " + sum);
        return (sum);
    }
    
    public static ArrayList<Vehicle> humanPoweredVehicles(ArrayList <Vehicle> vehicle){
          ArrayList<Vehicle> human = new ArrayList<Vehicle>();
           for(Vehicle v: vehicles){
               if(v.isHumanPowered() == true){
                   human.add(v);
               }
            
           } System.out.println(human);
        return human;
        
    }

    
     public static void main(String[] args)
    {
         
    vehicles = new ArrayList<Vehicle>();
    Car c1 = new Car ("vroom vroom", 4, false);
    vehicles.add(c1);
    
    Motorcycle m1 = new Motorcycle("motooo", 2, false);
    vehicles.add(m1);
    
    Bicycle b1 = new Bicycle("bibi", 2, true);
    vehicles.add(b1);
    
    vehicles.add(new Unicycle("uni", 1, true));
         
         wheelCountTest(vehicles);
         humanPoweredVehicles(vehicles);
     }
    
    
}