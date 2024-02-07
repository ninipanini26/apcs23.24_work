
//GROCERY STORE SCENE 
import processing.core.*;
public class scene2 implements Scene{
    public scene2(PApplet p, int w, int h){
        this.p = p;
        this.w = w;
        this.h = h;
        scene2State = 1;
        groceryBackground = p.loadImage("grocery2.jpg");
        groceryBackground.resize(w+10,h);
        //initializing kevin
        kevin2 = new kevin(p, w/2, h/2);
        textBox1 = new textBox(p, w/4+75, h/4+50, 300, 200, "WELCOME TO THE GROCERY STORE!");
    }
    
    public void display(){
        p.imageMode(p.CENTER);
        p.image(groceryBackground, w/2,h/2);
        textBox1.display();
        textBox1.update();
        kevin2.display();
    }
    
    public void mousePressed(){
        
    }
    
    public void reset(){
        
    }
    
    public int returnvar(){
        return scene2State;
    }
    
    private PApplet p;
    private int scene2State;
    private int w;
    private int h;
    private PImage groceryBackground;
    private kevin kevin2;
    private textBox textBox1;
    
}