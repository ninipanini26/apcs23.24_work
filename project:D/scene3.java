import processing.core.*;
public class scene3 implements Scene{
    public scene3(earth_io p, int w, int h){
        this.p = p;
        this.w = w;
        this.h = h;
        scene3State = 1;
        textBox1 = new textBox(p, w/2, h/4, 500, 300, "QUICK QUESTION: SHOULD I TAKE MY BIKE OR MY SCOOTER BACK HOME??? THE BIKE WILL TAKE LONGER BUT I DON'T HAVE TO GET HOME SUPER QUICKLY...");
        textBox2 = new textBox(p, w/2-200, h/4+100, 500, 300, "UGH. I WANT TO TAKE MY SCOOTER BUT THE MOTOR BURNS A LOT OF CO2. LOOKS LIKE WE DIDN'T GET MANY EARTH BUCKS FROM THIS CHOICE...");
        textBox3 = new textBox(p, w/2-200, h/4+100, 500, 300, "YAYYY MY BIKE SEEMS TO BE A VERY EARTH CONCIOUS CHOICE! WE GOT 30 EARTH BUCKS! I CAN'T WAIT TO RIDE HOME!!");
        
        //loading the background 
        streetBackground = p.loadImage("background3.jpg");
         streetBackground.resize(w, h);
        
        //loading bike and car 
        bike = p.loadImage("bike.png");
        bike.resize(500,500);
        
        scooter = p.loadImage("scooter.png");
        scooter.resize(350,350);
    
    earthBuck = p.loadImage("earthBuck.png");
    earthBuck.resize(w/8, h/8);
        
        
        
kevin3 = new kevin(p, w/2, h-220, textBox1);

        
    }
    
    public void display(){
    
p.background(255);
p.imageMode(p.CENTER);
p.image(streetBackground, w/2,h/2);
    
if(scene3State ==1){     
 textBox1.display();
textBox1.update();
        
p.image(scooter, w/2-300, h-150);
p.image(bike, w/2+400, h-100);
}

if(textBox1.isDone() && scene3State == 1){

    //show green rectangles
     //white rectangle with green stroke around it 
         p.rectMode(p.CENTER);
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2-300, h-350, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2-210, h-350, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("SCOOTER", w/4-50, h-350);
    
            p.rectMode(p.CENTER);
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+300, h-350, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2+210, h-350, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("BIKE", w/2+w/4, h-350);
    
}

//if scooter is chosen
if(scene3State == 2){

kevin3.display();
textBox2.display();
textBox2.update();
  //display of the earth bucks
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+400, h/4-100, 500, 100);
        p.fill(0);
        p.text("EARTH BUCKS:$ " + p.accessBucks(), w-550, h/4-100);
        p.imageMode(p.CENTER);
        p.image(earthBuck, w-150, h/4-100);
        p.rectMode(p.CENTER);
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+300, h-350, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2+210, h-350, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("let's go home...", w/2+225, h-350);
    
        
p.image(scooter, w/2-300, h-150);

}

//if bike is chosen 
if (scene3State == 3){
kevin3.display();
textBox3.display();
textBox3.update();
  //display of the earth bucks
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+400, h/4-100, 500, 100);
        p.fill(0);
        p.text("EARTH BUCKS:$ " + p.accessBucks(), w-550, h/4-100);
        p.imageMode(p.CENTER);
        p.image(earthBuck, w-150, h/4-100); 

         p.rectMode(p.CENTER);
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2-300, h-350, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2-210, h-350, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("lets go home!", w/4-50, h-350);
p.image(bike, w/2+400, h-100);
}
    

    }

     public void mousePressed(){
         
//if we choose scooter 
         
if(p.dist(p.mouseX, p.mouseY, w/2-210, h-350)<= 50 && (scene3State == 1) && textBox1.isDone()){  
scene3State = 2;
kevin3.setCurrentTextBox(textBox2);
p.increaseBucks(5);}

//if bike is chosen 
if(p.dist(p.mouseX, p.mouseY, w/2+210, h-350)<= 50 && (scene3State == 1) && textBox1.isDone()){  
scene3State = 3;
kevin3.setCurrentTextBox(textBox3); 
    p.increaseBucks(30);}
     }
    
    public void reset(){    
    }
    public int returnvar(){
        return scene3State;
    }
    

    
    
    private earth_io p;
    private PImage streetBackground,bike, scooter, earthBuck;
    private int scene3State;
    private int w;
    private int h;
    private textBox textBox1, textBox2, textBox3;
    private kevin kevin3;
}