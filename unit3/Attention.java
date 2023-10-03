public class Attention {

    // Test function
    public static void testAttention(String str, boolean expected) {
        boolean result = checkAttention(str);

        System.out.print("string: " + str + " expected: " + expected + " result: " + result);

        if (result == expected)
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Boohoo.");
    }

    public static boolean checkAttention(String str) {
        if (str.length() < 9) {
            return false;
        }

        String a = str.substring(0, 9);
        return a.equals("Hey, you!");
    }

    public static void main(String[] args) {
        testAttention("Hey, you! Give me your lunch money!", true);
        testAttention("u suck!", false);
        testAttention("Hey!", false);
    }
}