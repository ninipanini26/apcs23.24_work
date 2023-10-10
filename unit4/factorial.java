public class factorial{
    public static void testFactorial (int fact, int expectedFact){
        int result = factorial(fact);
          System.out.print("factorial: " + fact + " expected factorial: " + expectedFact + " result: " + result);

        if (result == expectedFact)
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Boohoo.");
    }

    public static int factorial(int fact){
       int result = 1;
        for (int i = 1; i <= fact; i++) {
            result *= i;
        }
        return result;
    }
    
    public static void main(String[] args){
        testFactorial(0, 1);
        testFactorial(1, 1);
        testFactorial(5, 120);
    }
}