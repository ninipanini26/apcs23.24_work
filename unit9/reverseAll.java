public class reverseAll {
    
    public static String[] reverseAll(String[] names){
        String[] result = new String[names.length];
        
        for (int i = 0; i <names.length; i++) {
             result[i] = reverseString(names[i]);
        }
        
        return result;
    }
    
    public static String reverseString(String str){
          String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    
    
    
    public static void main(String[] args){
 String[] names = {"hi", "bye", "hello"};
    String[] reversedNames = reverseAll(names);
    
    System.out.println("Original names:");
    for (String g : names) {
        System.out.print(g + " ");
    }
        System.out.println("");

    System.out.println("Reversed names:");
    for (String x : reversedNames) {
        System.out.print(x + " ");
        
    }
    
}
}
    
