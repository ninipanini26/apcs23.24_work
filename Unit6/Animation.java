import processing.core.*;
import java.util.*;

public class Animation extends PApplet 
{

public void settings(){

size(600,600);

}public void setup(){

drops = new ArrayList<Raindrop>();

for (int i = 0; i < 100; i++){
    addDrop();
}



}public void addDrop(){
    float x = random(width);
    float y = random(height);
    float h = 40;
    float w = 1.25f;
    float vy = random(3, 5);
    Raindrop r = new Raindrop(this, x, y, w, h, vy);
    drops.add(r);

}

public void draw(){
background(25);

   
for(Raindrop r:drops){
r.display();
r.update();
}


} private ArrayList<Raindrop> drops;

 public static void main(String[] args)
    {
        PApplet.main("Animation");
    }
}