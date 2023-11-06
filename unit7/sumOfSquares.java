public class sumOfSquares{
    public static void testSumOfSquares(double nums[], double expected){
        double result = sumOfSquares(nums);
         System.out.println("expected " +expected+ " result: " + result);
        
        if (Math.abs(expected - result) < 1e-6)
            System.out.println("Woohoo!");
        else
            System.out.println("Uh oh.");
    }
    
    public static double sumOfSquares (double nums[]){
        
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum+=nums[i] * nums[i];
        }
            return sum;
    }
    
     public static void main (String [] args){
         
         
         double[] nums1 = {0, 1, 2};
         double [] nums2 = {3, 4, 5};
         testSumOfSquares (nums1, 5);
         testSumOfSquares (nums2, 50);
         
     }   
        
}