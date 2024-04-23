
//GROCERY STORE SCENE 
import processing.core.*;
public class scene2 implements Scene{
    public scene2(earth_io p, int w, int h){
        this.p = p;
        this.w = w;
        this.h = h;
        scene2State = 1;
        
        //image booleans for the foods 
        pizzaTrue = false;
        watermelonTrue = false;
        bananaTrue = false;
        eggTrue = false;
        porkTrue = false;
        chickenTrue = false;
        
        groceryBackground = p.loadImage("grocery.png");
        groceryBackground.resize(w+50,h+50);
        //initializing kevin and text boxes
        textBox1 = new textBox(p, w/4+75, h/2, 300, 200, "WELCOME TO THE FOOD MARKET!");
        textBox2 = new textBox(p, w/4+75, h/2, 300, 300, "I DON'T KNOW WHAT FOODS TO GET! CAN YOU HELP ME CHOOSE??");
        textBox3 = new textBox(p, w/2, h/2-50, 500, 300, "WHICH FOOD ITEM IS MORE EARTH-CONCIOUS: WATERMELON OR PIZZA? CLICK ON THE FOOD TO SELECT!");
        textBox4 = new textBox(p, w/4+75, h/2-150, 500, 500, "PIZZA IS NOT ENVIRONMENTALLY FRIENDLY DUE TO THE HIGH CARBON EMISSIONS FROM CHEESE AND MEAT PRODUCTION AND THE ENERGY-INTENSIVE PROCESS OF BAKING. YOU GOT 0 EARTH BUCKS FROM THIS CHOICE womp womp");
        textBox5 = new textBox(p, w/4+75, h/4+50, 500, 300, "YAYY! GOOD JOB! WATERMELON IS A MUCH MORE EARTH-CONCIOUS CHOICE AND ITS ALSO HEALTHIER lol YOU GOT 20 EARTH BUCKS FROM THIS CHOICE!");
        textBox6 = new textBox(p, w/2, h/2-50, 500, 300, "OKAY LET'S DO ANOTHER ONE! WHICH FOOD ITEM IS MORE EARTH-CONCIOUS: BANANA OR EGGS? CLICK ON THE FOOD TO SELECT!");
        textBox7 = new textBox(p, w/4+75, h/4+50, 500, 500, "BANANAS ARE VERY GOOD FOR THE EARTH! BANANAS ARE ENERGY EFFICIENT AS THEY USE NATURAL SUNLIGHT TO GROW. HOWEVER BE CAREFUL WITH PACKAGING WITH FRUIT ITEMS AS THEY CAN LEAD TO EXCESS WASTE. YOU GET 10 EARTH BUCKS FROM THIS CHOICE!");
        textBox8 = new textBox (p, w/4+75, h/4+50, 500, 500, "WHILE EGGS ARE ANIMAL PRODUCTS THEY ARE A SUSTAINABLE CHOICE FOR PROTEIN AND HAVE LOW CARBON EMMISIONS FROM PRODUCTION! YOU GET 15 EARTH BUCKS FROM THIS CHOICE!");
        textBox9 = new textBox(p, w/2, h/2-100, 500, 450, "OKAY LAST CHOICE! I'M CRAVING SOME MEAT...WHICH MEAT ITEM WOULD BE MORE ENVIROMENTALLY FRIENDLY: CHICKEN OR PORK? CLICK ON THE FOOD TO SELECT");
        textBox10 = new textBox(p, w/4+75, h/4+50, 500, 500, "CHICKEN IS CONSIDERED MORE ENVIRONMENTALLY FRIENDLY THAN OTHER MEATS DUE TO ITS LOWER CARBON FOOTPRINT AND EFFICIENT FEED CONVERSION RATIO. YOU GET 30 EARTH BUCKS FROM THIS CHOICE! SHOULD WE GO BACK HOME NOW?");
        textBox11 = new textBox(p, w/4+75, h/4+50, 500, 500, "PORK IS CONSIDERED LESS ENVIRONMENTALLY FRIENDLY THAN OTHER MEAT PRODUCTS DUE TO ITS HIGHER GREENHOUSE GAS EMISSIONS AND GREATER WATER USAGE IN PRODUCTION. YOU GET 0 EARTH BUCKS FROM THIS CHOICE. SHOULD WE GO BACK HOME NOW?");
        
        kevin2 = new kevin(p, w/2, h-220, textBox1);
        
    earthBuck = p.loadImage("earthBuck.png");
    earthBuck.resize(w/8, h/8);
        
    watermelon = p.loadImage("watermelon.png");
    watermelon.resize(300, 300);
    
    pizza = p.loadImage("pizza.png");
    pizza.resize(300,300);
        
    banana = p.loadImage("banana.png");
    banana.resize(300,300);
    
    egg = p.loadImage("egg.png");
    egg.resize(300,300);
        
    chicken = p.loadImage("chicken.png");
    chicken.resize(300,300);
        
    pork = p.loadImage("pork.png");
    pork.resize(300,300);
        
    
    }
    
