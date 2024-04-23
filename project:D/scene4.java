import processing.core.*;
//kevin sorting trash scene 
public class scene4 implements Scene{
    public scene4(earth_io p, int w, int h){
        this.p = p;
        this.w = w;
        this.h = h;
        kitchen = p.loadImage("kitchen.png");
        kitchen.resize(w, h);
        scene4State = 1;
        
        textBox1 = new textBox(p, w/2-w/4, h/2, 500, 100, "Welcome to my kitchen! Help me sort my trash?");
        textBox2 = new textBox(p, w/2-w/4, h/2-200, 500, 300, "YAYY! The green bucket is for compost, the blue is for recycling, and the black is for all other trash!");
        textBox3 = new textBox(p, w/2-w/4, h/2-200, 500, 300, "First lets sort the banana into the correct bin! Drag the item to what you think is correct bin and click to finalize your choice.");
        textBox4 = new textBox(p, w/2-w/4, h/2-200, 500, 300, "YAYY WE CHOSE THE CORRECT BIN FOR COMPOST!!!");
        textBox5 =  new textBox(p, w/2-w/4, h/2-200, 500, 300, "aww man...banana peels are supposed to go in the compost! We got 0 earth bucks");
        textBox6 = new textBox(p, w/2-w/4, h/2-200, 500, 300, "Where does my plastic water bottle go? Drag the item to what you think is correct bin and click to finalize your choice.");
        textBox7 = new textBox(p, w/2-w/4, h/2-200, 500, 300, "YAYY PLASTIC WATER BOTTLES ARE A RECYCLING ITEM!! We got 20 earth bucks!!!");
        textBox8 = new textBox(p, w/2-w/4, h/2-200, 500, 300, "Plastic water bottles are actually recylcing items. We got 0 earth bucks.");
        textBox9 = new textBox(p, w/2-w/4, h/2-200, 500, 300, "Where do my coffee grounds go? Drag the item to what you think is correct bin and click to finalize your choice.");
        textBox10 = new textBox(p, w/2-w/4, h/2-200, 500, 300, "YAYY COFFEE GROUNDS ARE A COMPOST ITEM WE GOT 20 EARTH BUCKS!!!");
        textBox11 = new textBox(p, w/2-w/4, h/2-200, 500, 300, "Coffee grounds are actually a compost item...we got 0 earth bucks womp womp");
        textBox12 = new textBox(p, w/2-w/4, h/2-200, 500, 300, "Where does my empty styrofoam cup go? Drag the item to what you think is correct bin and click to finalize your choice."); 
        textBox13 = new textBox(p, w/2-w/4, h/2-200, 500, 300, "THE STYROFOAM CUP GOES IN THE RECYCLE WE GOT 20 EARTH BUCKS!!!");
        textBox14 = new textBox(p, w/2-w/4, h/2-200, 500, 300, "Contrary to popular belief, styrafoam cups are actually a recycling item!");
        textBox15 = new textBox(p, w/2-w/4, h/2-200, 500, 300, "Where does the soda can go? Drag the item to what you think is correct bin and click to finalize your choice.");
        textBox16 = new textBox(p, w/2-w/4, h/2-200, 500, 300, "YAYY the soda can is a recycling item! We got 20 earth bucks!");
        textBox17 = new textBox(p, w/2-w/4, h/2-200, 500, 300, "Soda cans are actually supposed to go in the recycling.");
         textBox18 = new textBox(p, w/2-w/4, h/2-200, 500, 400, "My cardboard pizza box still has melted cheese on it...which can does it go in? Drag the item to what you think is correct bin and click to finalize your choice."); 
         textBox19 = new textBox(p, w/2-w/4, h/2-200, 500, 400, "YAYY!! The pizza box does go in the trash even though it is made out of cardboard because in order for it to be recycled it has to be completely clean."); 
         textBox20 = new textBox(p, w/2-w/4, h/2-200, 500, 400, "The pizza box actually goes in the trash even though it is made out of cardboard because in order for to be recycled an item has to be completely clean.");
        textBox21 = new textBox(p, w/2-w/4, h/2-200, 500, 300, "Last choice!!! Where does the tea bag go? Drag the item to what you think is correct bin and click to finalize your choice.");
        textBox22 = new textBox(p, w/2-w/4, h/2-200, 500, 300, "YAYY!! The tea bag goes in the compost! You got 20 earth bucks!!!");
        textBox23 = new textBox(p, w/2-w/4, h/2-200, 500, 300, "Tea bags are actually compostable and can go in the compost bin.");
         textBox24 = new textBox(p, w/2-w/4, h/2-50, 500, 100, "YAYY we sorted my trash!!!");
        
        
        
        kevin4 =  new kevin(p, w/2, h-220, textBox1);
        
    

        
        
        compostBin = p.loadImage("compost.png");
        recycleBin = p.loadImage("recycle.png");
        trashBin = p.loadImage("trash.png");
        banana = p.loadImage("banana2.png");
        waterBottle = p.loadImage("water.png");
        coffee = p.loadImage("coffee.png");
         cup = p.loadImage("cup.png");
        tea = p.loadImage("teaBag.png");
        pizzaBox = p.loadImage("pizzaBox.png");
        soda = p.loadImage("soda.png");
        
        
        recycleBin.resize(255,255);
        trashBin.resize(255,255);
        compostBin.resize(270,270);
        banana.resize(150, 150); 
        waterBottle.resize(75,125);
        coffee.resize(150, 150);
        cup.resize(75,100);
        soda.resize(75, 100);
        pizzaBox.resize(150, 100);
        tea.resize(100,100);
        
            earthBuck = p.loadImage("earthBuck.png");
    earthBuck.resize(w/8, h/8);
        
        isCompost = false;
        isRecycle = false;

        

    }

