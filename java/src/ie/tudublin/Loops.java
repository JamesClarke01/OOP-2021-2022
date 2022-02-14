package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{


	int mode = -1;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		
	}

	public void keyPressed()
	{
		if (key >= '0' && key <='9')
		{
			mode = key - '0';
		}
		println(mode);
	}

	public void rainbowLoop()
	{
		for(int i = 0; i < 10; i++)
		{
			fill((255/10) * i, 255, 255);
			stroke((255/10) * i, 255, 255);
			rect(i*width/10, 0, width/10, height);  //x, y, w, h
		}

	}

	

	public void rainbowSquares()
	{
		for(int i = 0; i < 10; i++)
		{
			fill((255/10) * i, 255, 255);
			stroke((255/10) * i, 255, 255);
			rect(i*width/10, i * height/10, width/10, height/10);
			rect(width - (i * width/10), i * height/10, -width/10, height/10);
		}
	}

	public void circles()
	{
		for(int i = 10; i > 0; i--)
		{
			fill((255/10) * i, 255, 255);
			stroke((255/10) * i, 255, 255);
			circle(width/2, height/2, i * (width/10));
		}
	}

	public void starThing()
	{
		float angle = 360/5;
		background(0);
		stroke(0,255,255);
		line(width/2, height/2, width/2, 50);
	}

	
	public void draw()
	{
		switch(mode)	
		{
			case 0:
				clear();
				rainbowLoop();
				break;
			case 1:
				clear();
				rainbowSquares();
				break;
			case 2:
				clear();
				circles();
				break;
			case 3:
				clear();
				starThing();
				break;
		}
	}
}
