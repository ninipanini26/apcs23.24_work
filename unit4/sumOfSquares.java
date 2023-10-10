public class sumOfSquares{
    //test function
    public static void testSumOfSquares (int sum, int expectedSum){
        
        int result = sumOfSquares(sum);
          System.out.print("sum: " + sum + " expected: " + expectedSum + " result: " + result);

        if (result == expectedSum)
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Boohoo.");
    }
    
    public static int sumOfSquares(int n){
        int sum = 0;
        for(int i =1; i<=n; i++){
            sum+=i*i; //sum equals the square of i
        }
        return sum;
    }
    
    public static void main (String args[]){
        
        testSumOfSquares (1, 1);
        testSumOfSquares(2, 5);
        testSumOfSquares(3, 14);
    }
}