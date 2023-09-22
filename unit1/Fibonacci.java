//printing the first 30 of fibonacci sequence

public class Fibonacci {
    
    public static void main (String [] args){
        
        int n = 30;
        
        int first = 0;
        int second = 1; //first two numbers in sequence
        
        System.out.println(first + " " + second + " "); //print first two numbers
        
        for (int i  = 2; i <n; i ++){

        int next = first + second;
        System.out.println(next + " ");
        first = second;
        second = next;

}
        
    }
}