  public void display(){
      
    
p.background(255);
p.imageMode(p.CENTER);
p.image(kitchen, w/2,h/2);
kevin4.display();
        
p.image(recycleBin, w/8, h-150);
p.image(trashBin, w/8+150, h-150);
p.image(compostBin, w/8+300, h-150);
      
  //display of the earth bucks
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+400, h/4-100, 500, 100);
        p.fill(0);
        p.text("EARTH BUCKS:$ " + p.accessBucks(), w-550, h/4-100);
        p.imageMode(p.CENTER);
        p.image(earthBuck, w-150, h/4-100); 

      
if(scene4State == 1){
  textBox1.display();
textBox1.update(); 
  p.rectMode(p.CENTER);
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+300, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2+210, h-200, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("Sure!", w/2+w/6, h-200);
}
      
if(scene4State == 2){

textBox2.display();
textBox2.update();
 p.rectMode(p.CENTER);
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+300, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2+210, h-200, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("Cool!", w/2+w/6, h-200);
    
       
    

}
      
if(scene4State ==3){
    textBox3.display();
textBox3.update();
p.image(banana, p.mouseX, p.mouseY);
    
}
      
if(scene4State == 4 && isCompost == true){
    textBox4.display();
textBox4.update();
     p.rectMode(p.CENTER);
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+300, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2+210, h-200, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("YAYYYY", w/2+w/6, h-200);
}else if(scene4State == 4 && isCompost == false){
    textBox5.display();
    textBox5.update();
      p.rectMode(p.CENTER);
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+300, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2+210, h-200, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("oh.", w/2+w/6, h-200);
}
      
if(scene4State == 5){
    textBox6.display();
    textBox6.update();
    p.image(waterBottle, p.mouseX, p.mouseY);
    

}
      
if(scene4State == 6 && isRecycle == true){
    textBox7.display();
    textBox7.update();
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+300, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2+210, h-200, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("YAYYY", w/2+w/6, h-200);
}else if(scene4State == 6 && isRecycle == false){
   textBox8.display();
    textBox8.update();
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+300, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2+210, h-200, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("whoops!", w/2+w/6, h-200);
}

if(scene4State == 7){
    textBox9.display();
    textBox9.update();
    p.image(coffee, p.mouseX, p.mouseY);
}
      
if(scene4State == 8 && isCompost == true){
    textBox10.display();
    textBox10.update();
     p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+300, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2+210, h-200, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("YAYY", w/2+w/6, h-200);
  
}else if(scene4State == 8 && isCompost == false){
      textBox11.display();
    textBox11.update();
      p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+300, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2+210, h-200, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("NOOO", w/2+w/6, h-200);
}
      
if(scene4State == 9){
    textBox12.display();
    textBox12.update();
    p.image(cup, p.mouseX, p.mouseY);
}

if(scene4State == 10 && isRecycle == true){
    textBox13.display();
    textBox13.update();
     p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+300, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2+210, h-200, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("YAYY", w/2+w/6, h-200);
}else if(scene4State == 10 && isRecycle == false){
      textBox14.display();
    textBox14.update();
     p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+300, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2+210, h-200, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("NOO", w/2+w/6, h-200);
}

if(scene4State == 11){
    textBox15.display();
    textBox15.update();
    p.image(soda, p.mouseX, p.mouseY);
    
}if(scene4State == 12 && isRecycle == true){
    textBox16.display();
    textBox16.update();
     p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+300, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2+210, h-200, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("YIPPEEE", w/2+w/6, h-200);
}else if(scene4State == 12 && isRecycle == false){
     textBox17.display();
    textBox17.update();
     p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+300, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2+210, h-200, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("oh.", w/2+w/6, h-200);
}
      
if(scene4State == 13){
    textBox18.display();
    textBox18.update();
    p.image(pizzaBox, p.mouseX, p.mouseY);
}
      if(scene4State == 14 && isTrash == true){
          textBox19.display();
          textBox19.update();
           p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+300, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2+210, h-200, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("YAYY", w/2+w/6, h-200);
      }else if(scene4State == 14 && isTrash == false){
             textBox20.display();
          textBox20.update();
           p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+300, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2+210, h-200, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("NOO", w/2+w/6, h-200);
      }
      
if(scene4State==15){
    textBox21.display();
    textBox21.update();
    p.image(tea, p.mouseX, p.mouseY);
}
      
