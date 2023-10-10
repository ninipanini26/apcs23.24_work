public class stringSplosion{
    
    //test function
    
public static void testStringSplosion(String str, String expected) {
    String result = stringSplosion(str);

    System.out.println("Input: " + str);
    System.out.println("Expected: " + expected);
    System.out.println("Result: " + result);

    if (result.equals(expected))
        System.out.println("Yay!!!!");
    else
        System.out.println("Boohoo.");
}
    
    public static String stringSplosion (String str){
        String result = "";
  for (int i=0; i<str.length(); i++) {
    result = result + str.substring(0, i+1);
  }
  return result;
    }
    
    public static void main (String[] args){
        testStringSplosion("Code", "CCoCodCode");
        testStringSplosion("abc", "aababc");
        testStringSplosion("a", "a");
    }
}