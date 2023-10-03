public class Greetings {

    public static void testGreetings(String name, String expected) {
        String result = greetings(name);

        if (result.equals(expected))
            System.out.println("Yay!!!!");
        else
            System.out.println("Boohoo.");
    }

    public static String greetings(String name) {
         System.out.println("Hello, " + name + ", how are you?");
        return "Hello, " + name + ", how are you?";
       
    }

    public static void main(String[] args) {
        testGreetings("Dr. Kessner", "Hello, Dr. Kessner, how are you?");
        testGreetings("Nina", "Hello, Nina, how are you?");
    }
}