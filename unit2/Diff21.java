//diff 21

public class Diff21 {
    public static void difference21(int n) {
        if (n < 21) {
            System.out.println(21 - n);
        } else {
            System.out.println(2 * (n - 21));
        }
    }

    public static void main(String[] args) {
        difference21(19);
        difference21(30);
    }
}