import processing.core.*;

public class scene5 implements Scene{
        private kevin kevin5;
    public scene5(earth_io p, int w, int h){
           this.p = p;
        this.w = w;
        this.h = h;
        kevin5 = new kevin(p, w/2+100, h/2+250, textBox1);
        textBox1 = new textBox(p, w/2-w/6, h/2, 500, 300, "Thank you for playing my game! You finished with $"  + earthTotal +  " earth bucks! I hope you learned something new and happy earth week!");
        kevin5.setCurrentTextBox(textBox1);
        landscape = p.loadImage("landscape.png");
        landscape.resize(w, h);
    }
        public void display(){
            p.background(255);
            earthTotal = (int) p.accessBucks();
            p.imageMode(p.CENTER);
            p.image(landscape, w/2,h/2);
            kevin5.display();
            textBox1.display();
            textBox1.update();
        
        }
    public void mousePressed(){
        
    }
    public void reset(){
}
    public int returnvar(){
        return scene5State;
    }
    
    private earth_io p;
    private int w, h, earthTotal;
    private int scene5State;
    private textBox textBox1;
    private PImage landscape;
 
}