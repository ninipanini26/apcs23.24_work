public class coinFlip {
    // Function to perform a coin flip and return "Heads" or "Tails"
    public static String flipCoin() {
        double randomValue = Math.random();
          int result = (randomValue < 0.5) ? 0 : 1;
        
        if (result == 0) {
            return "Heads";
        } else {
            return "Tails";
        }
    }

    public static void main(String[] args) {
        int numFlips = 20;

        System.out.println("Coin Flips:");
        for (int i = 0; i < numFlips; i++) {
            String result = flipCoin();
            System.out.println("Flip " + (i + 1) + ": " + result);
        }
    }
}