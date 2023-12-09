
import processing.core.*;

//main character function (kevin!!!)

public class kevin{
    
            private PImage kevin;
    
        //constructor 
    public kevin(PApplet p, float x, float y){
        
        this.p = p;
        this.x = x;
        this.y = y;
        
        
        kevin = p.loadImage("kevin.png");
        
    }
    
     public void display(){
         
         p.image(kevin, x, y);
         
     }
    //walk function

    
    
        //run animation
    
            //if left button clicked
                //walking left animation
    
            //if right button clicked
                //walking right animation
    
    //speak kevin function
        
        //should this be in my main tab?  
        
        private PApplet p;
        private float x;
        private float y;

    
    
}