    if(scene4State==16 && isCompost == true){
    textBox22.display();
    textBox22.update();
            p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+300, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2+210, h-200, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("YAYY", w/2+w/6, h-200);
}else if(scene4State == 16 && isCompost == false){
         textBox23.display();
    textBox23.update();
            p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+300, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/2+210, h-200, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("oh.", w/2+w/6, h-200);
    } 
      if(scene4State == 17){
          textBox24.display();
          textBox24.update();
      }
  }

    public void mousePressed(){
        if(p.dist(p.mouseX, p.mouseY,w/2+210, h-200)<= 50 && (scene4State == 1) && textBox1.isDone()){
            scene4State = 2;
            kevin4.setCurrentTextBox(textBox2);
        }if(p.dist(p.mouseX, p.mouseY, w/2+210, h-200)<= 50 && (scene4State == 2) && textBox2.isDone()){
            scene4State = 3;
            kevin4.setCurrentTextBox(textBox3);
        }
        //if banana peel is in correct one 
        if(p.dist(p.mouseX, p.mouseY,w/8+300, h-150 ) <= 100 && (scene4State == 3)){
            p.increaseBucks(20);
            scene4State = 4;
            isCompost = true;   
                kevin4.setCurrentTextBox(textBox4);
        }
        //if banana peel is in wrong one 
        else if ((p.dist(p.mouseX, p.mouseY,w/8+150, h-150) <= 100 || p.dist(p.mouseX, p.mouseY,w/8, h-150 )<=100) && (scene4State == 3)){
            scene4State = 4;
            isCompost = false;
                kevin4.setCurrentTextBox(textBox5);
        }
        
        if(p.dist(p.mouseX, p.mouseY,w/2+210, h-200)<= 50 && (scene4State == 4) && (textBox4.isDone() || textBox5.isDone())){
                     scene4State = 5;
            kevin4.setCurrentTextBox(textBox6); 
        }
        
        if(p.dist(p.mouseX, p.mouseY, w/8, h-150)<=100 && (scene4State == 5)){
            isRecycle = true;
            scene4State =6;
            p.increaseBucks(20);
             kevin4.setCurrentTextBox(textBox7); 
        }
        //if water is in wrong one 
        else if((p.dist(p.mouseX, p.mouseY,w/8+150, h-150) <= 100 || p.dist(p.mouseX, p.mouseY,w/8+300, h-150 ) <= 100)  && (scene4State == 5)){
            isRecycle = false;
                        scene4State =6;
             kevin4.setCurrentTextBox(textBox8); 
            
            
        }
        
          if(p.dist(p.mouseX, p.mouseY,w/2+210, h-200)<= 50 && (scene4State == 6) && (textBox7.isDone() || textBox8.isDone())){
                scene4State = 7;
                kevin4.setCurrentTextBox(textBox9);

    }
            if(p.dist(p.mouseX, p.mouseY,w/8+300, h-150 ) <= 100 && (scene4State == 7)){
            p.increaseBucks(20);
            scene4State = 8;
            isCompost = true;   
                kevin4.setCurrentTextBox(textBox10);
             
        }else if((p.dist(p.mouseX, p.mouseY,w/8+150, h-150) <= 100 || p.dist(p.mouseX, p.mouseY,w/8, h-150 )<=100) && (scene4State == 7)){
                scene4State = 8;
                isCompost = false; 
                    kevin4.setCurrentTextBox(textBox11);
            }
        
        if(p.dist(p.mouseX, p.mouseY,w/2+210, h-200)<= 50 && (scene4State == 8) && (textBox10.isDone() || textBox11.isDone())){
            scene4State = 9;
            kevin4.setCurrentTextBox(textBox12);
            
        }
        
            if(p.dist(p.mouseX, p.mouseY, w/8, h-150)<=100 && (scene4State == 9)){
            p.increaseBucks(20);
            scene4State = 10;
            isRecycle = true;   
            kevin4.setCurrentTextBox(textBox13);
             
        } else if((p.dist(p.mouseX, p.mouseY,w/8+150, h-150) <= 100 || p.dist(p.mouseX, p.mouseY,w/8+300, h-150 ) <= 100)  && (scene4State == 9)){
            isRecycle = false;
            scene4State = 10;
             kevin4.setCurrentTextBox(textBox14); 
            
            
        }   if(p.dist(p.mouseX, p.mouseY,w/2+210, h-200)<= 50 && (scene4State == 10) && (textBox13.isDone() || textBox14.isDone())){
                scene4State = 11;
                kevin4.setCurrentTextBox(textBox15);

    }  if(p.dist(p.mouseX, p.mouseY, w/8, h-150)<=100 && (scene4State == 11)){
            p.increaseBucks(20);
            scene4State = 12;
            isRecycle = true;   
            kevin4.setCurrentTextBox(textBox16);      
        } else if((p.dist(p.mouseX, p.mouseY,w/8+150, h-150) <= 100 || p.dist(p.mouseX, p.mouseY,w/8+300, h-150 ) <= 100)  && (scene4State == 11)){
            isRecycle = false;
            scene4State = 12;
             kevin4.setCurrentTextBox(textBox17);   
            
        } 
        
         if(p.dist(p.mouseX, p.mouseY,w/2+210, h-200)<= 50 && (scene4State == 12) && (textBox16.isDone() || textBox17.isDone())){
                scene4State = 13;
                kevin4.setCurrentTextBox(textBox18);
    } if(p.dist(p.mouseX, p.mouseY, w/8+150, h-150)<=100 && (scene4State == 13)){
            p.increaseBucks(20);
            scene4State = 14;
            isTrash = true;   
            kevin4.setCurrentTextBox(textBox19);      
        }else if((p.dist(p.mouseX, p.mouseY, w/8+300, h-150) <= 100 || p.dist(p.mouseX, p.mouseY, w/8, h-150)<=100) && (scene4State == 13)){
             scene4State = 14;
             isTrash = false;
             kevin4.setCurrentTextBox(textBox20);
         }  if(p.dist(p.mouseX, p.mouseY,w/2+210, h-200)<= 50 && (scene4State == 14) && (textBox19.isDone() || textBox20.isDone())){
                scene4State = 15;
                kevin4.setCurrentTextBox(textBox21);
    }
        
      if(p.dist(p.mouseX, p.mouseY,w/8+300, h-150 ) <= 100 && (scene4State == 15)){
            p.increaseBucks(20);
            scene4State = 16;
            isCompost = true;   
                kevin4.setCurrentTextBox(textBox22);        
        }else if((p.dist(p.mouseX, p.mouseY,w/8+150, h-150) <= 100 || p.dist(p.mouseX, p.mouseY,w/8, h-150 )<=100) && (scene4State == 15)){
                scene4State = 16;
                isCompost = false; 
                    kevin4.setCurrentTextBox(textBox23);
            }
        if(p.dist(p.mouseX, p.mouseY,w/2+210, h-200)<= 50 && (scene4State == 16) && textBox22.isDone() || textBox23.isDone()){
                scene4State = 17;
                kevin4.setCurrentTextBox(textBox24);
    }
        
    }
    
    

    public void reset(){
        
    }
    public int returnvar(){
        
         return scene4State;
    }
    
    
 
private earth_io p;
private PImage kitchen, trashBin, recycleBin, compostBin, banana, earthBuck, waterBottle, coffee, cup, tea, pizzaBox, soda;
private int w, h, scene4State;
private kevin kevin4;
private textBox textBox1, textBox2, textBox3, textBox4, textBox5, textBox6, textBox7, textBox8, textBox9, textBox10, textBox11, textBox12, textBox13, textBox14, textBox15, textBox16, textBox17, textBox18, textBox19, textBox20, textBox21, textBox22, textBox23, textBox24;
private boolean isCompost, isRecycle, isTrash; 

    
}