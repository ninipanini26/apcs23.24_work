    import java.util.*;

public class countLuckyArrayList{
    
    
    public static void testCountLuckyArrayList(ArrayList<Integer> nums, int expected){
          int result = countLuckyArrayList (nums);
         System.out.println("expected " +expected+ " result: " + result);
           if (result == expected)
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Boohoo.");
    }
    
    public static int countLuckyArrayList(ArrayList <Integer> nums){
        int count = 0;
        for (int i = 0; i < nums.size(); i++){
            int lastDigit = nums.get(i) % 10;
            if(nums.get(i)% 7 == 0){
                count ++;
            }else if(lastDigit == 7){
                count++;
            }
        } return count;
    }
    
    public static void main (String [] args){
     
        ArrayList <Integer> nums1 = new ArrayList<Integer>();
        nums1.add(7);
        nums1.add(13);
        nums1.add(17);
        ArrayList <Integer> nums2 = new ArrayList<Integer> ();
        nums2.add(0);
        nums2.add(7);
        nums2.add(207);
        testCountLuckyArrayList(nums1, 2);
        testCountLuckyArrayList(nums2, 3);
        
    }
}