 import java.util.*;

public class sumOfSquaresArrayList{
    
    public static void testSumOfSquaresArrayList(ArrayList<Integer> nums, int expected){
          int result = sumOfSquaresArrayList(nums);
         System.out.println("expected " +expected+ " result: " + result);
        
         if (result == expected)
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Boohoo.");
    }
    
     public static int sumOfSquaresArrayList(ArrayList <Integer> nums){
           int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum+=nums.get(i) * nums.get(i);
        }
            return sum;
     }
    
     public static void main (String [] args){
    ArrayList <Integer> nums1 = new ArrayList<Integer>();
    nums1.add(0);
    nums1.add(1);
    nums1.add(2);
    
    testSumOfSquaresArrayList (nums1, 5);
     }
}