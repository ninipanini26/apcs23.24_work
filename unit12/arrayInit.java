public class arrayInit{
    
    public static void main(String[] args){
        
        String [][] apcs = {{"Nina", "Nola", "Jane"}, {"Wynter", "Mia", "Sydney"}};
        System.out.println(apcs[0][0]); //should be nina 
        System.out.println(apcs[1][0]); //should be wynter
        
        
        int[][] ten = new int [10][10];
        //putting 1 on the diagonal 
        for (int i = 0; i<10; i++){ ten[i][i] = 1;}
        //nested for loop for ten 2d array
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(ten[i][j] + " ");
            }
            System.out.println();
        }
    
    double[][] values = new double[5][5];
        double value = 11.0;
        

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                values[i][j] = value;
                value++;
            }
            value+=5;
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(values[i][j] + " ");
            }
               System.out.println(); 
        }
      int [][] repeats = new int[6][5];
            for(int i = 0; i < 6; i++){
                for(int j = 0; j<5; j++)
                {
                    repeats[i][j] = i+1;
                }           
            }
        
         for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(repeats[i][j] + " ");
            }
               System.out.println(); 
        }
    
    }
    }

