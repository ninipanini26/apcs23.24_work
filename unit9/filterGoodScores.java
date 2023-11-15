import java.util.ArrayList;

public class filterGoodScores{

    public static ArrayList<Integer> filterGoodScores(int[] values) {
        ArrayList<Integer> good = new ArrayList<Integer>();

        for (int x : values) {
            if (x >= 90)
                good.add(x);
        }

        return good;
    }

    public static void main(String[] args) {
        int[] values = {90, 95, 100, 20, 50, 60};
        ArrayList<Integer> goodScores = filterGoodScores(values);
        System.out.println("Good Scores: " + goodScores);
    }
}

