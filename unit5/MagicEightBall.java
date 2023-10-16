public class MagicEightBall{
    
    private String question;
    public String MagicEightBall(String question){
        this.question = question; 
        
        double shake = Math.random();
        
        if (shake < .1){
            System.out.println("Signs Point to Yes");
        }else {
            System.out.println("Don't count on it");
        } 
        return question;
    }
}