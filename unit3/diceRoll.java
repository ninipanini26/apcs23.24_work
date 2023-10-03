public class diceRoll {
    
    public static int rollDice() {
        int randomValue = (int) (Math.random() * 6) + 1; // Generate a random number between 1 and 6
        return randomValue;
    }

    public static void main(String[] args) {
        int numRolls = 10; 

        System.out.println("Dice Rolls:");
        for (int i = 0; i < numRolls; i++) {
            int result = rollDice();
            System.out.println("Roll " + (i + 1) + ": " + result);
        }
    }
}