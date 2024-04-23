
import processing.core.*;

//main character function (kevin!!!)

public class kevin{
    
            private PImage kevin;
            private PImage kevinOpen;  
        private int currentFrame;
       private textBox currentTextBox;
    
        //constructor 
    public kevin(PApplet p, float x, float y, textBox tb){
        
        this.p = p;
        this.x = x;
        this.y = y;
        this.currentTextBox = tb;
        
        
        kevin = p.loadImage("kevin.png");
        kevinOpen = p.loadImage("kevinOpen.png");
       kevinOpen.resize(300, 300);
      kevin.resize(300,300);
         this.currentFrame = 0;
        
    }
    
      // Function to set the currently active textBox
    public void setCurrentTextBox(textBox tb) {
        this.currentTextBox = tb;
    }
    
   public textBox getCurrentTextBox() {return currentTextBox;}
    
    
    // Function to check if the current textBox is done talking
    public boolean isCurrentTextBoxDone() {
        return currentTextBox.isDone();
    }
    
public void display() {
 // Calculate the frame index based on the frame count
currentFrame = p.frameCount;

// If the current frame is within the first x frames, and he isnt done talking display kevin with an open mouth
if (currentFrame % 50 < 20 && !isCurrentTextBoxDone()) {
     p.image(kevinOpen, x, y);
} 
//if hes done talking close his mouth
else {
     p.image(kevin, x, y);
}

    //double checking if everything works
//System.out.println("Kevin dimensions: " + kevin.width + " x " + kevin.height);
//System.out.println("KevinOpen dimensions: " + kevinOpen.width + " x " + kevinOpen.height);
//System.out.println("Frame count: " + p.frameCount);

}
    //walk function

    
    
        //run animation
    
            //if left button clicked
                //walking left animation
    
            //if right button clicked
                //walking right animation

        
        private PApplet p;
        private float x;
        private float y;
       // private int currentFrame;
    
    
}