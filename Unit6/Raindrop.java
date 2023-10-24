import processing.core.*;


public class Raindrop{

    
    public Raindrop(PApplet p, float x, float y, float w, float h, float vy){
        
        this.p = p;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.vy = vy;
        
    }public void update(){
        
        y+=vy;
        
        if(y> 800)
            y = 0;
        
    }
    
    public void display(){
       
        p.noStroke();
        p.fill(159, 185, 237);
        p.ellipse(x,y, w, h);
        
    }
    
    private PApplet p;
    private float x;
    private float y;
    private float w;
    private float h;
    private float vy;
    
}