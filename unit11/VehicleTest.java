import java.util.*;

public class VehicleTest
{
   
public static void main(String[] args)
{
    ArrayList<Vehicle> vehicles = new ArrayList <Vehicle>();
    
    Car c1 = new Car ("vroom vroom", 4, false);
    vehicles.add(c1);
    
    Motorcycle m1 = new Motorcycle("motooo", 2, false);
    vehicles.add(m1);
    
    Bicycle b1 = new Bicycle("bibi", 2, true);
    vehicles.add(b1);
    
    vehicles.add(new Unicycle("uni", 1, true));
    
 for(Vehicle v: vehicles){
     System.out.println(v.name());
     System.out.println(v.wheelCount());
     System.out.println(v.isHumanPowered());
 }
    
}
    
}