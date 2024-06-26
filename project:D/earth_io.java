

import processing.core.*;

import gifAnimation.*;

import processing.sound.*;


public class earth_io extends PApplet 
{


private Scene scene1;
private Scene scene2; 
private Scene scene3;
private Scene scene4;
private Scene scene5;
private Gif grocery, house, globe;
private textBox textBox1;
private boolean gifFinished = false;
private boolean gifFinished1 = false;
private boolean gifFinished2 = false;
private int startTime;
private PFont font1;
private SoundFile totoro, cash, kitchen, animalCrossing;

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
    grocery = new Gif(this, "grocery.gif");
    house = new Gif(this, "house.gif");
    globe = new Gif(this, "earth.gif");
    font1 = createFont("font1.ttf", 48);
    totoro = new SoundFile(this, "totoro.mp3");
    cash = new SoundFile(this, "cash.mp3");
    kitchen = new SoundFile(this, "kitchen.mp3");
    animalCrossing = new SoundFile(this, "animalCrossing.mp3");

    scene1 = new scene1(this, width, height);
    scene2 = new scene2(this, width, height);
    scene3 = new scene3(this, width, height);
    scene4 = new scene4(this, width, height);
    scene5 = new scene5(this, width, height);

}

public void draw(){


 if (gameState.equals("start")){
     drawStart();      
    }if (gameState.equals("scene1")){
    scene1.display();
 }
 //grocery gif display
  else if (gameState.equals("scene2") && !gifFinished) {
    background(255);
    image(grocery, width/2, height/2);
    textSize(24);
    textFont(font1);
    textAlign(CENTER);
    fill(0);
    text("Level 1 loading...", width/2, height-50);
    if (!grocery.isPlaying()) {
      grocery.play();
      startTime = millis(); // Start tracking time when the GIF starts playing
    }
    // Pause the GIF after 5 seconds
    if (millis() - startTime > 5000) {
      grocery.pause();
      gifFinished = true;
    } 
  } 
  else if (gameState.equals("scene2") && gifFinished) {
    background(255);

    scene2.display();
  }
   

//spinning earth gif display
  else if (gameState.equals("scene3") && !gifFinished1) {
    background(255);
    image(globe, width/2, height/2);
    textSize(24);
    textFont(font1);
    textAlign(CENTER);
    fill(0);
    text("Level 2 loading...", width/2, height-50);
    if (!globe.isPlaying()) {
      globe.play();
      startTime = millis(); // Start tracking time when the GIF starts playing
    }
    // Pause the GIF after 5 seconds
    if (millis() - startTime > 5000) {
      globe.pause();
      gifFinished1 = true;
    }
  } 
  else if (gameState.equals("scene3") && gifFinished1) {
    background(255);
    scene3.display();
  }


//house gif display
else if (gameState.equals("scene4") && !gifFinished2) {
    background(255);
    image(house, width/2, height/2);
    textSize(24);
    textFont(font1);
    textAlign(CENTER);
    fill(0);
    text("Level 3 loading...", width/2, height-50);
    if (!house.isPlaying()) {
      house.play();
      startTime = millis(); // Start tracking time when the GIF starts playing
    }
    // Pause the GIF after 5 seconds
    if (millis() - startTime > 5000) {
      house.pause();
      gifFinished2 = true;
    }
  } 
  else if (gameState.equals("scene4") && gifFinished2) {
    background(255);
    scene4.display();
  }if(gameState.equals("scene5")){
  scene5.display();
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
    totoro.play();
}

if(dist(mouseX, mouseY, width/4-200, height-200)<= 50 && scene2.returnvar()>= 10){
    gameState = "scene3";
    totoro.stop();
    animalCrossing.play();
}
//if scooter is chosen 
if(dist(mouseX, mouseY, width/2+210, height-350) <= 50 && scene3.returnvar()== 2){
gameState = "scene4";
totoro.stop();
 animalCrossing.stop();
kitchen.play();
}
if (dist(mouseX, mouseY,width/2-210, height-350) <= 50 && scene3.returnvar() == 3){
gameState = "scene4";
totoro.stop();
 animalCrossing.stop();
kitchen.play();
}if(dist(mouseX, mouseY, width/2+width/6, height-200)<= 50 && scene4.returnvar() == 17){
gameState = "scene5";
}
}




public void keyPressed(){

//override that takes you straight to scene 2
if(keyCode == 'A'){
gameState = "scene2";
totoro.play();
}
//override that takes you straight to scene 3 
if(keyCode == 'S'){
gameState = "scene3";
totoro.stop();
 animalCrossing.play();
}

if(keyCode == 'D'){
gameState = "scene4";
totoro.stop();
animalCrossing.stop();
kitchen.play();
}if(keyCode == 'F'){
gameState = "scene5";
}

}


public void increaseBucks(int n){
earthBucks+=n; 
cash.play();
}

public float accessBucks(){return earthBucks;}



    //MAIN FUNCTION
public static void main(String[] args)
 {

PApplet.main("earth_io");

}
  
}