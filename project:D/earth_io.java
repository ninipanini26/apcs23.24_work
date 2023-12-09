//do i need to make a kevin function? (main character)

import processing.core.*;




public class earth_io extends PApplet 
{

private kevin kevin1;
private PImage startButton; //start button
private PImage earth; //earth for start screen
private int imageRadius = 393;

public String gameState = "start"; //game state starts on start screen

    //setup function
public void settings()
{
fullScreen();
}

public void setup(){

    kevin1 = new kevin(this, width/2, height/2);


    startButton = loadImage("startButton.png");
    earth = loadImage("earth.jpg");


}

public void draw(){


 if (gameState == "start"){
     drawStart();      
    }
if (gameState == "drawGame"){
    startPartOne();
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
if(dist(mouseX, mouseY, width/2, height/2) < imageRadius && gameState == "start"){ //gamestate equals start and start button clicked
gameState = "drawGame"; //go to part 1
}
}

//part 1 function
public void startPartOne(){
background(255);
kevin1.display();

}
    

    //MAIN FUNCTION
public static void main(String[] args)
 {

PApplet.main("earth_io");

}
  
}