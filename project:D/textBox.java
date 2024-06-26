import processing.core.*;

public class textBox{
    
    private PImage textBox;
    
    public textBox(PApplet p, float x, float y, int w, int h, String text1){
        this.p = p;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.text1 = text1;
        textBox = p.loadImage("textBox.png");
        textBox.resize(w, h);
        current = 0; 
        font1 = p.createFont("font1.ttf", 48);
    }
    
    public void update(){
            
            
            //current index variable at 0
            
            if(p.frameCount%3==0 && current<text1.length())
                current++;
            if(current >= text1.length()){
                isDone = true;
            }
        
    }
    
    public void display(){
        
        p.textFont(font1);
        p.textSize(16);
        p.fill(0);
        //p.imageMode(CENTER);
        p.image(textBox, x, y);
        p.textAlign(p.LEFT);
        p.text(text1.substring(0, current),x,y+h/4, w-w/4, h);
    }
    
    public boolean isDone(){return isDone;}
    
    private PApplet p;
    private float x;
    private float y;
    private int w;
    private int h;
    private String text1;
    private int current;
    private PFont font1;
    private boolean isDone = false;
}