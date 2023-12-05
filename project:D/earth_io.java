import processing.core.*;



public class earth_io extends PApplet 
{

private PImage startButton; //start button
private PImage earth; //earth for start screen
private int imageRadius = 393;

public int gameState = 0; //game state starts on start screen

    //setup function
public void settings()
{
fullScreen();
}

public void setup(){
    startButton = loadImage("startButton.png");
    earth = loadImage("earth.jpg");

}

public void draw(){


 if (gameState == 0){
     drawStart();      
    }
if (gameState == 1){
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
if(dist(mouseX, mouseY, width/2, height/2) < imageRadius && gameState == 0){ //gamestate equals 0 and start button clicked
gameState = 1; //go to part 1
}

}

//part 1 function
public void startPartOne(){
background(255);

}
    

    //MAIN FUNCTION
public static void main(String[] args)
 {

PApplet.main("earth_io");

}
  
}