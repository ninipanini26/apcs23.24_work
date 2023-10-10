public class countOccurrences {
    // Test function
    public static void testCount(String str, String target, int expectedCount) {
        int result = countOccurrences(str, target);
        System.out.println("str: " + str + ", target: " + target + " expected: " + expectedCount + " result: " + result);

        if (result == expectedCount) {
            System.out.println("Yay!!!!");
        } else {
            System.out.println("Boohoo.");
        }
    }


    public static int countOccurrences(String str, String target) {
        int count = 0;
        int index = str.indexOf(target);
        
        while (index != -1) {
            count++;
            index = str.indexOf(target, index + target.length());
        }
        
        return count;
    }

    public static void main(String[] args) {
        testCount("banana", "na", 2);
        testCount("papa", "pa", 2);
        testCount("mama", "ma", 2);
    }
}