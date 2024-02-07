public class computations{
    public static int smallest(int[][] values) {
        int smallest = values[0][0];
        for (int[] row : values) {
            for (int value : row) {
                if (value < smallest) {
                    smallest = value;
                }
            }
        }
        System.out.println("Smallest:" + smallest);
        return smallest;
    }
    
    public static float sum (float [][] values2){
        float total = 0;
        for(float[] row: values2){
            for(float value: row){
                total+=value;
            }
        }System.out.println("sum: " + total);
        return total;
    }
    
    public static int startsWithA(String [][] strings){
        int total2 = 0;
        for(String[] row: strings){
            for(String string: row){
                if(string.substring(0,1).equals("A") ||string.substring(0,1).equals("a") ){
                    total2++;
                }
            }
        } System.out.println("Strings that start with a: " + total2);
        return total2;
    }

    public static void main(String[] args) {
        int[][] values = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        float[][] values2 ={{1.0f, 2.0f, 3.0f}, {4.0f, 5.0f}};
        smallest(values);
        sum(values2);
        String [][] strings = {{"Ava", "Hi", "already"}, {"Anything", "apple"}};
        startsWithA(strings);
    }
}
