public class testScoreKeeper{
    public static void main(String[] args){
  
        scoreKeeper player = new scoreKeeper();
        
        player.scoreNormal();
        player.scoreBonus();
        player.scoreNormal();
        player.scoreBonus();
        player.scoreNormal();
        player.scoreNormal();
        player.scoreNormal();
        player.scoreNormal();
        
        System.out.println("score: "  + player.getScore());
        
    }
}