    public void display(){

        p.background(255);
        p.imageMode(p.CENTER);
        p.image(groceryBackground, w/2,h/2);
        kevin2.display();
        //display of the earth bucks
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/2+400, h/4-100, 500, 100);
        p.fill(0);
        p.text("EARTH BUCKS:$ " + p.accessBucks(), w-550, h/4-100);
        p.imageMode(p.CENTER);
        p.image(earthBuck, w-150, h/4-100);
        
        
        if(scene2State == 1){
        textBox1.display();
        textBox1.update();
                
         //white rectangle with green stroke around it 
         p.rectMode(p.CENTER);
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/4-110, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/4-200, h-200, 50, 50, 5);
        p.textSize(14);
        p.fill(0);
        p.text("Cool!", w/4-50, h-200);
        }

        else if(scene2State == 2){
            textBox2.display();
            textBox2.update();
        //white rectangle with green stroke around it 
         p.rectMode(p.CENTER);
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/4-110, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/4-200, h-200, 50, 50, 5);
           p.fill(0);
             p.text("Of course!", w/4-150, h-200);
        }
        

        
        else if(scene2State == 3){
            p.image(watermelon, w/2-400, h/2);
            p.image(pizza, w/2+400, h/2);
            textBox3.display();
            textBox3.update();
        }

        //if you do the pizza do pizza text box
       else if(scene2State == 4){
            textBox4.display();
            textBox4.update();
                    
                   //white rectangle with green stroke around it 
         p.rectMode(p.CENTER);
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/4-110, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/4-200, h-200, 50, 50, 5);
        p.fill(0);
            p.text("Boohoo.", w/4-150, h-200);
        }
        
        //if you do watermelon do watermelon text box
       else if(scene2State == 5){
            textBox5.display();
            textBox5.update();
                    
                   //white rectangle with green stroke around it 
         p.rectMode(p.CENTER);
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/4-110, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/4-200, h-200, 50, 50, 5);
        p.fill(0);
            p.text("YIPPEEE!", w/4-150, h-200);
        }
    
   else if(scene2State == 6){
        textBox6.display();
        textBox6.update();
        
        p.image(egg, w/2-400, h/2);
        p.image(banana, w/2+400, h/2);
        
    }
    
    //if you choose egg
   else if(scene2State == 7){
        textBox7.display();
        textBox7.update();
                     //white rectangle with green stroke around it 
         p.rectMode(p.CENTER);
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/4-110, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/4-200, h-200, 50, 50, 5);
        p.fill(0);
            p.text("WAHOO!", w/4-150, h-200);
    }
    
    else if(scene2State == 8){
        textBox8.display();
        textBox8.update();
        
          //white rectangle with green stroke around it 
         p.rectMode(p.CENTER);
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/4-110, h-200, 300, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/4-200, h-200, 50, 50, 5);
        p.fill(0);
            p.text("YAAAAAS!", w/4-150, h-200);
    }
        
else if(scene2State == 9){
     textBox9.display();
        textBox9.update();
        
        p.image(pork, w/2-400, h/2);
        p.image(chicken, w/2+400, h/2);
}
        
//if you choose chicken        
else if(scene2State == 10){
    textBox10.display();
    textBox10.update();
    
       //white rectangle with green stroke around it 
         p.rectMode(p.CENTER);
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/4-110, h-200, 400, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/4-200, h-200, 50, 50, 5);
        p.fill(0);
            p.text("YAYY! LET'S GO!", w/4-150, h-200);
    
}
        
