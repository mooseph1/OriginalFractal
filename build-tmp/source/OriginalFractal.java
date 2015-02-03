import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

public void setup()
{
	size(600,600);
	noLoop();
}
public void draw()
{
	background(0);
	noFill();
	stroke(0,255,255);
	strokeWeight(2);
	circles(300,300,300);
}
public void circles(int x, int y, int radius)
{
	ellipse(x,y,radius,radius);
	if(radius >= 5)
	{
		circles(x - (int)(radius/2), y - (int)(radius/2), (int)(radius/2));
		circles(x - (int)(radius/2), y + (int)(radius/2), (int)(radius/2));
		circles(x + (int)(radius/2), y - (int)(radius/2), (int)(radius/2));
		circles(x + (int)(radius/2), y + (int)(radius/2), (int)(radius/2));
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
