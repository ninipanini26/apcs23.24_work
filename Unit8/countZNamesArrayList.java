 import java.util.*;

public class countZNamesArrayList{
    
    public static void testZNamesArrayList(ArrayList <String> names, int expected){
        int result = countZNamesArrayList(names);
         System.out.println("expected " +expected+ " result: " + result);
           if (result == expected)
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Boohoo.");
    }public static int countZNamesArrayList(ArrayList <String> names){
          int count = 0;
        for(int i = 0; i < names.size(); i++){
            
            if(names.get(i).substring(0,1).equals("Z") || names.get(i).substring(0,1).equals("z")){
                count+=names.get(i).length(); 
            }
        }return count;
    }     public static void main (String [] args){
    ArrayList <String> names1 = new ArrayList<String>();
    names1.add("Zorro");
    names1.add("zero");
    names1.add("zippy");
    
    testZNamesArrayList (names1, 14);
     }
}