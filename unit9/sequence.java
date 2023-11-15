public class sequence {

    
    public static int[] fibonacci (int n){
        int [] result = new int [n];
        int first = 0;
        int second = 1;
        for (int i = 0; i < n; i++) {
            result[i] = first;
            int next = first + second;
            first = second;
            second = next;
            
        }
        return result;
    }
    
     public static void main(String[] args){
         
         int [] results = fibonacci(8);
         for(int x: results){
             System.out.println("fibonacci : " + x); 
         }
        
     }
}