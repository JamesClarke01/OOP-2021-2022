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

	public void makeCircles()
	{	
		//float circles
		background(255);
		
		//float circleDie = width/10;
		int circles = (int) (mouseX/ 20.0f);
		float d = width /(float)circles;


		for(int i = 0; i < width; i++)
		{
			//fill((255/10) * i, 255, 255);
			//circle(map(i, 0, 10, 0 + circleDie/2, width - circleDie/2), circleDie, circleDie);
			fill(map(i, 0, circles, 0, 255), 255, 255);
			circle(map(i, 0, circles - 1, d/2.0f, width - (d/2.0f)), height/2, d);

		}

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
				//starThing();
				break;
			case 4:
				clear();
				makeCircles();
				break;
			case 5:
				background(0);
				colorMode(RGB);
				float border = width * 0.1f;
				for(int i= -5; i <= 5; i++)
				{
					float x = map(i, -5, 5, border, width-border);
					stroke(0, 255, 0);
					line(x, border, x, height-border);
					line(border, x, width-border, x);
					//line(border, x, x, height-border);
					//line(border, x, x, height-border);


				}
			case 6:
				float cx = width/2;
				float cy = height/2;

				float radius = 150;
				int sides = (int)map(mouseX, 1, width, 0, 20);
				for(int i = 1; i <= sides; i ++)
				{
					float theta1 = map(i - 1, 0, sides, 0, TWO_PI);
					float x1 = cx +sin(theta1) * radius;
					float y1 = cy + cos(theta1) * radius;

					float theta2 = map(i, 0, sides, 0, TWO_PI);
					float x2 = cx + sin(theta2) * radius;
					float y2 = cy + cos(theta2) * radius;
					line(x1, y1, x2,y2);
				}

				line(cx, cy, cx, cy - radius);





		}
	}
}
