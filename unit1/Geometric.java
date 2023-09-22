//dividing by two geometric sequence 

public class Geometric {
    public static void main(String[] args) {
        double value = 21.0; // Starting value

        for (int n = 0; n < 21; n++) {
            System.out.println(value);
            value /= 2.0; // Divide by 2 in each iteration
        }
    }
}