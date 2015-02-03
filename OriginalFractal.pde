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