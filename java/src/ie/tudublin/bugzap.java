package ie.tudublin;

import processing.core.PApplet;

public class bugzap extends PApplet
{

	public void settings() //setting screen size
	{
		size(500, 500);

	}

	float playerX;
	float playerY;
	float playerWidth;
	float playerHeight;
	float playerSpeed = 10;

	public void setup()
	{
		colorMode(RGB);
		background(0);

		playerWidth = 60;
		playerHeight = 30;
		playerX = width/2;
		playerY = height;
		
		
	}

	public void drawPlayer(float x, float y, float w, float h)
	{
		//stroke(250);
		strokeWeight(0);
		rectMode(CENTER);

		fill(247, 37, 247);
		
		//player 
		rect(x, y-h/4, w, h/2);
		rect(x, y - h/2 - h/4, w/2, h/2);


		// rect(x, y - w/4, w, w/2);

		// rect(x, y- w/2 - w/8 , w/2, w/4);
		
	}

	public void drawLaser(float px, float py, float playerHeight)
	{
		stroke(250);
		strokeWeight(10);
		line(px, py - playerHeight, px, 0);
	}

	public void draw()
	{	
		background(50, 10, 77);  
		drawPlayer(playerX, playerY, playerWidth, playerHeight);
		
	}

	public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			System.out.println("Left arrow pressed");
			
			if (playerX - playerWidth/2 > 0)
			{
				playerX -= playerSpeed;
			}
			else
			{
				playerX = 0 + playerWidth/2;
			}
			
		}
		if (keyCode == RIGHT)
		{
			System.out.println("Right arrow pressed");
			
			if (playerX + playerWidth/2 < width)
			{
				playerX += playerSpeed;
			}
			else
			{
				playerX = width - playerWidth/2;
			}
			
			
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");

			drawLaser(playerX, playerY, playerHeight);
		}
	}	
}
