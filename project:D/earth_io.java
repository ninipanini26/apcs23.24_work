

import processing.core.*;

//import gifAnimation.*;


public class earth_io extends PApplet 
{


private Scene scene1;
private Scene scene2; 
private Scene scene3;
private Scene scene4;

private PImage startButton, earth, background1, background2; //images
private int imageRadius = 250;

//set earth bucks to 0 initially 
private float earthBucks = 0;

public String gameState = "start"; //game state starts on start screen

    //setup function
public void settings()
{
fullScreen();
}

public void setup(){


    //images
    startButton = loadImage("startButton.png");
    earth = loadImage("earth.jpg");
    background2 = loadImage("background2.png");
    background2.resize(width, height);
      
    scene1 = new scene1(this, width, height);
    scene2 = new scene2(this, width, height);
    scene3 = new scene3(this, width, height);
    scene4 = new scene4(this, width, height);

}

public void draw(){


 if (gameState.equals("start")){
     drawStart();      
    }
if (gameState.equals("scene1")){
    scene1.display();
}if(gameState.equals("scene2")){
   scene2.display();
}if(gameState.equals("scene3")){
   scene3.display();
}if(gameState.equals("scene4")){
scene4.display();
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
if (gameState.equals("scene1")){
scene1.mousePressed();
}
else if (gameState.equals("scene2")){
scene2.mousePressed();
}

else if (gameState.equals("scene3")){
scene3.mousePressed();
}else if(gameState.equals("scene4")){
scene4.mousePressed();
}


if(dist(mouseX, mouseY,width/4-100, height-300)<= 50 && scene1.returnvar()>= 4){
    gameState = "scene2";
}

if(dist(mouseX, mouseY, width/4-200, height-200)<= 50 && scene2.returnvar()>= 10){
    gameState = "scene3";
}
//if scooter is chosen 
if(dist(mouseX, mouseY, width/2+210, height-350) <= 50 && scene3.returnvar()== 2){
gameState = "scene4";
}
if (dist(mouseX, mouseY,width/2-210, height-350) <= 50 && scene3.returnvar() == 3){
gameState = "scene4";
}
}




public void keyPressed(){

//override that takes you straight to scene 2
if(keyCode == 'A'){
gameState = "scene2";
}
//override that takes you straight to scene 3 
if(keyCode == 'S'){
gameState = "scene3";
}

if(keyCode == 'D'){
gameState = "scene4";
}

}


public void increaseBucks(int n){
earthBucks+=n; 
}

public float accessBucks(){return earthBucks;}



    //MAIN FUNCTION
public static void main(String[] args)
 {

PApplet.main("earth_io");

}
  
}