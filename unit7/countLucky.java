public class countLucky{
    public static void testCountLucky(int[] nums, int expected){
        int result = countLucky(nums);
        System.out.println("expected " +expected+ " result: " + result);
           if (result == expected)
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Boohoo.");
    }
public static int countLucky(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
        int lastDigit = nums[i] % 10;
        if (nums[i] % 7 == 0) {
            count++;
        } else if (lastDigit == 7) {
            count++;
        }
    }
    return count;
}
     public static void main (String [] args){
        int [] nums1 = {7, 13, 17};
         int [] nums2 = { 1, 2, 3, 4};
         int [] nums3 = {0, 7, 207};
        testCountLucky(nums1, 2);
        testCountLucky(nums2, 0);
        testCountLucky(nums3, 3);
    }
}