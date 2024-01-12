//do i need to make a kevin function? (main character)

import processing.core.*;

import gifAnimation.*;


public class earth_io extends PApplet 
{

private kevin kevin1;
private textBox textBox1, textBox2;
private PImage startButton; //start button
private PImage earth; //earth for start screen
private int imageRadius = 250;


private int scene1State = 1;



public String gameState = "start"; //game state starts on start screen

    //setup function
public void settings()
{
fullScreen();
}

public void setup(){


    kevin1 = new kevin(this, width/4, height/2+100);


    startButton = loadImage("startButton.png");
    earth = loadImage("earth.jpg");
    
    
    
    
    
    textBox1 = new textBox(this, width/4, height/4, 500, 369,  "HELLO I'M KEVIN AND WELCOME TO EARTH! OUR PLANET IS WARMING UP A LOT DUE TO SOMETHING I LEARNED ABOUT CALLED CLIMATE CHANGE...");
    
     textBox2 = new textBox(this, width/4, height/4+50, 700, 400, "GLOBAL WARMING IS THE LONG-TERM WARMING OF THE PLANET'S OVERALL TEMPERATURE. THOUGH THIS WARMING TREND HAS BEEN GOING ON FOR A LONG TIME, ITS PACE HAS SIGNIFICANTLY INCREASED IN THE LAST HUNDRED YEARS DUE TO THE BURNING OF FOSSIL FUELS.");
    

}

public void draw(){


 if (gameState.equals("start")){
     drawStart();      
    }
if (gameState.equals("scene1")){
    startScene1();
}
}


public void drawStart(){
background(255);
imageMode(CENTER);
image(earth, width/2, height/2);
image(startButton, width/2, height/2);


}

public void mouseClicked(){

//if mouse clicked on start button go to game state 1
if(dist(mouseX, mouseY, width/2, height/2) <= imageRadius && gameState == "start"){ //gamestate equals start and start button clicked
gameState = "scene1"; //go to part 1
}

if(dist(mouseX, mouseY,width/2-40, height-300)<= 50 && (scene1State == 1)){
scene1State = 2;
}

}

//part 1 function
public void startScene1(){

background(255);
kevin1.display();

if(scene1State == 1){


textBox1.display();
textBox1.update();
fill(0);
textSize(24);
text("what is climate change?", width/2, height-300);
rectMode(CENTER);
fill(70, 168, 50);
noStroke();
rect(width/2-40, height-300, 50, 50, 5);

} else if (scene1State == 2){
   
    textBox2.display();
    textBox2.update();
}
}
    

    //MAIN FUNCTION
public static void main(String[] args)
 {

PApplet.main("earth_io");

}
  
}