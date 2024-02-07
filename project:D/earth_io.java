

import processing.core.*;

import gifAnimation.*;


public class earth_io extends PApplet 
{


private Scene scene1;
private Scene scene2; 

private PImage startButton, earth, background1, background2; //images
private int imageRadius = 250;


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

}

public void draw(){


 if (gameState.equals("start")){
     drawStart();      
    }
if (gameState.equals("scene1")){
    scene1.display();
} if(gameState.equals("scene2")){
   scene2.display();
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

scene1.mousePressed();
System.out.println(scene1.returnvar());

if(dist(mouseX, mouseY,width/4-100, height-300)<= 50 && scene1.returnvar()>= 4){
    gameState = "scene2";
}

}



    //MAIN FUNCTION
public static void main(String[] args)
 {

PApplet.main("earth_io");

}
  
}