import processing.core.PApplet;
import processing.core.PImage;


public class Sketch extends PApplet {
  
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 204, 203);

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() { 
  }

    public void mouseClicked() {
      PImage airplane = loadImage("airplane.png");
      airplane.resize(100,100);
      image(airplane, mouseX, mouseY);
    }


    public void mouseMoved() {
      if (mouseY > 400){
        fill(255, 255, 255);
      }
      else {
        fill(0,153,0);
      }

      ellipse(mouseX, mouseY, 100, 100);  
    }

    public void mouseDragged(){
      PImage clouds = loadImage("clouds.png");
      clouds.resize(100,100);
      image(clouds, mouseX, mouseY);
    }

    public void mousePressed(){
      if (mousePressed){
      PImage helicopter = loadImage("helicopter.jpg");
      helicopter.resize(50,50);
      image(helicopter, random(0,800), 100);
      }
    }
    public void mouseReleased(){
      PImage lightning = loadImage("lightning.png");
      lightning.resize(100,100);
      image(lightning, random(0,800), random(0,200));
    }

    public void mouseWheel(){
    fill(194,197,198); 
    rect(mouseX , mouseY,20,800);
   
    fill(194,197,198);
    rect(mouseX - 20, mouseY - 10, 20, 800);

    fill(194,197,198); 
    rect(mouseX + 20, mouseY - 10,20,800);

    }

    public void keyReleased(){
      textSize(100);
      fill(0);
      text("AIRPLANE", 100, 100);
    }

    public void keyPressed(){
      PImage E = loadImage("E.jpg");
      E.resize(100,100);
      PImage Enter = loadImage("Enter.png");
      Enter.resize(100,100);
      if (key == 'e'){
        image(E, random(0,800), random(0,800));
      }
      if (keyCode == ENTER){
        image(Enter, random(0,800), random(0,800));
      }
    }
}