
import processing.core.*;
public class scene1 implements Scene{

    
    public scene1(earth_io p, int w, int h){
    
    this.p = p;
    this.w = w;
    this.h = h;
    background1 = p.loadImage("background.jpg");
   background1.resize(w, h);
        
    earthBuck = p.loadImage("earthBuck.png");
    earthBuck.resize(w/8, h/8);
    
        
     scene1State = 1;
        
    textBox1 = new textBox(p, w/4+50, h/4, 500, 369,  "HELLO I'M KEVIN AND WELCOME TO EARTH! OUR PLANET IS WARMING UP A LOT DUE TO SOMETHING I LEARNED ABOUT TODAY CALLED GLOBAL WARMING...");
    
     textBox2 = new textBox(p, w/4+50, h/4+50, 700, 400, "GLOBAL WARMING IS THE LONG-TERM WARMING OF THE PLANET'S OVERALL TEMPERATURE. THOUGH THIS WARMING TREND HAS BEEN GOING ON FOR A LONG TIME, ITS PACE HAS SIGNIFICANTLY INCREASED IN THE LAST HUNDRED YEARS DUE TO THE BURNING OF FOSSIL FUELS.");
     
     textBox3 = new textBox(p, w/4+50, h/4+50, 700,400, "HELP ME GO ABOUT MY DAY MAKING EARTH-CONCIOUS DECISIONS! IF YOU DO WELL, YOU WILL INCREASE YOUR EARTH BUCKS!");
        
     //initializing kevin
    kevin1 = new kevin(p, w/2+100, h-300, textBox1);
    
    }
    
    public void display(){
p.imageMode(p.CENTER);
p.image(background1, w/2,h/2);
kevin1.display();
p.rectMode(p.CENTER);
p.strokeWeight(5);
p.stroke(70, 168, 50);
p.fill(255);
p.rect(w/3-75, h-300, 450, 100, 5);
if(scene1State == 1){
p.fill(0);
textBox1.display();
textBox1.update();
p.textSize(14);
p.text("what is global warming?", w/4-50, h-300);
p.fill(70, 168, 50);
p.noStroke();
p.rect(w/4-120, h-300, 50, 50, 5);

} else if (scene1State == 2){
    textBox2.display();
    textBox2.update();
    p.fill(0);
p.text("how can i help?", w/4-50, h-300);
p.fill(70, 168, 50);
p.rect(w/4-120, h-300, 50, 50, 5);
}

else if(scene1State == 3){
    textBox3.display();
    textBox3.update();
    p.rectMode(p.CENTER);
    p.fill(255);
    p.rect(w/2+400, h/4-100, 500, 100);
    p.fill(0);
     p.text("EARTH BUCKS:$ " + (int) p.accessBucks(), w-550, h/4-100);
     p.imageMode(p.CENTER);
    p.image(earthBuck, w-150, h/4-100);
    
    p.text("okay let's do it!", w/4-50, h-300);
    p.fill(70, 168, 50);
    p.noStroke();
    p.rect(w/4-120, h-300, 50, 50, 5);
}
        
    }
    
    public void mousePressed(){
        
if(p.dist(p.mouseX, p.mouseY,w/4-100, h-300)<= 50 && (scene1State == 1) && textBox1.isDone()){
scene1State = 2;
    //update the current text box kevin is on
kevin1.setCurrentTextBox(textBox2);
}
else if(p.dist(p.mouseX, p.mouseY,w/4-100,h-300)<= 50 && (scene1State == 2) && textBox2.isDone()){
scene1State = 3;
kevin1.setCurrentTextBox(textBox3);
}else if (textBox3.isDone()){
    scene1State =4;
}
    }
    
    public void reset(){
        
    }
    
    public int returnvar(){
        return scene1State;
    }

    private textBox textBox1;
    private textBox textBox2;
    private textBox textBox3;
    private earth_io p;
    private int scene1State;
    private int w;
    private int h;
    private kevin kevin1;
    private PImage background1;
    private PImage earthBuck;
}