//if you choose chicken        
else if(scene2State == 11){
    textBox11.display();
    textBox11.update();
    
       //white rectangle with green stroke around it 
         p.rectMode(p.CENTER);
        p.strokeWeight(5);
        p.stroke(70, 168, 50);
        p.fill(255);
        p.rect(w/4-110, h-200, 400, 75, 5);
        //green rectangle 
        p.fill(70, 168, 50);
        p.noStroke();
        p.rect(w/4-200, h-200, 50, 50, 5);
        p.fill(0);
            p.text("ugh i guess", w/4-150, h-200);
}
        
    }
    
    public void mousePressed(){
if(p.dist(p.mouseX, p.mouseY, w/4-200, h-200)<= 50 && (scene2State == 1) && textBox1.isDone()){  
scene2State = 2;
kevin2.setCurrentTextBox(textBox2);
    }

else if(p.dist(p.mouseX, p.mouseY, w/4-200, h-200)<= 50 && (scene2State == 2) && textBox2.isDone()){  
scene2State = 3;
kevin2.setCurrentTextBox(textBox3);
    }

//if you click on pizza
if (p.dist(p.mouseX, p.mouseY, w/2+400, h/2)<=150 && (scene2State == 3) && textBox3.isDone()){
    kevin2.setCurrentTextBox(textBox4);
    scene2State = 4;
    pizzaTrue = true;
}
        
//IF YOU CLICK ON WATERMELON
if (p.dist(p.mouseX, p.mouseY, w/2-400, h/2)<=150 && (scene2State == 3) && textBox3.isDone()){
    kevin2.setCurrentTextBox(textBox5);
    scene2State = 5;
    watermelonTrue = true;
    p.increaseBucks(20);
}
        
//if button clicked move on to next choice after choice 1
if(p.dist(p.mouseX, p.mouseY, w/4-200, h-200)<= 50 && ((scene2State == 4) || (scene2State == 5))){
    scene2State = 6;
    kevin2.setCurrentTextBox(textBox6);
}

//if you choose egg
if(p.dist(p.mouseX, p.mouseY, w/2-400, h/2)<=150 && (scene2State == 6) && textBox6.isDone()){
    eggTrue = true;
    scene2State = 8;
    kevin2.setCurrentTextBox(textBox8);
        p.increaseBucks(15);
} //if you choose banana 
    else if(p.dist(p.mouseX, p.mouseY, w/2+400, h/2)<=150 && (scene2State == 6) && textBox6.isDone()){
        bananaTrue = true;
        scene2State = 7;
        kevin2.setCurrentTextBox(textBox7);
            p.increaseBucks(10);
    }
        
//if button clicked move onto next choice after choice 2 
if(p.dist(p.mouseX, p.mouseY, w/4-200, h-200)<= 50 && ((scene2State == 7) || (scene2State == 8))){
    scene2State = 9;
    kevin2.setCurrentTextBox(textBox9);
}
        
//if chicken chosen
if(p.dist(p.mouseX, p.mouseY, w/2+400, h/2)<=150 && (scene2State == 9) && textBox9.isDone()){
    chickenTrue = true;
    scene2State = 10;
    kevin2.setCurrentTextBox(textBox10);
    p.increaseBucks(30);
}      
        
//if pork chosen 
if(p.dist(p.mouseX, p.mouseY, w/2-400, h/2)<=150 && (scene2State == 9) && textBox9.isDone()){
    porkTrue = true;
    scene2State = 11;
    kevin2.setCurrentTextBox(textBox11);
    p.increaseBucks(0);
}

    
    }
    
    public void reset(){
        
    }
    
    public int returnvar(){
        return scene2State;
    }
    
        

    
    private earth_io p;
    private int scene2State;
    private int w;
    private int h;
   private PImage groceryBackground, earthBuck, watermelon, pizza, egg, banana, chicken, pork;
    private kevin kevin2;
    private textBox textBox1, textBox2, textBox3, textBox4, textBox5, textBox6, textBox7, textBox8, textBox9, textBox10, textBox11;
    private boolean pizzaTrue, watermelonTrue, bananaTrue, eggTrue, porkTrue, chickenTrue;
    
    
    
}