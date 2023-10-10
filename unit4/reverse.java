public class reverse{

    public static void testReverse(String str, String expected){
          String result = reverse(str);
        System.out.println("Input: " + str);
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        if (result.equals(expected)) {
            System.out.println("Yay!!!!");
        } else {
            System.out.println("Boohoo.");
        }
        
    }
    
    
    
     public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    
    public static void main(String args[]){
        testReverse("Hello", "olleH");
        testReverse("World", "dlroW");
        testReverse("Hi!", "!iH");
    }
}